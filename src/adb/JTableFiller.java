/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adb;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author austine
 */
public class JTableFiller {
    public static void fillJTable(DefaultTableModel model, String tableName) {
    try {
      // Connect to the database
      Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AmazingDessertBar", "postgres", "1234");

      // Create a statement to execute the query
      Statement statement = connection.createStatement();

      // Execute the query
      ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

      // Get the metadata about the columns in the table
      ResultSetMetaData metaData = resultSet.getMetaData();
      int columnCount = metaData.getColumnCount();

      // Remove all the previous data from the model
      model.setRowCount(0);

      // Iterate through the result set and add each row to the model
      while (resultSet.next()) {
        Object[] rowData = new Object[columnCount];
        for (int i = 0; i < columnCount; i++) {
          rowData[i] = resultSet.getObject(i + 1);
        }
        model.addRow(rowData);
      }

      // Close the result set, statement, and connection
      resultSet.close();
      statement.close();
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

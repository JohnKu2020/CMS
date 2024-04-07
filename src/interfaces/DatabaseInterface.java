/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.sql.ResultSet;

/**
 * @author  Yevhen K
 */

/**
* This Interface is dedicated to connect to different DataBase engines
*/
public interface DatabaseInterface {
    void connect();
    void makeQuery(String query);
    ResultSet getResultSet(String query);
    void disconnect();
}

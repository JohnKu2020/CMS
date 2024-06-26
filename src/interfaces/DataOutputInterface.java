/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import cms.Config;

/**
 * @author  Yevhen K
 */

/**
* This Interface is dedicated to handle different types of output
* such as "A txt file", "A csv file", "Output to the NetBeans Console"
*/
public interface DataOutputInterface {
    void GenerateCourseReport( Config.outputFormat  outputFormat);
    void GenerateStudentReport( Config.outputFormat  outputFormat );
    void GenerateLecturerReport(Config.outputFormat  outputFormat );
    void GenerateLecturerReportOwn(Config.outputFormat  outputFormat );
}

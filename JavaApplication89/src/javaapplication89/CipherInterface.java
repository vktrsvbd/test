/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

import java.io.File;

/**
 *
 * @author Student
 */
public interface CipherInterface {
void cipher(String string);
void cipher(File file);
void decipher(String string);
void decipher(File file);
}

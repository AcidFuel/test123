/**
* Устанавливаем принадлежность класса к пакету
*/
package mainPackage;
/**
* Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.*;
/**
 * Объявляем класс
 */
public class Calculator {
/**
 * Объявляем переменную "Количество суток" и присваиваем ей 0
 */
private static double countnight = 0;
/**
* Объявляем переменные "Количество людей", "Коэффициент надбавки к стоимости транспорта",
 * "коэффициент надбавки к стоимости питания", "стоимость проживания одного человека за сутки"
* "Стоимость транспорта", "Стоимость питания", "Процент"
*/
private static double countpeople, constantatransport, constantafood, priceonetourist, pricetransport,  pricefood, procent;
/**
 * Объявляем переменную "Стоимость тура"
*/
private static String tourcost;
/**
 * Объявляем метод по расчету стоимости тура
 */
private static String SetToutCost(double countnight, double countpeople, double constantatransport, double constantafood, double priceonetourist, double pricetransport, double pricefood, double procent) {
/**
 * Объявляем переменную, которая будет возвращена
 */
String strtourcost = null;
/**
* Объявляем переменную, в которой будет храниться стоимость тура
 */
double settourcost = 0;
/**
 * Высчитываем стоимость тура
 */
settourcost = ((priceonetourist * countnight * countpeople) + (pricetransport * countpeople * constantatransport) + (pricefood * countpeople * countnight * constantafood)) * procent;
/**
 * присваиваем новое значение
*/
strtourcost = Double.toString(settourcost);
/**
 * Возвращаем стоимость тура
*/
return strtourcost;
}
/**
* Объявляем геттер для получения процента
 */
public static double getprocent() {
return procent;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "Процент"
*/
public static void setprocent(JTextField textFieldProcent) {
procent = Double.parseDouble(textFieldProcent.getText()) / 100 + 1;
}
/**
* Объявляем геттер для получения стоимости питания
 */
public static double getpricefood() {
return pricefood;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "Процент"
 */
public static void setpricefood(JTextField textFieldFoodPrice) {
pricefood = Double.parseDouble(textFieldFoodPrice.getText());
}
/**
* Объявляем геттер для получения стоимости транспорта
*/
public static  double getpricetransport() {
return pricetransport;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "Стоимость транспорта"
 */
public static void setpricetransport(JTextField textFieldTransportPrice) {
pricetransport = Double.parseDouble(textFieldTransportPrice.getText());
}
/**
 * Объявляем геттер для получения стоимости проживания для одного человека за сутки
*/
public static  double getpriceonetourist() {
return priceonetourist;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "стоимость проживания одного человека за сутки"
*/
public static void setpriceonetourist(JTextField textFieldTourPrice) {
priceonetourist = Double.parseDouble(textFieldTourPrice.getText());
}
/**
 * Объявляем геттер для получения количества людей
 */
public static double getcountpeople() {
return countpeople;
}
/**
 * Объявляем сеттер присваивания нового значения для переменной "Количество людей"
 */
public void setcountpeople(JTextField textField1) {
countpeople = Double.parseDouble(textField1.getText());
}
/**
 * Объявляем геттер для получения количество суток
 */
public static double getcountnight() {
return countnight;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "Количество суток"
*/
public void setcountnight(JTextField textField) {
countnight = Double.parseDouble(textField.getText());
}
/**
* Объявляем сеттер присваивания нового значения для переменной "стоимость проживания одного человека за сутки"
 */
public static void setcountnight(int i) {
countnight = i;
}
/**
* Объявляем геттер для получения коэффициента надбавки к стоимости транспорта
*/
public static double getconstantatransport() {
return constantatransport;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "коэффициента надбавки к стоимости транспорта"
 */
public void setconstantatransport(double setcontransp) {
constantatransport = setcontransp;
}
/**
* Объявляем геттер для получения коэффициента надбавки к стоимости питания
*/
public static double getconstantafood() {
return constantafood;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "коэффициента надбавки к стоимости питания"
*/
public void setconstantafood(double setconfood) {
constantafood = setconfood;
}
/**
* Объявляем геттер для получения стоимости тура
*/
public static String getTourcost() {
return tourcost;
}
/**
* Объявляем сеттер присваивания нового значения для переменной "стоимости тура"
 */
public static void setTourcost(int i) {
/**
* Если индекс равен 1, то присваиваем новое значение
 */
if (i == 1) {
/**
 * Присваиваем новое значение
 */
tourcost = SetToutCost(getcountnight(), getcountpeople(), getconstantatransport(), getconstantafood(), getpriceonetourist(), getpricetransport(), getpricefood(), getprocent());
}
/**
* Если равен нулю
 */
else if (i == 0) {
/**
 * деинициализируем
*/
tourcost = null;
}
}
}
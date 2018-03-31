/**
* Устанавливаем принадлежность класса к пакету
*/
package mainPackage;
/**
* Подключаем библиотеку для работы с графическим интерфейсом
 */
import java.awt.*;
/**
* Подключаем класс событий
 */
import java.awt.event.ActionEvent;
/**
* Подключаем класс прослушки
*/
import java.awt.event.ActionListener;

/**
* Подключаем библиотеку для работы с графическим интерфейсом
*/
import javax.swing.*;

import classPackage.classAdminFrame;
/**
 * Подключаем класс для доступа к переменным и методам в нем
 */
import classPackage.classModeFrame;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class ModeFrame extends classModeFrame {
/**
 * Конструктор класса
 */
public ModeFrame() {
/**
 * Объявляем экземпляр класса
*/
new classModeFrame();
/**
 * Вызываем метод для перехода на форму обработки заявки
*/
gotoAdminFrame(button[0]);
/**
 * Вызываем метод для перехода на форму заполнения заявки
*/
gotoClientFrame(button[1]);
}
/**
 * Вызываем метод для перехода на форму обработки заявки
*/
public void gotoAdminFrame (JButton button){
/**
 * Устанавливаем прослушку на кнопку
 */
button.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
*/
public void actionPerformed(ActionEvent e) {
/**
* Закрыть текущую форму
 */
dispose();
/**
* Объявляем экземпляр класса со ссылкой на него
 */
AdminFrame AF = new AdminFrame();
/**
 * Вызываем сеттер для установления ответа на вопрос есть ли заявка
 */
AF.setAnswer1();
/**
 * Устанавливаем видимость
 */
AF.setVisible(true);
/**
 * Устанавливаем размеры
 */	
AF.setSize(445, 310);
/**
 * Помещаем окно в центр экрана
 */
AF.setLocationRelativeTo(null);
}
});
}
/**
* Вызываем метод для перехода на форму заполнения заявки
*/
public void gotoClientFrame (JButton button){
/**
* Устанавливаем прослушку на кнопку
 */
button.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {	
/**
 * Закрыть текущую форму
 */
dispose();
/**
 * Объявляем экземпляр класса со ссылкой на него
 */
ClientFrame CF = new ClientFrame();
/**
 * Устанавливаем видимость
 */
CF.setVisible(true);
/**
 * Устанавливаем размеры
 */
CF.setSize(425, 380);
/**
 * Помещаем окно в центр экрана
 */
CF.setLocationRelativeTo(null);
}
});
}
/**
 * Объявляем главный класс
 */
public static void main(String[] args) {
/**
* Доставка операции в главный поток
 */
EventQueue.invokeLater(new Runnable() {
/**
 * вызываем метод, с помощью которого код передается в другой класс для выполнения
 */
public void run() {
/**
* Блок программного кода, который требуется защитить от исключений
 */
try {
/**
* Объявляем экземпляр класса со ссылкой на него
 */
ModeFrame frame = new ModeFrame();
/**
 * Устанавливаем видимость
 */
frame.setVisible(true);
/**
 * Устанавливаем размеры
 */
frame.setSize(400, 310);
/**
* Помещаем окно в центр экрана
 */
frame.setLocationRelativeTo(null);
/**
 * Обработка возникающих исключений					
 */
} catch (Exception e) {
/**
* Вывод информации об исключения, как оно произошло и в какой строке кода.
*/
e.printStackTrace();
}
}
});
}
}

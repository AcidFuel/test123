/**
* Устанавливаем принадлежность класса к пакету
*/
package mainPackage;
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
/**
* Подключаем класс для доступа к переменным и методам в нем
 */
import classPackage.classClientFrame;
/**
* Объявляем класс, который наследует от родительского класса
 */
public class ClientFrame extends classClientFrame {
/**
 * Конструктор класса
*/
public ClientFrame() {
/**
* Объявляем экземпляр класса со ссылкой на него
 */
classClientFrame cCF = new classClientFrame();
/**
* Вызываем метод установки "включено" для одного из трех переключателей с входными параметрами
*/
cCF.selectRadioBtn(rdbtn[0], rdbtn[1], rdbtn[2]);
/**
* Вызываем метод отправки анкеты
 */
cCF.sendForm(btn[0], txtfield[0], txtfield[1], chckbx[0], chckbx[1], rdbtn[0], rdbtn[1], rdbtn[2]);
/**
* Вызываем метод получения стоимости тура с входными параметрами 	
*/
cCF.getTourCost(btn[2], txtfield[2]);
/**
* Вызываем метод для возврата на начальную форму
*/
gotoBack(btn[1]);
}
/**
* Объявляем метод для возврата на прежнюю форму
*/
public void gotoBack(JButton button) {
/**
 * Устанавливаем прослушку на кнопку
 */
button.addActionListener(new ActionListener () {
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
ModeFrame MD = new ModeFrame();
/**
 * Устанавливаем видимость
 */
MD.setVisible(true);
/**
* Устанавливаем размеры
 */
MD.setSize(400, 310);
/**
 * Помещаем окно в центр экрана
 */
MD.setLocationRelativeTo(null);
/**
 * Обнуляем стоимость тура
 */
Calculator.setTourcost(0);
}
});	
}
}


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
 * Подключаем пакет для доступа к классам
*/
import classPackage.*;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class AdminFrame extends classAdminFrame {
/**
 * Конструктор класса
 */
public AdminFrame() {
/**
 * Объявляем экземпляр класса c ссылкой на него
 */
classAdminFrame cAF = new classAdminFrame();
/**
 * Вызываем метод для отправки стоимости тура
 */
cAF.sendTourCost(button[0], label[2], answer2, textField[2], textField[3], textField[0], textField[1]);
/**
 * Вызываем метод для возврата на начальную форму
 */
gotoBack(button[1]);
}
/**
 * Объявляем метод для возврата на прежнюю форму
*/
public void gotoBack(JButton button) {
/**
 * Устанавливаем прослушку на кнопку
 */
button.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Закрываем текущую форму
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
}
});
}
}


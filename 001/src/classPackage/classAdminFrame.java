package classPackage;

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
/**
 * Подключаем класс для доступа к переменным и методам в нем
 */
import mainPackage.Calculator;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class classAdminFrame extends JFrame {
/**
 * Объявили переменную для ответа на вопрос есть заявка или нет
 * Ответ отрицательный
 */
protected String answer2 = "Нет!";
/**
* Объявили переменную для ответа на вопрос есть заявка или нет
 * Ответ положительный
 */
private String answer1 = "Да!";
/**
 * Объявляем массив из двух кнопок, который может быть использован потомком
*/
protected JButton[] button = new JButton [2];
/**
* Объявляем массив из семи меток, который может быть использован потомком
*/
protected JLabel[] label = new JLabel[7];
/**
* Объявляем массив из четырех полей для ввода текста, который может быть использован потомком
 */	
protected JTextField[] textField = new JTextField[4];
/**
 * Объявляем массив из строк для того,
* чтобы подписать кнопки
*/
protected String[] text = {"Расcчитать и отправить стоимость тура", "Выйти из режима",
"Расчёт стоимости тура", "Заявка есть? -", answer2, "Стоимость проживания одного туриста за сутки -",
"Стоимость перевозки туда и обратно -", "Стоимость питания -", "Маржинальный доход (в процентах) -",};
/**
* Объявляем массив координат расположения для
* кнопок, меток, полей для ввода текста
*/
protected Integer[] coordxy = {0, 270, 110, 0, 90, 0, 0, 0, 0, 310, 250, 135, 240,
 200, 200, 0, 30, 30, 60, 90, 120, 150, 60, 90, 120, 150};
/**
* Объявляем массив размера для
* кнопок, меток, полей для ввода текста
*/
protected Integer[] scale = {255, 140, 285, 120, 50, 340, 240, 130, 235, 50,
30};
/**
* Объявляем массив размер шрифтов для
* кнопок, меток, полей для ввода текста
*/
protected Integer[] size = {13, 13, 20, 14, 16, 14, 14, 14, 14, 14};
/**
* Объявляем метод по установке кнопок
*/
public void setJButton(int i, JPanel panel) {
/**
 * Инициализируем переменную			
*/	
button[i] = new JButton();
/**
* Устанавливаем текст на кнопку			
*/
button[i].setText(text[i]);
/**
 * Устанавливаем координаты и размеры кнопок			
 */	
button[i].setBounds(coordxy[i], coordxy[i + 13], scale[i], scale[10]);
/**
* Форматируем текст на кнопках			
*/	
button[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[i]));
/**
 * устанавливаем кнопку на панель			
*/
panel.add(button[i]);
}
/**
* Объявляем метод по установке меток
*/
protected void setJLabel(int i, JPanel panel) {
/**
 * Инициализируем переменную			
*/	
label[i] = new JLabel();
/**
* Устанавливаем текст на метку			
 */	
label[i].setText(text[i + 2]);
/**
 * Устанавливаем координаты и размеры меток			
*/	
label[i].setBounds(coordxy[i + 2], coordxy[i + 15], scale[i + 2], scale[10]);	
/**
* Форматируем текст на метких		
*/	
label[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[i + 2]));
/**
 * Устанавливаем метку на панель			
*/	
panel.add(label[i]);
}
/**
* Объявляем метод по установке полей для ввода текста
*/	
protected void setJTextField(int i, JPanel panel) {
/**
 * Инициализируем переменную			
 */
textField[i] = new JTextField();
/**
 * Устанавливаем координаты и размеры полей для ввода текста			
*/
textField[i].setBounds(coordxy[i + 9], coordxy[i + 22], scale[9], scale[10]);
/**
* Устанавливаем формат для текста в поле		
*/
textField[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[9]));
/**
* Устанавливаем поле для ввода текста на панель			
 */	
panel.add(textField[i]);
}
/**
 * Объявляем метод по установке панели
*/
public JPanel setPanel (JPanel panel, int x, int y, int width, int height) {	
/**
 * Устанавливаем координаты и размер панели		
 */	
panel.setBounds(x, y, width, height);
/**
 * Не используем менеджер компоновки
 * Для возможности самому располагать компоненты
 * По координатам
 */
panel.setLayout(null);
/**
 * Указываем, что метод будет возвращать панель
 */
return panel;
}
/**
 * Конструктор класса
 */
public classAdminFrame() {
/**
 * Создали экземпляр панели
 */
JPanel panel = new JPanel();
/**
 * Говорим, что отсутствует менеджер компоновки
 * На панели содержимого окна
 */
getContentPane().setLayout(null);
/**
* Вызываем метод установки панели и передаем ему значения для входных параметров	
 */
setPanel(panel, 10, 11, 415, 240);
/**
 * Устанавливаем панель на панель содержимого окна	
 */
getContentPane().add(panel);
/**
 * Запускаем цикл для установки графических элементов поочередно		
 */
for (int i = 0; i < 7; i++){
/**
 * Проверяем индекс для того,
 * Чтобы не превысить размерность массива кнопок
 */
if (i < 2) {
/**
 * Вызываем метод по установке кнопки
 */
setJButton(i, panel);
/**
 * Вызываем метод по установке меток
 */
setJLabel(i, panel);
/**
 * Вызываем метод по установке полей для ввода текста
 */
setJTextField(i, panel);
}
/**
 * Проверяем индекс для того,
 * Чтобы не превысить размерность массива полей для ввода текста
 */
else if (i >= 2 && i < 4) {
/**
* Вызываем метод по установке меток
 */
setJLabel(i, panel);
/**
 * Вызываем метод по установке полей для ввода текста
 */
setJTextField(i, panel);
}
/**
* Проверяем условие для того,
* Чтобы не превысить размерность массива меток4
 */
else if (i >= 4) {
/**
 * Вызываем метод по установке меток
 */
setJLabel(i, panel);
}
}
}
/**
 * Объявляем геттер для получения ответа на вопрос есть ли заявка
*/
public String getAnswer1() {
/**
 * Указываем, что метод будет возвращать переменную
 */
return answer1;
}
/**
* Объявляем сеттер для установления ответа на вопрос есть ли заявка
*/
public void setAnswer1() {
/**
* Получаем количество ночей и сравниваем с нулем
* Если больше нуля, то заявка есть
 * Иначе заявки нет
 */
if (Calculator.getcountnight() > 0) {
/**
* Устанавливаем текст на метку
*/
this.label[2].setText(this.answer1);
}
}
/**
 * Объявляем метод, который проверяет есть ли заявка
 * Если есть, то обрабатываем и отправляем клиенту стоимость тура
*/
public void sendTourCost(JButton button, JLabel label, String answer2, JTextField textFieldFoodPrice, JTextField textFieldProcent,
JTextField textFieldTourPrice, JTextField textFieldTransportPrice) {
/**
* Устанавливаем прослушку на кнопку
 */
button.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Проверяем, чтобы заявка не отсутствовала
 */
if (label.getText() != answer2) {
/**
* Проверяем, чтобы поля для ввода текста не содержали нули
 */
if (!textFieldFoodPrice.getText().equals("0")
&&!textFieldProcent.getText().equals("0")
&&!textFieldTourPrice.getText().equals("0") &&textFieldTransportPrice.getText().equals("0")) {
/**
* Проверяем, чтобы поля для ввода текста не были пустыми
 */
if(!textFieldFoodPrice.getText().equals(null)
&& !textFieldFoodPrice.getText().isEmpty()
&& !textFieldProcent.getText().equals(null)
&& !textFieldProcent.getText().isEmpty()
&& !textFieldTourPrice.getText().equals(null)
&& !textFieldTourPrice.getText().isEmpty()
&& !textFieldTransportPrice.getText().equals(null)
&& !textFieldTransportPrice.getText().isEmpty() ) {
/**
* Используем регулярные выражение для проверки текста по шаблону
* То есть должны быть только цифры
*/
if (textFieldTourPrice.getText().matches("^\\d*$")
&& textFieldTransportPrice.getText().matches("^\\d*$")
&& textFieldFoodPrice.getText().matches("^\\d*$")
&& textFieldProcent.getText().matches("^\\d*$")) {
/**
* Вызываем сеттер для установки
* Нового значения стоимости проживания для одного человека за одну ночь
*/
Calculator.setpriceonetourist(textFieldTourPrice);
/**
 * Вызываем сеттер для установки
* Нового значения стоимости поездки туда и обратно для одного человека
*/
Calculator.setpricetransport(textFieldTransportPrice);
/**
* Вызываем сеттер для установки
* Нового значения стоимости питания для одного человека за один день
*/
Calculator.setpricefood(textFieldFoodPrice);
/**
* Вызываем сеттер для установки процента
*/
Calculator.setprocent(textFieldProcent);
/**
 * Вызываем сеттер для расчета стоимости тура
 */
Calculator.setTourcost(1);
/**
* Выводим сообщение об успешной отправке сообщения
*/
JOptionPane.showOptionDialog(null, "Стоимость тура отправлена!","Информация о заявке", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
/**
* Если текст в полях для ввода текста не соответствует шаблону
*/
else {
/**
* То выводим сообщение о том, что заявка была неправильно обработана
*/
JOptionPane.showOptionDialog(null, "Обработайте правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}	
}
/**
* Если поля для ввода текста пусты
*/
else {
/**
 * То выводим сообщение о том, что заявка была неправильно обработана
*/
JOptionPane.showOptionDialog(null, "Обработайте правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
/**
 * Если поля для ввода текста содержат нули
 */
else {
/**
 * То выводим сообщение о том, что заявка была неправильно обработана
 */
JOptionPane.showOptionDialog(null, "Обработайте правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
/**
* Если заявка отсутствует
*/
else {
/**
 * То выводим сообщение о том, что заявки нет
 */
JOptionPane.showOptionDialog(null, "Заявки нет!","Информация", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
});		
}	
}


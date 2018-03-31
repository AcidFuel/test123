package classPackage;
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
/**
 * Подключаем класс для доступа к переменным
 */
import mainPackage.Calculator;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class classClientFrame extends JFrame {
/**
 * Создание экземпляра класса со ссылкой на него
 */
Calculator calc = new Calculator();
/**
 *  Объявляем массив из трех кнопок, который может быть использован потомком
 */
protected JButton[] btn = new JButton [3];
/**
 *  Объявляем массив из пяти меток, который может быть использован потомком
*/
protected JLabel[] lbl = new JLabel[5];
/**
* Объявляем массив из трех полей для ввода текста, который может быть использован потомком
 */	
protected JTextField[] txtfield = new JTextField[3];
/**
* Объявляем массив из двух флажков, который может быть использован потомком
*/	
protected JCheckBox[] chckbx = new JCheckBox[2];
/**
* Объявляем массив из трех переключателей, который может быть использован потомком
*/
protected JRadioButton[] rdbtn = new JRadioButton[3];
/**
* Объявляем массив из строк для того,
* чтобы подписать кнопки, метки, флажки, переключатели
*/	
protected String[] text = {"Отправить заявку", "Выйти из режима", "Получить стоимость тура", "Количество суток - ",
"Количество людей - ", "Выберите тип перевозки: ", "Выберите тип организации питания: ", "Стоимость тура - ",
"Авиаперелет", "Круиз",
"Завтрак, обед и ужин", "Завтрак и обед", "Только завтрак"};
/**
* Объявляем массив координат расположения
 * кнопок, меток, полей для ввода текста, флажков, переключателей
 */	
protected Integer[] coordxy = {0, 195, 0, 0, 0, 0, 0, 0, 130, 130, 110, 160, 160, 230, 230, 230,
220, 220, 255, 0, 40, 80, 135, 290, 0, 40, 290, 80, 105, 135, 160, 186};
/**
* Объявляем массив размера
* кнопок, меток, полей для ввода текста, флажков, переключателей
*/
protected Integer[] scale = {190, 190, 385, 160, 170, 165, 235, 110, 110, 65, 160, 120, 120,
30};
/**
* Объявляем метод по установке кнопок
 */
public void setButton(int i, JPanel panel) {
/**
* Инициализируем переменную			
*/	
btn[i] = new JButton();
/**
* Устанавливаем текст на кнопку			
*/
btn[i].setText(text[i]);
/**
 * Устанавливаем координаты и размеры кнопок			
 */	
btn[i].setBounds(coordxy[i], coordxy[i + 16], scale[i], scale[13]);
/**
 * Форматируем текст на кнопках			
 */
btn[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
/**
 * устанавливаем кнопку на панель			
*/
panel.add(btn[i]);
}
/**
* Объявляем метод по установке меток
*/
public void setLabel(int i, JPanel panel) {	
/**
 * Инициализируем переменную			
 */
lbl[i] = new JLabel();
/**
* Устанавливаем текст на метку
 */	
lbl[i].setText(text[i + 3]);
/**
* Устанавливаем координаты и размеры меток			
*/	
lbl[i].setBounds(coordxy[i + 3], coordxy[i + 19], scale[i + 3], scale[13]);
/**
* Форматируем текст на метких		
 */
lbl[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
/**
 * устанавливаем метку на панель			
 */
panel.add(lbl[i]);
}
/**
* Объявляем метод по установке полей для ввода текста
*/
public void setTextField(int i, JPanel panel) {
/**
* Инициализируем переменную			
 */
txtfield[i] = new JTextField();
/**
* Устанавливаем координаты и размеры полей для ввода текста			
 */
txtfield[i].setBounds(coordxy[i + 8], coordxy[i + 24], 50, 30);
/**
* Устанавливаем формат для текста в поле		
 */	
txtfield[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
/**
 * устанавливаем поле для ввода текста на панель			
 */	
panel.add(txtfield[i]);
}
/**
* Объявляем метод по установке флажков
*/
public void setCheckBox(int i, JPanel panel) {
/**
* Инициализируем переменную			
 */
chckbx[i] = new JCheckBox();
/**
 * Устанавливаем текст на флажки			
 */
chckbx[i].setText(text[i + 8]);
/**
* Устанавливаем координаты и размеры флажков			
 */	
chckbx[i].setBounds(coordxy[i + 11], coordxy[i + 27], scale[i + 8], scale[13]);
/**
 * Форматируем текст на флажках		
 */	
chckbx[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
/**
* устанавливаем флажок на панель			
 */	
panel.add(chckbx[i]);
}
/**
 * Объявляем метод по установке переключателей
 */
public void setRadioButton(int i, JPanel panel) {
/**
 * Инициализируем переменную			
 */
rdbtn[i] = new JRadioButton();
/**
 * Устанавливаем текст на переключатей			
 */
rdbtn[i].setText(text[i + 10]);
/**
 * Устанавливаем координаты и размеры переключателей			
 */
rdbtn[i].setBounds(coordxy[i + 13], coordxy[i + 29], scale[i + 10], scale[13]);
/**
 * Форматируем текст на переключателях		
 */	
rdbtn[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
/**
 * устанавливаем переключатель на панель			
*/
panel.add(rdbtn[i]);
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
 * Передаем менеджеру компановки отстутвие метода компановка
 * Для возможности самому располагать компоненты
 */	
panel.setLayout(null);
/**
 * Указываем, что метод будет возвращать переменную
 */
return panel;
}
/**
* Объявляем метод установки "включено" для одного из трех переключателей с входными параметрами
*/
public void selectRadioBtn(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3) {
/**
* Устанавливаем прослушку на первый переключатель
 */
radio1.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Если первый переключатель включен
 */
if (radio1.isSelected()) {
/**
 * То второй переключателей выключен
 */
radio2.setSelected(false);
/**
 * То третий переключатель выключен
 */
radio3.setSelected(false);
}
}
});
/**
* Устанавливаем прослушку на второй переключатель
*/
radio2.addActionListener(new ActionListener() {
/**
* Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Если второй переключатель включен
*/
if (radio2.isSelected()) {
/**
 * То первый переключатель выключен
 */
radio1.setSelected(false);
/**
* То третий переключатель выключен
 */
radio3.setSelected(false);
}
}
});
/**
* Устанавливаем прослушку на третий переключатель
 */
radio3.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
*/
public void actionPerformed(ActionEvent e) {
/**
 * Если третий переключатель включен
 */
if (radio3.isSelected()) {
/**
 * То второй переключателей выключен
 */
radio2.setSelected(false);
/**
 * То первый переключатель выключен
 */
radio1.setSelected(false);
}
}
});
}
/**
 * Объявляем метод отправки анкеты
*/
public void sendForm(JButton button, JTextField textField, JTextField textField1, JCheckBox checkBox, JCheckBox checkBox1,
JRadioButton radioBtn, JRadioButton radioBtn1, JRadioButton radioBtn2) {
/**
* Устанавливаем прослушку на кнопку
*/
button.addActionListener(new ActionListener() {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Проверяем, чтобы поля для ввода текста не были равны нулю
 */
if (!textField.getText().equals("0") && !textField1.getText().equals("0")) {
/**
 * Проверяем не пусты ли поля для ввода текста
*/
if (!textField.getText().equals(null) && !textField1.getText().isEmpty()
&& !textField.getText().equals(null) && !textField1.getText().isEmpty()) {
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет, круиз и "Завтрак, обед и ужин"
 */
if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.56, 1.5);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет, круиз и "Завтрак и обед"
*/
else if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.56, 1.3);	
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет, круиз и "Только завтрак"
*/
else if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
 */
getValue(textField, textField1, 1.56, 1.1);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет и "Завтрак, обед и ужин"
*/
else if (checkBox.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.2, 1.5);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет и "Завтрак и обед"
*/
else if (checkBox.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.2, 1.3);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали авиперелет и " Только завтрак"
*/
else if (checkBox.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.2, 1.1);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали круиз и "Завтрак, обед и ужин"
*/
else if (checkBox1.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.3, 1.5);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали круиз и "Завтрак и обед"
*/
else if (checkBox1.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.3, 1.2);
}
/**
* Проверяем, чтобы поля для ввода текста состояли только из цифр
* Если выбрали круиз и "Только завтрак"
*/
else if (checkBox1.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {
/**
* Вызываем метод для получения значений
*/
getValue(textField, textField1, 1.3, 1.1);
}
/**
 * Если поля состоят из букв и символов,
* не был выбран тип перевозки
* и не был выбран тип организации питания то
 */
else {
/**
* Выводим сообщение об ошибке
 */
JOptionPane.showOptionDialog(null, "Заполните правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}	
}
/**
* Если поля для ввода тексты пуста
*/
else {
/**
 * Выводим сообщение об ошибке
*/
JOptionPane.showOptionDialog(null, "Заполните правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
/**
* Если поля содержат нули
*/
else {
/**
 * Выводим сообщение об ошибке
*/
JOptionPane.showOptionDialog(null, "Заявка пуста!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
});
}
/**
* Объявляем метод получения значений
*/
public void getValue(JTextField textField, JTextField textField1, double setcontransp, double setconfood) {
/**
* Вызываем сеттер для константы транспорта
*/
calc.setconstantatransport(setcontransp);
/**
* Вызываем сеттер для константы еды
 */
calc.setconstantafood(setconfood);
/**
 * Вызываем сеттер для количества ночей
*/
calc.setcountnight(textField);
/**
* Вызываем сеттер для количества людей
 */
calc.setcountpeople(textField1);
/**
* Выводим сообщение об успешной отправки сообщения
 */
JOptionPane.showOptionDialog(null, "Заявка отправлена!","Информация о заявке", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
/**
* Объявляем метод получения стоимости тура с входными параметрами
*/
public void getTourCost(JButton button, JTextField textField) {
/**
 * Устанавливаем прослушку на кнопку
*/
button.addActionListener(new ActionListener () {
/**
 * Объявляем метод событий
 */
public void actionPerformed(ActionEvent e) {
/**
 * Проверяем если стоимость тура не пуста
 */
if (Calculator.getTourcost() != null) {
/**
 * То округляем стомость тура до сотых
 * Устанавливаем текст о стоимости тура в поле для ввода теста
 */
textField.setText(Double.toString((Math.rint(100 *Double.parseDouble(Calculator.getTourcost())) / 100)));
}
/**
* Если стоимость тура пуста то
*/
else {
/**
* Выводим ошибку
 */
JOptionPane.showOptionDialog(null, "Заявка не обработана либо вы еще не отправили заявку","Информация о туре", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
/**
* Удаляем прошлую заявку
 */
Calculator.setcountnight(0);
}
});
}	
/**
* Конструктор класса
*/
public classClientFrame() {
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
setPanel(panel, 10, 11, 415, 320);
/**
* Устанавливаем панель на панель содержимого окна	
*/
getContentPane().add(panel);
/**
 * Запускаем цикл для установки графических элементов поочередно		
 */
for (int i = 0; i < 5; i++) {
/**
 * Проверяем индекст для того,
 * чтобы не выйти за размерность массива флажков	
 */	
if (i < 2) {
/**
 * Вызываем метод по установке кнопки
 */
setButton(i, panel);
/**
 * Вызываем метод по установке меток
 */
setLabel(i, panel);
/**
 * Вызываем метод по установке полей для ввода текста
*/
setTextField(i, panel);
/**
 * Вызываем метод по установке флажков
 */
setCheckBox(i, panel);
/**
* Вызываем метод по установке переключателей
*/
setRadioButton(i, panel);
}
/**
 * Проверяем индекс для того,
 * чтобы не выйти за размерность массива кнопок,
 * полей для ввода текста,
 * переключателей	
 */
else if (i == 2) {
/**
 * Вызываем метод по установке кнопки
 */
setButton(i, panel);
/**
 * Вызываем метод по установке меток
 */	
setLabel(i, panel);
/**
 * Вызываем метод по установке полей для ввода текста
 */
setTextField(i, panel);
/**
 * Вызываем метод по установке переключателей
 */
setRadioButton(i, panel);
}
/**
 * Устанавливаем все остальные метки	
 */	
else if (i > 2) {
/**
 * Вызываем метод по установке меток
 */
setLabel(i, panel);
}
}
}
}


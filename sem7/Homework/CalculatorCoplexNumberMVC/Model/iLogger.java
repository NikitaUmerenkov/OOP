package sem7.Homework.CalculatorCoplexNumberMVC.Model;

import sem7.Homework.CalculatorCoplexNumberMVC.Controller.Menu;

public interface iLogger<T> {

	/** Метод проверки существования файла */
	void checkFile();

	/** Метод создания обработчика файла для логгера */
	void createFileHandler();

	/** Метод инициализации логгера */
	void initLogger();

	/** Метод добавления записи в логгер */
	void writeLog(T firtsTerm, T secondTerm, T result, Menu menu);
}
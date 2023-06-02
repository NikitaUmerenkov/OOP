package Sem7.CalculatorCoplexNumberMVC.Model;

import Sem7.CalculatorCoplexNumberMVC.Controller.Menu;

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
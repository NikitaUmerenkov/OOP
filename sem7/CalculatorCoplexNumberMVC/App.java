package Sem7.CalculatorCoplexNumberMVC;

import Sem7.CalculatorCoplexNumberMVC.Controller.CalculatorController;
import Sem7.CalculatorCoplexNumberMVC.Model.ComplexCalculatorModel;
import Sem7.CalculatorCoplexNumberMVC.Model.ComplexNumber;
import Sem7.CalculatorCoplexNumberMVC.Model.TextLogger;
import Sem7.CalculatorCoplexNumberMVC.Model.iCalculatorModel;
import Sem7.CalculatorCoplexNumberMVC.Model.iLogger;
import Sem7.CalculatorCoplexNumberMVC.View.DefaultCalculatorView;
import Sem7.CalculatorCoplexNumberMVC.View.iCalculatorView;

public class App {
	public static void main(String[] args) throws Exception {
		iCalculatorModel<ComplexNumber> model = new ComplexCalculatorModel();
		iCalculatorView<ComplexNumber> view = new DefaultCalculatorView();
		iLogger<ComplexNumber> logger = new TextLogger("Probe");
		CalculatorController<ComplexNumber> controller = new CalculatorController<ComplexNumber>(model, view, logger);
	}
}
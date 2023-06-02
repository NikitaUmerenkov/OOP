package sem7.Homework.CalculatorCoplexNumberMVC;

import sem7.Homework.CalculatorCoplexNumberMVC.Controller.CalculatorController;
import sem7.Homework.CalculatorCoplexNumberMVC.Model.ComplexCalculatorModel;
import sem7.Homework.CalculatorCoplexNumberMVC.Model.ComplexNumber;
import sem7.Homework.CalculatorCoplexNumberMVC.Model.TextLogger;
import sem7.Homework.CalculatorCoplexNumberMVC.Model.iCalculatorModel;
import sem7.Homework.CalculatorCoplexNumberMVC.Model.iLogger;
import sem7.Homework.CalculatorCoplexNumberMVC.View.DefaultCalculatorView;
import sem7.Homework.CalculatorCoplexNumberMVC.View.iCalculatorView;

public class App {
	public static void main(String[] args) throws Exception {
		iCalculatorModel<ComplexNumber> model = new ComplexCalculatorModel();
		iCalculatorView<ComplexNumber> view = new DefaultCalculatorView();
		iLogger<ComplexNumber> logger = new TextLogger("Probe");
		CalculatorController<ComplexNumber> controller = new CalculatorController<ComplexNumber>(model, view, logger);
	}
}
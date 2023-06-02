package sem7.CalculatorCoplexNumberMVC;

import sem7.CalculatorCoplexNumberMVC.Controller.CalculatorController;
import sem7.CalculatorCoplexNumberMVC.Model.ComplexCalculatorModel;
import sem7.CalculatorCoplexNumberMVC.Model.ComplexNumber;
import sem7.CalculatorCoplexNumberMVC.Model.TextLogger;
import sem7.CalculatorCoplexNumberMVC.Model.iCalculatorModel;
import sem7.CalculatorCoplexNumberMVC.Model.iLogger;
import sem7.CalculatorCoplexNumberMVC.View.DefaultCalculatorView;
import sem7.CalculatorCoplexNumberMVC.View.iCalculatorView;

public class App {
	public static void main(String[] args) throws Exception {
		iCalculatorModel<ComplexNumber> model = new ComplexCalculatorModel();
		iCalculatorView<ComplexNumber> view = new DefaultCalculatorView();
		iLogger<ComplexNumber> logger = new TextLogger("Probe");
		CalculatorController<ComplexNumber> controller = new CalculatorController<ComplexNumber>(model, view, logger);
	}
}
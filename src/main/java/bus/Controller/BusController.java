package bus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import StudentsRecords.StudentsRecordsNo;
import schoolBusTransportation.TransportionServices;

@Controller
public class BusController {

	private TransportionServices transportServices;

	@RequestMapping(value = "records", method = RequestMethod.GET)
	public ModelAndView showPage() {
		System.out.println("Students Records");

		StudentsRecordsNo srn = transportServices.records();
		System.out.println(srn.toString());

		ModelAndView mv = new ModelAndView("records");
		mv.addObject("ts", srn);
		mv.addObject("schoolname", "Fannie Fits Elementary School");

		return mv;

	}

	public TransportionServices getTransportServices() {
		return transportServices;
	}

	public void setTransportServices(TransportionServices transportServices) {
		this.transportServices = transportServices;
	}

}

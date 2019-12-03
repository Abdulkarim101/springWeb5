package schoolBusTransportation;

import org.springframework.stereotype.Service;

import StudentsRecords.StudentsRecordsNo;

@Service
public class TransportionServices {

	public StudentsRecordsNo records() {
		StudentsRecordsNo srn = new StudentsRecordsNo();
		srn.setId(0123);
		srn.setName("John");
		srn.setGrade("2nd grade");

		return srn;

	}

}

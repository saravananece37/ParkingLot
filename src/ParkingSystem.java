import java.time.LocalDateTime;

import com.model.User;
import com.model.Vehicle;
import com.processor.LightMode;
import com.processor.MediumMode;
import com.processor.ParkingMode;
import com.processor.RequestProcessor;

public class ParkingSystem {

	public static void main(String[] args) {

		try {

			RequestProcessor requestProcessor = RequestProcessor.getInstance();
			User user = new User();

			user.setId(1);
			user.setUserName("abc");

			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleId(1);
			vehicle.setOwnerOfVehicle(user);
			vehicle.setStartingTime(LocalDateTime.now().minusHours(1));
			vehicle.setExitTime(LocalDateTime.now().plusHours(1));
			vehicle.setVehicleName("Swift");


			ParkingMode mode = new MediumMode(1);

			int slotID = requestProcessor.addNewVehicle(mode, vehicle);
			
			int slotID1 = requestProcessor.addNewVehicle(mode, vehicle);
			
			System.out.println("User vehicle processed at slot "+slotID);
			
			requestProcessor.manualExit(mode, 1);
			
			System.out.println(requestProcessor.getTotalAmountForDay(mode));
		
		} catch (Exception exc) {
			System.out.println(exc.getLocalizedMessage());
		}

	}

}

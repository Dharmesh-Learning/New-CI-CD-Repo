package com.GraphQl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GraphQl.DoaLayer.UserDao;
import com.GraphQl.Model.Password;
import com.GraphQl.Model.SchoolInfo;
import com.GraphQl.Model.Users;

@SpringBootApplication
public class GraphQlApplication implements ApplicationRunner {

	@Autowired
	 UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Users> users = new ArrayList<>();
		users.add(new Users(0, "Parth", "Mandankana", new Password(0, "PM@123"), new SchoolInfo(0, "Gujrat School", "AHM-3880120", "GOV")));
		users.add(new Users(0, "Dharmesh", "Delvadiya", new Password(0, "Dhp@123"), new SchoolInfo(0, "K.P Secondary High School", "BTD-364710", "Self Finance")));
		users.add(new Users(0, "Sandip", "Sindhav", new Password(0, "SND@123"), new SchoolInfo(0, "JNB School", "BMB-3880120", "Self finance")));
		users.add(new Users(0, "Prachi", "Desai", new Password(0, "PD@123"), new SchoolInfo(0, "Surat Diploma Collage", "SURAT-325401", "GOV")));
		users.add(new Users(0, "Nikita", "Dhanani", new Password(0, "ND@123"), new SchoolInfo(0, "Umiya Vidhyalaya", "AMRELI-302123", "Semi Final")));
		users.add(new Users(0, "Chintan", "Dobariya", new Password(0, "CHN@123"), new SchoolInfo(0, "Marwari Collage Of Engineering", "RAJKOT-321400", "Self finance")));
		users.add(new Users(0, "Test", "Test_User", new Password(0, "TES@123"), new SchoolInfo(0, "TEST_SCHOOL", "TEST_CITY-3880120_TEST", "TEST_SCH_TYPE")));
		users.add(new Users(0, "Kinjal", "Desai", new Password(0, "KJ@123"), new SchoolInfo(0, "AEA", "AHM-3880120", "Private")));
		users.add(new Users(0, "Ankit", "Desai", new Password(0, "Adram@123"), new SchoolInfo(0, "GSET", "AND-301512", "GOV")));
		users.add(new Users(0, "Varshil", "Panchal", new Password(0, "VP@123"), new SchoolInfo(0, "L.D Engineering Collage", "AHM-3880120", "GOV")));
		users.add(new Users(0, "Ramesh", "Chauhan", new Password(0, "RC@123"), new SchoolInfo(0, "Pacific school of marketing", "AHM-322201", "Private")));
		users.add(new Users(0, "Yaman", "Kavishwar", new Password(0, "YK@123"), new SchoolInfo(0, "GLS Manegment School", "AHM-342101", "GOV")));
		users.add(new Users(0, "Prachi", "Trivedi", new Password(0, "PT@123"), new SchoolInfo(0, "L.J Engineering", "AHM-310103", "Private")));
		users.add(new Users(0, "Ravi", "Pithadiya", new Password(0, "RP@123"), new SchoolInfo(0, "Sal Engineering collage", "AHM-3880120", "GOV")));
		users.add(new Users(0, "Naresh", "", new Password(0, "NP@123"), new SchoolInfo(0, "", "Rajkot-210011", "")));
		users.add(new Users(0, "test-01", "test-01", new Password(0, "test-01@123"), new SchoolInfo(0, "test-01", "test-01", "test-01")));
		users.add(new Users(0, "test-02", "test-02", new Password(0, "test-02@123"), new SchoolInfo(0, "test-02", "test-02", "test-02")));
		users.add(new Users(0, "test-03", "test-03", new Password(0, "test-03@123"), new SchoolInfo(0, "test-03", "test-03", "test-03")));
		users.add(new Users(0, "test-04", "test-04", new Password(0, "test-04@123"), new SchoolInfo(0, "test-04", "test-04", "test-04")));
		users.add(new Users(0, "test-05", "test-05", new Password(0, "test-05@123"), new SchoolInfo(0, "test-05", "test-05", "test-05")));
		users.add(new Users(0, "test-06", "test-06", new Password(0, "test-06@123"), new SchoolInfo(0, "test-06", "test-06", "test-06")));
		users.add(new Users(0, "test-07", "test-07", new Password(0, "test-07@123"), new SchoolInfo(0, "test-07", "test-07", "test-07")));
		users.add(new Users(0, "test-08", "test-08", new Password(0, "test-08@123"), new SchoolInfo(0, "test-08", "test-08", "test-08")));
		System.out.println("Data inserted sucessfully...");
		userDao.saveAll(users);
	}

}

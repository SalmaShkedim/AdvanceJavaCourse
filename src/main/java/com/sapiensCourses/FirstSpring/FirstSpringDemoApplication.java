package com.sapiensCourses.FirstSpring;


import com.sapiensCourses.FirstSpring.Di.SetterBasedDI;
import com.sapiensCourses.FirstSpring.ioc.Address;
import com.sapiensCourses.FirstSpring.ioc.Contact;
import com.sapiensCourses.FirstSpring.ioc.Employee;
import com.sapiensCourses.FirstSpring.ioc.OfficialDetails;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class FirstSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringDemoApplication.class, args);

		System.out.println("Setter based DI Demo");
		AnnotationConfigApplicationContext configApplicationContext1 = new AnnotationConfigApplicationContext(SetterBasedDI.class);
		SetterBasedDI.AccountServiceClient accountServiceClient = configApplicationContext1.getBean(SetterBasedDI.AccountServiceClient.class);
		accountServiceClient.showPendingDetails();

	// System.out.println("Constructor Based DI with Component Scan");
	// AnnotationConfigApplicationContext configApplicationContext =
	// new AnnotationConfigApplicationContext(ConstructorBasedDIWithComponentScan.class) ;
	// ConstructorBasedDIWithComponentScan.OrderServiceClient beans=
	// configApplicationContext.getBean(ConstructorBasedDIWithComponentScan.OrderServiceClient.class);
	// beans.showPendingDetails();
	//
	//
	//	 System.out.println("Constructor Based DI");
	//	 AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ConstructorBasedDI.class);
	//	 ConstructorBasedDI.AccountServiceClient bean = context2.getBean(ConstructorBasedDI.AccountServiceClient.class);
	//	 bean.showPendingAccountDetails();

		System.out.println("Spring IOC Demo");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		//employee class
		Employee employee1 = (Employee) factory.getBean("employee1");
		Employee employee2 = (Employee) factory.getBean("employee2");
		Employee employee3 = (Employee) factory.getBean("employee3");
		Employee employee4 = (Employee) factory.getBean("employee4");
		//employee address class
		Address address1 = (Address) factory.getBean("address1");
		Address address2 = (Address) factory.getBean("address2");
		Address address3 = (Address) factory.getBean("address3");
		Address address4 = (Address) factory.getBean("address4");
		//employee contact class
		Contact contact1= (Contact) factory.getBean("contact1");
		Contact contact2= (Contact) factory.getBean("contact2");
		Contact contact3= (Contact) factory.getBean("contact3");
		Contact contact4= (Contact) factory.getBean("contact4");
		//employee Official Details Class
		OfficialDetails officialDetails1 = (OfficialDetails) factory.getBean("officialDetails1");
		OfficialDetails officialDetails2 = (OfficialDetails) factory.getBean("officialDetails2");
		OfficialDetails officialDetails3 = (OfficialDetails) factory.getBean("officialDetails3");
		OfficialDetails officialDetails4 = (OfficialDetails) factory.getBean("officialDetails4");


		System.out.println("------------- Employees Details --------------------");
		System.out.println("\n------Employee 1------");
		System.out.println("ID: "+employee1.getId()+" \n"+"Name: "+employee1.getName());
		System.out.println("Age: "+employee1.getAge()+" \n"+"Gender: "+employee1.getGender());
		System.out.println("\nAddress Details:");
		System.out.println("City: "+address1.getCity()+" \n"+"State: "+address1.getState());
		System.out.println("Country: "+address1.getCountry()+" \n"+"PIN Code: "+address1.getPincode()+" \n"+"Post Box: "+address1.getPo_box_no());
		System.out.println("\nContact Details:");
		System.out.println("Primary mobile Number: "+contact1.getPrimary_mobile_no()+" \n"+"Secondary mobile Number: "+contact1.getSecondary_mobile_no());
		System.out.println("Emergency Number: "+contact1.getEmergency_no()+" \n"+"Email ID: "+contact1.getEmail_id() +" \n"+"Official Email ID: "+contact1.getOfficial_email_id());
		System.out.println("\nOfficial Details:");
		System.out.println("Education qualification: "+officialDetails1.getEdu_qualification()+" \n"+"Percentage: "+officialDetails1.getPercentage());
		System.out.println("Designation: "+officialDetails1.getDesignation()+" \n"+"Years Of Experience: "+officialDetails1.getYears_of_experience() +" \n"+"Current Company Name: "+officialDetails1.getCurrent_comp_name());



		System.out.println("\n------Employee 2------");
		System.out.println("ID: "+employee2.getId()+" \n"+"Name: "+employee2.getName());
		System.out.println("Age: "+employee2.getAge()+" \n"+"Gender: "+employee2.getGender());
		System.out.println("\nAddress Details:");
		System.out.println("City: "+address2.getCity()+" \n"+"State: "+address2.getState());
		System.out.println("Country: "+address2.getCountry()+" \n"+"PIN Code: "+address2.getPincode()+" \n"+"Post Box: "+address2.getPo_box_no());
		System.out.println("\nContact Details:");
		System.out.println("Primary mobile Number: "+contact2.getPrimary_mobile_no()+" \n"+"Secondary mobile Number: "+contact2.getSecondary_mobile_no());
		System.out.println("Emergency Number: "+contact2.getEmergency_no()+" \n"+"Email ID: "+contact2.getEmail_id() +" \n"+"Official Email ID: "+contact2.getOfficial_email_id());
		System.out.println("\nOfficial Details:");
		System.out.println("Education qualification: "+officialDetails2.getEdu_qualification()+" \n"+"Percentage: "+officialDetails2.getPercentage());
		System.out.println("Designation: "+officialDetails2.getDesignation()+" \n"+"Years Of Experience: "+officialDetails2.getYears_of_experience() +" \n"+"Current Company Name: "+officialDetails2.getCurrent_comp_name());

		System.out.println("\n------Employee 3------");
		System.out.println("ID: "+employee3.getId()+" \n"+"Name: "+employee3.getName());
		System.out.println("Age: "+employee3.getAge()+" \n"+"Gender: "+employee3.getGender());
		System.out.println("\nAddress Details:");
		System.out.println("City: "+address3.getCity()+" \n"+"State: "+address3.getState());
		System.out.println("Country: "+address3.getCountry()+" \n"+"PIN Code: "+address3.getPincode()+" \n"+"Post Box: "+address3.getPo_box_no());
		System.out.println("\nContact Details:");
		System.out.println("Primary mobile Number: "+contact3.getPrimary_mobile_no()+" \n"+"Secondary mobile Number: "+contact3.getSecondary_mobile_no());
		System.out.println("Emergency Number: "+contact3.getEmergency_no()+" \n"+"Email ID: "+contact3.getEmail_id() +" \n"+"Official Email ID: "+contact3.getOfficial_email_id());
		System.out.println("\nOfficial Details:");
		System.out.println("Education qualification: "+officialDetails3.getEdu_qualification()+" \n"+"Percentage: "+officialDetails3.getPercentage());
		System.out.println("Designation: "+officialDetails3.getDesignation()+" \n"+"Years Of Experience: "+officialDetails3.getYears_of_experience() +" \n"+"Current Company Name: "+officialDetails3.getCurrent_comp_name());


		System.out.println("\n------Employee 4------");
		System.out.println("ID: "+employee4.getId()+" \n"+"Name: "+employee4.getName());
		System.out.println("Age: "+employee4.getAge()+" \n"+"Gender: "+employee4.getGender());
		System.out.println("\nAddress Details:");
		System.out.println("City: "+address4.getCity()+" \n"+"State: "+address4.getState());
		System.out.println("Country: "+address4.getCountry()+" \n"+"PIN Code: "+address4.getPincode()+" \n"+"Post Box: "+address4.getPo_box_no());
		System.out.println("\nContact Details:");
		System.out.println("Primary mobile Number: "+contact4.getPrimary_mobile_no()+" \n"+"Secondary mobile Number: "+contact4.getSecondary_mobile_no());
		System.out.println("Emergency Number: "+contact4.getEmergency_no()+" \n"+"Email ID: "+contact4.getEmail_id() +" \n"+"Official Email ID: "+contact4.getOfficial_email_id());
		System.out.println("\nOfficial Details:");
		System.out.println("Education qualification: "+officialDetails4.getEdu_qualification()+" \n"+"Percentage: "+officialDetails4.getPercentage());
		System.out.println("Designation: "+officialDetails4.getDesignation()+" \n"+"Years Of Experience: "+officialDetails4.getYears_of_experience() +" \n"+"Current Company Name: "+officialDetails4.getCurrent_comp_name());
	}


}

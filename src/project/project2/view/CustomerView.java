package project.project2.view;

import project.project2.bean.Customer;
import project.project2.service.CustomerList;
import project.project2.util.CMUtility;

public class CustomerView {
	CustomerList customerList = new CustomerList(10);
	
	

	public CustomerView() {
		Customer cust = new Customer("张三", '男', 30, "010-56253825",
				"abc@email.com");
		customerList.addCustomer(cust);
	}

	public void enterMainMenu() {
		boolean isFlag = true;
		do {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");
			char key = CMUtility.readMenuSelection();
			switch (key) {
			case '1':
				addNewCustomer();

				break;
			case '2':
				modifyCustomer();

				break;
			case '3':
				deleteCustomer();

				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.print("确认是否退出(Y/N)：");
				char num = CMUtility.readConfirmSelection();
				if(num =='Y') {
					return;
				}
				break;
			}
		} while (isFlag);

	}

	public void addNewCustomer() {
		

	}

	public void modifyCustomer() {

	}

	public void deleteCustomer() {

	}

	public void listAllCustomer() {
		System.out.println("---------------------------客户列表---------------------------");
		Customer[] cust = customerList.getAllCustomer();
		if(cust.length ==0) {
			System.out.println("沒有客戶信息");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
		}
		for (int i = 0; i < cust.length; i++) {
			System.out.println(i + 1 + "\t" + cust[i].getName() + 
					"\t" + cust[i].getGender() + "\t" + cust[i].getAge() + 
					"\t\t" + cust[i].getPhone() + "\t" + cust[i].getEmail());
		}
		System.out.println("-------------------------客户列表完成-------------------------");

	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}

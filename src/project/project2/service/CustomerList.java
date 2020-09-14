package project.project2.service;

import project.project2.bean.Customer;

public class CustomerList {

	private Customer[] customers;
	private int total = 0;

	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];

	}

	// 添加客户
	public boolean addCustomer(Customer customer) {
		if (total > customers.length) {
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}

	// 修改客户
	public boolean replaceCustomer(int index, Customer cust) {
		if (index > 0 || index < total) {
			customers[index - 1] = cust;
			return true;
		}
		return false;

	}

	public boolean deleteCustomer(int index) {
		if (index > 0 || index < total) {
			for (int i = index; i < total; i++) {
				customers[i - 1] = customers[i];

			}
			customers[total - 1] = null;
			total--;
			return true;
		}
		return false;
	}

	public Customer[] getAllCustomer() {
		Customer[] cust = new Customer[total];
		for (int i = 0; i < total; i++) {
			cust[i] = customers[i];

		}
		return cust;
	}

	public Customer getCustomers(int index) {
		if (index > 0 || index <= total) {
			return customers[index - 1];
		}
		return null;

	}

	public int getTotal() {
		return total;
	}

}

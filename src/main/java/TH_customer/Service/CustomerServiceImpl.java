package TH_customer.Service;

import TH_customer.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static Map<Integer, Customer>customers;
    static {
        customers=new HashMap<>();
        customers.put(1,new Customer(1,"Truong","truong@gmail.com","Quang Ninh"));
        customers.put(2,new Customer(2,"thanh","thanh@gmail.com","Ha Noi"));
        customers.put(3,new Customer(3,"quang","quang@gmail.com","Quang Ninh"));
        customers.put(4,new Customer(4,"manh","manh@gmail.com","Yen Bai"));
        customers.put(5,new Customer(5,"huong","huong@gmail.com","Nam Dinh"));
        customers.put(6,new Customer(6,"duy","duy@gmail.com","Viet Tri"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}

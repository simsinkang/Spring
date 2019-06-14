package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.CustomerDTO;
import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */

@Repository
public interface CustomerMapper {
    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int selectCount();
}
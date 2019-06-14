package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.SupplierDTO;
import org.springframework.stereotype.Repository;

/**
 * SupplierMapper
 */

@Repository
public interface SupplierMapper {
    public void addSupplier(SupplierDTO supplier);
    public List<SupplierDTO> findSuppliers();
    public List<SupplierDTO> findSuppliersByOption(SupplierDTO option);
    public SupplierDTO findSupplierBySupplierId(String supplierId);
    public void updateSupplier(SupplierDTO supplier);
    public void deleteSupplier(SupplierDTO supplier);
}
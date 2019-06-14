package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.ShipperDTO;
import org.springframework.stereotype.Repository;

/**
 * ShipperMapper
 */

@Repository
public interface ShipperMapper {
    public void addShipper(ShipperDTO product);
    public List<ShipperDTO> findShippers();
    public List<ShipperDTO> findShippersByOption(ShipperDTO option);
    public ShipperDTO findShipperByShipperId(String shipperId);
    public void updateShipper(ShipperDTO product);
    public void deleteShipper(ShipperDTO product);
}
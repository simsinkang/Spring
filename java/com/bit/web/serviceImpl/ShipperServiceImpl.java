package com.bit.web.serviceImpl;

import java.util.List;

import com.bit.web.domain.ShipperDTO;
import com.bit.web.service.ShipperService;
import org.springframework.stereotype.Service;

/**
 * ShipperServiceImpl
 */
@Service
public class ShipperServiceImpl implements ShipperService {

    @Override
    public void addShipper(ShipperDTO product) {

    }

    @Override
    public List<ShipperDTO> findShippers() {
        return null;
    }

    @Override
    public List<ShipperDTO> findShippersByOption(ShipperDTO option) {
        return null;
    }

    @Override
    public ShipperDTO findShipperByShipperId(String shipperId) {
        return null;
    }

    @Override
    public void updateShipper(ShipperDTO product) {

    }

    @Override
    public void deleteShipper(ShipperDTO product) {

    }
}
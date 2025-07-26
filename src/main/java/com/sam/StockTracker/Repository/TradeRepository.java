package com.sam.StockTracker.Repository;


import com.sam.StockTracker.Model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // You can add custom query methods here later
}

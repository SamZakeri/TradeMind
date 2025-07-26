package com.sam.StockTracker.Controller;

import com.sam.StockTracker.Model.Trade;
import com.sam.StockTracker.Repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trades")
@CrossOrigin(origins = "*") // allow frontend localhost access
public class TradeController {

    @Autowired
    private TradeRepository tradeRepository;

    @GetMapping
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Trade> createTrade(@RequestBody Trade trade) {
        Trade savedTrade = tradeRepository.save(trade);
        return ResponseEntity.ok(savedTrade);
    }
}

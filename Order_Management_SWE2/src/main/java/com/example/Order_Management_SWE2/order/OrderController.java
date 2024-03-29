package com.example.Order_Management_SWE2.order;

import com.example.Order_Management_SWE2.order.CompundOrder.CompoundOrder;
import com.example.Order_Management_SWE2.order.SimpleOrder.SimpleOrderBSL;
import com.example.Order_Management_SWE2.order.CompundOrder.CompoundOrderBSL;
import com.example.Order_Management_SWE2.order.SimpleOrder.SimpleOrder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    SimpleOrderBSL simpleOrderBSL = new SimpleOrderBSL();
    CompoundOrderBSL CompOrderBSL = new CompoundOrderBSL();


    @PostMapping("/simpleOrder")
    public String simpleOrder(@RequestBody SimpleOrder order) {

        return simpleOrderBSL.makeSimpleOrder(order);
    }


    @PostMapping("/compoundOrder")
    public String compoundOrder(@RequestBody CompoundOrder Order) {

        return CompOrderBSL.makeCompoundOrder(Order);
    }

    @PostMapping("/shipSimpleOrder/{orderId}")
    public String shipSimpleOrder(@PathVariable("orderId") int orderId) {

        return simpleOrderBSL.shipSimpleOrder(orderId);
    }
    @PostMapping("/shipCompoundOrder/{orderId}")
    public String shipCompoundOrder(@PathVariable("orderId") int orderId) {
        return CompOrderBSL.shipCompoundOrder(orderId);
    }

    @DeleteMapping("/cancelSimpleOrder/{orderId}")
    public String cancelSimpleOrder(@PathVariable("orderId") int orderId) {
            return simpleOrderBSL.cancel(orderId);
    }
    @DeleteMapping("/cancelCompoundOrder/{orderId}")
    public String cancelCompoundOrder(@PathVariable("orderId") int orderId) {
        return CompOrderBSL.cancel(orderId);
    }


}

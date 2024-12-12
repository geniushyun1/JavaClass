package _GUI.Repository;

import _GUI.JDBCConnector;
import _GUI.View.OrederEntity;
import _GUI.entity.OrderEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderRepository {
    ArrayList<OrderEntity> orderList=new ArrayList<OrderEntity>();
     String sql;


    //JDBCConnection 연결
    public ArrayList<OrderEntity> getOrderList(String searchWord){
        Connection con= JDBCConnector.getConnection();
        String Sql ="select 주문번호, 고객이름, 제품명, 수량, 배송지, 주문일자 from 주문 o, 고객 c, 제품 p"+
                    "where o.주문고객 =c.고객아이디 and o.주문제품 = p.제품번호 and c.고객이름 like ?";
        OrderEntity order=null;
        try {
            PreparedStatement pstmt = con.prepareStatement(Sql);
            pstmt.setString(1,"%"+searchWord+"%");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                OrderEntity OrderEntity = new OrderEntity();
//                orderEntity setOrderNum(rs.getString("주문번호"));
//                orderEntity setCustomerName(rs.getString("고객이름"));
//                orderEntity setproductName(rs.getString("제품명"));
//                orderEntity setamount(rs.getInt("수량"));
//                orderEntity setDestination(rs.getString("목적지"));
//                orderEntity setOrderDate(rs.getDate("주문일자"));

//                orderlist.add(orderEntity);
            }
            rs.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e);
        }
        return orderList;
    }

    public void insertOrder(OrederEntity orderEntity){
        String Sql = "insert into 주문 values(?, ?, ?, ?, ?, ?) ";
        Connection con= JDBCConnector.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, orderEntity.getOrderNum());
            pstmt.setString(2, orderEntity.getOrderCustomer());
            pstmt.setString(3, orderEntity.getOrderProduct());
            pstmt.setInt(4, orderEntity.getAmount());
            pstmt.setString(5, orderEntity.getDestination());
            pstmt.setTimestamp(6, orderEntity.getOrderDate());
            pstmt.executeUpdate();

            con.close();
        }catch(SQLException e){
            System.out.println(e);

        }

    }
}

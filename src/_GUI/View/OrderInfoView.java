package _GUI.View;

import _GUI.Repository.OrderRepository;
import _GUI.entity.OrderEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;


public class OrderInfoView extends JPanel {
    JPanel panN = new JPanel(new GridLayout(2, 1));
    JPanel panC = new JPanel(new BorderLayout(5, 20));

    JPanel addPanel =new JPanel(new GridLayout(2, 1));

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    JTextField tfsearch = new JTextField(20);
    DefaultTableModel tableModel;
    JTable table;

    String[] header ={"주문번호", "주문고객", "주문제품", "수량","배송지","주문일자"};



    public OrderInfoView() {
        setLayout(new BorderLayout());

        panC.add(addPanel, "South");
        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");
        addPan1();
        addPan2();
        addTable();
        addOrderInfo();
        initList(" ");
    }

    public void addPan1(){
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }

    public void addPan2(){
        JLabel lblSearch= new JLabel("검색어");
        JButton btnSearch=new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {

            public void mouseClicked( MouseEvent e) {
                String searchWord = tfsearch.getText();
                initList(searchWord);
            }
        });
        pan2.add(btnSearch);
        pan2.add(lblSearch);
        pan2.add(tfsearch);
    }

    public void addTable(){
        tableModel = new DefaultTableModel(header, 15){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tableModel);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(180);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane, "Center");

    }

    public void initList(String searchWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord);

        tableModel.setRowCount(orderList.size());
        int i = 0;

        for (OrderEntity orderEntity : orderList) {
            tableModel.setValueAt(orderEntity.getOrderNum(), i,0);
            tableModel.setValueAt(orderEntity.getCustomerName(), i,1);
            tableModel.setValueAt(orderEntity.getProductName(), i,2);
            tableModel.setValueAt(orderEntity.getAmount(), i,3);
            tableModel.setValueAt(orderEntity.getDestination(), i,4);
            tableModel.setValueAt(orderEntity.getOrderDate(), i,5);
            i++;
        }
    }
    public void addOrderInfo() {
        JLabel title = new JLabel("주문 정보 입력", JLabel.CENTER);
        JButton btnAdd = new JButton("주문추가");
        panC.add(addPanel, "South");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        addPanel.add(title);
        addPanel.add(p1);
        addPanel.add(p2);
        String[] lblstrs = {"주문번호: ", "고객아이디: ", "제품번호: ", "수량: ", "배송지: ", "주문일자: "};
        JLabel[] lbls = new JLabel[lblstrs.length];
        JTextField[] texts = new JTextField[lblstrs.length];

        for (int i = 0; i < lblstrs.length; i++) {
            lbls[i] = new JLabel(lblstrs[i]);
            texts[i] = new JTextField(20);
            if (i < 3) {
                p1.add(lbls[i]);
                p1.add(texts[i]);
            } else {
                p2.add(lbls[i]);
                p2.add(texts[i]);
            }
        }
        p2.add(btnAdd);

        btnAdd.addMouseListener(new MouseAdapter() {

            public void mouseClicked( MouseEvent e) {
                OrederEntity orderEntity = new OrederEntity();
//                orderEntity.setOrderNum(texts[0].getText());
//                orderEntity.setOrderCustomer(texts[1].getText());
//                orderEntity.setOrderProduct(texts[2].getText());
//                orderEntity.setAmount(Integer.parseInt(texts[3].getText()));
//                orderEntity.setDestination(texts[4].getText());
//                orderEntity.setOrderDate(texts[5].getText());
//                  orderEntity.setOrderDate(Timestamp.valueOf(texts[6].getText()));

                  OrderRepository orderRepository = new OrderRepository();
                  orderRepository.insertOrder(orderEntity);
                  initList(" ");
            }
        });
    }
}

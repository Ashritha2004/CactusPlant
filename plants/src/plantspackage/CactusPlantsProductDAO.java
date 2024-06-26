package plantspackage;

import java.util.*;
import java.sql.*;

public class CactusPlantsProductDAO {
	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public CactusPlantsProductDAO(Connection con) {
		this.con = con;
	}
	
	public List<CactusPlantProject> getAllCactusPlantProject(){
		List<CactusPlantProject> hangProd = new ArrayList<>();
		
		try {
			query = "select * from cactusplant";
			pst = this.con.prepareStatement(query);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				CactusPlantProject row = new CactusPlantProject();
				row.setPname(rs.getString("pname"));
				row.setOriginalprice(rs.getBigDecimal("original_price"));
				row.setDiscountprice(rs.getBigDecimal("discount_price"));
				row.setImage(rs.getString("image"));
				
				hangProd.add(row);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return hangProd;
		
	}
}
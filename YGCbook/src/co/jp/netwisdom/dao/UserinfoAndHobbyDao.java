package co.jp.netwisdom.dao;

import java.sql.SQLException;


import cn.key.dbManager.JdbcTemplate;

import co.jp.netwisdom.entity.UsernifoAndHobby;

public class UserinfoAndHobbyDao {
	private JdbcTemplate template = new JdbcTemplate();

	public boolean save(UsernifoAndHobby userAndEntity) throws ClassNotFoundException, SQLException  {
		int rowU = 0;
		int rowH = 0;
		String sqlForUnerinfo = "insert into userinfor values(?,?,?,?,?)";
		String sqlForHobby = "insert into hobby values(?,?)";
		Object[] objectForU = {userAndEntity.getName(),
				userAndEntity.getPassword(),
				userAndEntity.getSex(),
				userAndEntity.getMajor(),
				userAndEntity.getHobby(),
				userAndEntity.getIntro(),			
		};
		
	try{	
	    template.updata(sqlForUnerinfo, objectForU);
		for(String hobby:userAndEntity.getHobby()){
				Object[] objectForH = {
				userAndEntity.getName(),				
				hobby					
				};
		rowH += template.updata(sqlForHobby, objectForH);	
		}
	}
	catch(Exception e){
		return false;
	}
		return (rowU==1 && rowH== userAndEntity.getHobby().length);
	
		//String strData = DataTool.allDatetoString(info.getWriteData());
	
	}

}

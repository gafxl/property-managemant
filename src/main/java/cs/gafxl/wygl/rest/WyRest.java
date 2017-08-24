package cs.gafxl.wygl.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cs.gafxl.wygl.bean.ResponseDto;

@Component
@Path("wy")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class WyRest {
	
	private static final Logger logger = LoggerFactory.getLogger(WyRest.class);
	@Autowired
	private ResponseDto resDto;
	
	/**
	 * 服务初始化
	 */
	public void init() {
		logger.debug("物业服务启动");
	}
	
	/**
	 * 服务注销
	 */
	public void destroy() {
		logger.debug("物业服务注销");
	}
	
	/**
	 * say hello to the world
	 * 
	 * @param name
	 * @return
	 */
	@GET
	@Path("/hello")
	public ResponseDto sayHello(@QueryParam("name") String name) {
		String response = "hello " + (name != null ? name : "物业");
		resDto.setEntity(response);
		resDto.setResult(0);
		resDto.setErrorInfo("");
		return resDto;
	}
	
}

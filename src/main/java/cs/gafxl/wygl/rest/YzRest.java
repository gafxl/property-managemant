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
@Path("yz")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class YzRest {
	
	private static final Logger logger = LoggerFactory.getLogger(YzRest.class);
	@Autowired
	private ResponseDto resDto;
	
	/**
	 * 服务初始化
	 */
	public void init() {
		logger.debug("业主服务启动");
	}
	
	/**
	 * 服务注销
	 */
	public void destroy() {
		logger.debug("业主服务注销");
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
		String response = "hello " + (name != null ? name : "业主");
		resDto.setEntity(response);
		resDto.setResult(0);
		resDto.setErrorInfo("");
		return resDto;
	}
	
}

package cs.gafxl.wygl;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * <p>应用入口。</p>
 *
 * 创建日期 2017年8月2日
 * @author txl
 * @since $version$
 */
@SpringBootApplication
@ServletComponentScan
@ApplicationPath("/gafxl")
public class GafxlApplication extends Application{
	
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(GafxlApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
    
}

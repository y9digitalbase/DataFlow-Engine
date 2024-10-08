package risesoft.data.transfer.core.config;

import risesoft.data.transfer.core.context.JobContext;
import risesoft.data.transfer.core.util.Configuration;

/**
 * 配置加载器
 * 
 * 
 * @typeName ConfigLoad
 * @date 2024年8月27日
 * @author lb
 */
public interface ConfigLoad {
	/**
	 * 加载配置
	 * 
	 * @param config
	 * @param jobContext
	 * @return
	 */
	Configuration laod(Configuration config,JobContext jobContext);

}

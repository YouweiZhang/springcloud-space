package my.study.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import my.study.cloud.common.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler1");

    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler2");

    }
}

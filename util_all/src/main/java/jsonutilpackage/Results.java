package jsonutilpackage;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : WangFuHai
 * @create 2023/3/7 16:25
 */
@NoArgsConstructor
@Data
public class Results {
    @JSONField(name = "datas")
    private String datas;
    @JSONField(name = "result")
    private String result;
}

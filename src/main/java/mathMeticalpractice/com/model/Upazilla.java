package mathMeticalpractice.com.model;

import java.util.List;

import lombok.Data;

@Data
public class Upazilla {
	private String upazillaCode;
	private String upazillaName;
	private List<Union>unionList;

}

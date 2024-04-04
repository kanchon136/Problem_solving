package mathMeticalpractice.com.model;

import java.util.List;

import lombok.Data;

@Data
public class District {
	private String disCode;
	private String disName;
	private List<Upazilla>upazillaList;

}

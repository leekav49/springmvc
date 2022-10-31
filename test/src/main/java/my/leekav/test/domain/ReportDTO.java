package my.leekav.test.domain;

import org.springframework.web.multipart.MultipartFile;

public class ReportDTO {
	private String name;
//file  �� MultipartFile�� ����
	private MultipartFile pictureurl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(MultipartFile pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Override
	public String toString() {
		return "ReportDTO [name=" + name + ", pictureurl=" + pictureurl + "]";
	}
}
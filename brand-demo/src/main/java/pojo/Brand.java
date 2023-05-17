package pojo;

import org.apache.ibatis.type.Alias;

public class Brand {
    private Integer id;
    private String brandName;
    private String companyName;
    private Integer ordered;
    private String companyDescription;
    private Integer status;

    public Brand() {
    }

    public Brand(Integer id, String brandName, String companyName, String companyDescription) {
        this.id = id;
        this.brandName = brandName;
        this.companyName = companyName;
        this.companyDescription = companyDescription;
    }

    public Brand(Integer id, String brandName, String companyName, Integer ordered, String companyDescription, Integer status) {
        this.id = id;
        this.brandName = brandName;
        this.companyName = companyName;
        this.ordered = ordered;
        this.companyDescription = companyDescription;
        this.status = status;
    }

    public Brand(String brandName, String companyName, Integer ordered, String companyDescription, Integer status) {
        this.brandName = brandName;
        this.companyName = companyName;
        this.ordered = ordered;
        this.companyDescription = companyDescription;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", ordered=" + ordered +
                ", companyDescription='" + companyDescription + '\'' +
                ", status=" + status +
                '}';
    }
}
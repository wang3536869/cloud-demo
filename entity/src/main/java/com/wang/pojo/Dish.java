package com.wang.pojo;


import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 菜品管理
 *
 * @TableName dish
 */
public class Dish implements Serializable {
    private Long id;
    /**
     * 菜品名称
     */
    private String name;
    /**
     * 菜品分类id
     */
    private Long categoryId;
    /**
     * 菜品价格
     */
    private BigDecimal price;
    /**
     * 商品码
     */
    private String code;
    /**
     * 图片
     */

    private String image;
    /**
     * 描述信息
     */
    private String description;
    /**
     * 0 停售 1 起售
     */
    private Integer status;
    /**
     * 顺序
     */
    private Integer sort;
    /**
     * 创建时间
     */

    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建人
     */

    private Long createUser;
    /**
     * 修改人
     */

    private Long updateUser;
    /**
     * 是否删除
     */

    private Integer isDeleted;
    /**
     * 商户id
     */

    private Long merchantId;
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                ", isDeleted=" + isDeleted +
                ", merchantId=" + merchantId +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }
}

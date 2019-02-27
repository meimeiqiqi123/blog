package com.blog.blog_s.domain;

import java.io.Serializable;

public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	
	 /**
     * 文章的主键编号
     */
    private Long id;
    /**
     * 内容标题
     */
    private String title;

    /**
     * 标题图片
     */
    private String titlePic;
    /**
     * 内容缩略名
     */
    private String slug;
    /**
     * 内容生成时的GMT 
     */
    private String createDate;
    /**
     * 内容更改时的GMT 
     */
    private String modifyDate;
    /**
     * 内容文字
     */
    private String content;
    /**
     * 内容所属用户id
     */
    private Long sysUserId;
    /**
     * 内容类别
     */
    private String type;
    /**
     * 内容状态
     */
    private String status;
    /**
     * 标签列表
     */
    private String tags;
    /**
     * 分类列表
     */
    private String categories;
    /**
     * 点击次数
     */
    private Integer hits;
    /**
     * 内容所属评论数
     */
    private Integer commentsNum;
    /**
     * 是否允许评论
     */
    private Integer allowComment;
    /**
     * 是否允许ping
     */
    private Integer allowPing;
    /**
     * 允许出现在聚合中
     */
    private Integer allowFeed;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitlePic() {
		return titlePic;
	}
	public void setTitlePic(String titlePic) {
		this.titlePic = titlePic;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getCommentsNum() {
		return commentsNum;
	}
	public void setCommentsNum(Integer commentsNum) {
		this.commentsNum = commentsNum;
	}
	public Integer getAllowComment() {
		return allowComment;
	}
	public void setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
	}
	public Integer getAllowPing() {
		return allowPing;
	}
	public void setAllowPing(Integer allowPing) {
		this.allowPing = allowPing;
	}
	public Integer getAllowFeed() {
		return allowFeed;
	}
	public void setAllowFeed(Integer allowFeed) {
		this.allowFeed = allowFeed;
	}
    
    

}

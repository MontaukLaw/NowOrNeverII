package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("replyService")
public class ReplyService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addReply(PageData pd) throws Exception {
		dao.save("ReplyMapper.addReply", pd);
	}

	public void editReplyByID(PageData pd) throws Exception {
		dao.update("ReplyMapper.editReplyByID", pd);
	}

	public void deleteReplyByID(PageData pd) throws Exception {
		dao.delete("ReplyMapper.deleteReplyByID", pd);
	}

	public List<PageData> listReplyByMainArticleID(Page page) throws Exception {
		return (List<PageData>) dao.findForList("ReplyMapper.listReplyByMainArticleID", page);
	}

}

package com.wuxiao.tang.controller;

import com.wuxiao.tang.entity.Poet;
import com.wuxiao.tang.helper.Pagination;
import com.wuxiao.tang.service.IPoetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/poets")
public class PoetsController extends BaseController {

	@Autowired
	private IPoetsService poetsService;

	/**
	 * 诗人列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list.do")
	public String list() throws Exception {
		try {
			Integer total = poetsService.countAll();
			pagination = new Pagination(total, request);
			List<Poet> list = poetsService.getList(pagination.offset(),pagination.limit());
			request.setAttribute("list",list);
			request.setAttribute("pagination",pagination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "poetsList";
	}

}

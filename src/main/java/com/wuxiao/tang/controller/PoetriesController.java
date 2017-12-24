package com.wuxiao.tang.controller;

import com.wuxiao.tang.entity.Poetry;
import com.wuxiao.tang.helper.Pagination;
import com.wuxiao.tang.service.IPoetriesService;
import com.wuxiao.tang.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import java.util.List;

@Controller
@RequestMapping("/poetries")
public class PoetriesController extends BaseController {

	/**
	 * 搜索
	 */
	@Autowired
	private ISearchService searcherService;

	@Autowired
	private IPoetriesService poetriesService;

	/**
	 * 诗词列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list.do")
	public String list() throws Exception {
		try {
			Integer total = poetriesService.countAll();
			pagination = new Pagination(total, request);
			List<Poetry> list = poetriesService.getList(pagination.offset(),pagination.limit());
			request.setAttribute("list", list);
			request.setAttribute("pagination",pagination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "poetriesList";
	}
	
	/**
	 * 单个诗词
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("get.do")
	public String get(@RequestParam Integer id) throws Exception {
		if (id == null){
			throw new ServletException("缺少文章ID");
		}
		Poetry poetry = poetriesService.get(id);
		if (poetry == null){
			throw new ServletException("找不到该文章");
		}
		request.setAttribute("poetry", poetry);

		return "poetry";
	}
	
	/**
	 * 搜索列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("search.do")
	public String search(@RequestParam(required = false) String poet_name,
						 @RequestParam(required = false) String poetry_title,
						 @RequestParam(required = false) String poetry_content) throws Exception {
		/**
		 * 根据分页获取数据
		 */
		try {
			searcherService.setParams(poet_name,poetry_title,poetry_content);
			Integer total = searcherService.countAll();
			pagination = new Pagination(total, request);
			List<Poetry> list = searcherService.getList(pagination.offset(),pagination.limit());
			request.setAttribute("list", list);
			request.setAttribute("pagination",pagination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "poetriesList";
	}
}

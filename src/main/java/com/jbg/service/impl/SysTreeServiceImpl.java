package com.jbg.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.jbg.entity.SysDept;
import com.jbg.mapper.SysDeptMapper;
import com.jbg.service.SysTreeService;
import com.jbg.utils.LevelUtils;
import com.jbg.vo.DeptLevelVo;
/**
 * 1.SysTreeServiceImpl的业务逻辑层实现类
 * 项目名称：jbg_system 
 * 类名称：SysTreeServiceImpl
 * 开发者：Lenovo
 * 开发时间：2019年9月18日下午4:20:53
 */
@Service
public class SysTreeServiceImpl implements SysTreeService {

	@Autowired
	private SysDeptMapper sysDeptMapper;

	/**
	 * 1.获取部门树形结构
	 */
	@Override
	public List<DeptLevelVo> deptTree() {
		List<SysDept> deptList = sysDeptMapper.getAllDept();

		List<DeptLevelVo> voList = new ArrayList<>();
		for (SysDept sysDept : deptList) {
			DeptLevelVo adapt = DeptLevelVo.adapt(sysDept);
			voList.add(adapt);
		}
		return deptListToTree(voList);
	}

	/**
	 * 组装Tree数据结构
	 * @param voList
	 * @return
	 */
	private List<DeptLevelVo> deptListToTree(List<DeptLevelVo> deptLevelList){
		if(CollectionUtils.isEmpty(deptLevelList)) {
			return new ArrayList<>();
		}
		//level -> [dept1, dept2, .....]
		Multimap<String,DeptLevelVo> levelDeptMap = ArrayListMultimap.create();
		List<DeptLevelVo> rootList = new ArrayList<>();

		for (DeptLevelVo deptLevelVo : deptLevelList) {
			//根据level添加到map里面
			levelDeptMap.put(deptLevelVo.getLevel(), deptLevelVo);
			if(LevelUtils.ROOT.equals(deptLevelVo.getLevel())) {
				rootList.add(deptLevelVo);
			}
		}
		
		//安装seq进行从小到大来进行排序
		Collections.sort(rootList, new Comparator<DeptLevelVo>() {
			@Override
			public int compare(DeptLevelVo o1, DeptLevelVo o2) {
				return o1.getSeq() - o2.getSeq();
			}
		});		
		
		//递归生成树
		transformDeptTree(deptLevelList, LevelUtils.ROOT, levelDeptMap);
		
		return rootList;
	}
	
	
	private void transformDeptTree(List<DeptLevelVo> deptLevelVos, String level, Multimap<String,DeptLevelVo> levelDeptMap) {
		for (int i = 0; i < deptLevelVos.size(); i++) {
			//遍历该层的每个元素
			DeptLevelVo deptLevelVo = deptLevelVos.get(i);
			//处理当前层级的数据
			String nextLevel = LevelUtils.calculateLevel(level, deptLevelVo.getId());
			//处理下一层
			List<DeptLevelVo> tempDeptList = (List<DeptLevelVo>)levelDeptMap.get(nextLevel);
			if(!CollectionUtils.isEmpty(tempDeptList)) {
				//排序
				
				//设置下一层部门
				
				//进入到下一层处理
				
				
			}
		}
	}
}

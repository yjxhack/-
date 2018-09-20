package com.imooc.classloader;

/**
 * BaseManager的子类，此类需要实现java类的热加载功能
 * @author liuyazhuang
 *
 */
public class MyManager implements BaseManager {

	@Override
	public void logic() {
		System.out.println("我在成都上班");
		System.out.println("这里是维也纳国际大酒店，上海市中国的国际化大都市");
		
		
	}

}

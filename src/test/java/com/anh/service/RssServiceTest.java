package com.anh.service;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.anh.exception.RssException;

public class RssServiceTest {

	private RssService rssService;
	
	@Before
	public void setUp() throws Exception {
		rssService = new RssService();
	}

	@Test
	public void testGetItemsFile() throws RssException {
		//List<Item> item = rssService.getItems(new File("test-rss/javavids.xml"));
	}

}

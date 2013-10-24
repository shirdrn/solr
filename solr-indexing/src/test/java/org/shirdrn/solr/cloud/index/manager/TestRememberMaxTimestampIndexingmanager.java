package org.shirdrn.solr.cloud.index.manager;

import org.junit.Test;
import org.shirdrn.solr.indexing.common.AbstractIndexingManager;
import org.shirdrn.solr.indexing.index.manager.RememberMaxTimestampIndexingmanager;

public class TestRememberMaxTimestampIndexingmanager {

	@Test
	public void start() {
		String[] args = new String[] {};
		AbstractIndexingManager.startIndexer(RememberMaxTimestampIndexingmanager.class, args);
	}
}

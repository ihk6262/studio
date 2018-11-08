package com.samsung.sds.brightics.server.common.message.metadata;

import com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.DataAliasMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.DataPermissionMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.DataStatusListMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.ExecuteDataMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.ExecuteSqlMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.ImportDataMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.RemoveDataAliasMessage;
import com.samsung.sds.brightics.common.network.proto.metadata.ResultDataMessage;
import com.samsung.sds.brightics.common.network.sender.MessageSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetadataMessageManager {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(MetadataMessageManager.class);
	private final MessageSender sender;

	public MetadataMessageManager(MessageSender sender) {
		this.sender = sender;
	}

	public ResultDataMessage sendDataStatusList(DataStatusListMessage message) {
		return sender.sendDataStatusList(message);
	}

	public ResultDataMessage sendSqlData(ExecuteSqlMessage message) {
		return sender.sendSqlData(message);
	}

	public ResultDataMessage sendManipulateData(ExecuteDataMessage message) {
		return sender.sendManipulateData(message);
	}

	public ResultDataMessage sendManipulateImportData(ImportDataMessage message) {
		return sender.sendManipulateImportData(message);
	}

	public void sendDataAlias(DataAliasMessage message) {
		sender.addDataAlias(message);
	}

    public ResultDataMessage sendChangeDataPermission(DataPermissionMessage message) {
        return this.sender.sendChangeDataPermission(message);
    }

    public ResultDataMessage sendDataAliasByDataKey(DataAliasByDataKeyMessage message) {
        return sender.addDataAliasByDataKey(message);
    }

    public ResultDataMessage sendRemoveDataAlias(RemoveDataAliasMessage message) {
        return sender.removeDataAlias(message);
    }
}

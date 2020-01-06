/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.common.util;

/**
 * Define constants in the system.
 * 
 * @author smartloli.
 *
 *         Created by Jan 3, 2017
 */
public class KConstants {

	/** D3 data plugin size. */
	public final class D3 {
		private D3() {
		}

		public static final int SIZE = 40;
	}

	public enum OperateSystem {
		OS_NAME("os.name"),
		LINUX("Linux");

		private String value;

		public String getValue() {
			return value;
		}

		private OperateSystem(String value) {
			this.value = value;
		}

	}

	/** Kafka parameter setting. */
	public static final class Kafka {
		private Kafka() {
		}

		public static final String CONSUMER_OFFSET_TOPIC = "__consumer_offsets";
		public static final String KAFKA_EAGLE_SYSTEM_GROUP = "kafka.eagle.system.group";
		public static final String AUTO_COMMIT = "true";
		public static final String AUTO_COMMIT_MS = "1000";
		public static final String EARLIEST = "earliest";
		public static final String JAVA_SECURITY = "java.security.auth.login.config";
		public static final int TIME_OUT = 100;
		public static final long POSITION = SystemConfigUtils.getLongProperty("kafka.eagle.sql.topic.records.max") == 0 ? 5000 : SystemConfigUtils.getLongProperty("kafka.eagle.sql.topic.records.max");
		public static final String PARTITION_CLASS = "partitioner.class";
		public static final String KEY_SERIALIZER = "key.serializer";
		public static final String VALUE_SERIALIZER = "value.serializer";
		public static final String UNKOWN = "Unknown";

	}

	/** Zookeeper session. */
	public final class SessionAlias {
		private SessionAlias() {
		}

		public static final String CLUSTER_ALIAS = "clusterAlias";
		public static final String CLUSTER_ALIAS_LIST = "clusterAliasList";
		public static final int CLUSTER_ALIAS_LIST_LIMIT = 5;
	}

	/** Login session. */
	public final class Login {
		private Login() {
		}

		public static final String SESSION_USER = "LOGIN_USER_SESSION";
		public static final String UNKNOW_USER = "__unknow__";
		public static final String ERROR_LOGIN = "error_msg";
	}

	/** Role Administrator. */
	public interface Role {
		public final static String ADMIN = "admin";
		public final static int ADMINISRATOR = 1;
		public final static int ANONYMOUS = 0;
		public final static String WHETHER_SYSTEM_ADMIN = "WHETHER_SYSTEM_ADMIN";
	}

	/** Kafka jmx mbean. */
	public interface MBean {
		public final static String COUNT = "Count";
		public final static String EVENT_TYPE = "EventType";
		public final static String FIFTEEN_MINUTE_RATE = "FifteenMinuteRate";
		public final static String FIVE_MINUTE_RATE = "FiveMinuteRate";
		public final static String MEAN_RATE = "MeanRate";
		public final static String ONE_MINUTE_RATE = "OneMinuteRate";
		public final static String RATE_UNIT = "RateUnit";
		public final static String VALUE = "Value";

		/** Messages in /sec. */
		public final static String MESSAGES_IN = "msg";
		/** Bytes in /sec. */
		public final static String BYTES_IN = "ins";
		/** Bytes out /sec. */
		public final static String BYTES_OUT = "out";
		/** Bytes rejected /sec. */
		public final static String BYTES_REJECTED = "rejected";
		/** Failed fetch request /sec. */
		public final static String FAILED_FETCH_REQUEST = "fetch";
		/** Failed produce request /sec. */
		public final static String FAILED_PRODUCE_REQUEST = "produce";

		/** MBean keys. */
		public final static String MESSAGEIN = "message_in";
		public final static String BYTEIN = "byte_in";
		public final static String BYTEOUT = "byte_out";
		public final static String BYTESREJECTED = "byte_rejected";
		public final static String FAILEDFETCHREQUEST = "failed_fetch_request";
		public final static String FAILEDPRODUCEREQUEST = "failed_produce_request";
		public final static String PRODUCEMESSAGECONVERSIONS = "produce_message_conversions";
		public final static String TOTALFETCHREQUESTSPERSEC = "total_fetch_requests";
		public final static String TOTALPRODUCEREQUESTSPERSEC = "total_produce_requests";
		public final static String REPLICATIONBYTESINPERSEC = "replication_bytes_out";
		public final static String REPLICATIONBYTESOUTPERSEC = "replication_bytes_in";
		public final static String OSTOTALMEMORY = "os_total_memory";
		public final static String OSFREEMEMORY = "os_free_memory";
	}

	public interface Linux {
		public static final String DEVICE = "sd";
		public static final String LO = "lo";
		public static final String CPU = "cpu";
		public static final String IO = "io";
		public static final String MemTotal = "MemTotal";
		public static final String MemFree = "MemFree";
		public static final String TCP = "Tcp";
		public static final String CurrEstab = "CurrEstab";
		public static final int SLEEP = 3000;
	}

	public interface ZK {
		public static final String ZK_SEND_PACKETS = "zk_packets_sent";
		public static final String ZK_RECEIVEDPACKETS = "zk_packets_received";
		public static final String ZK_NUM_ALIVECONNRCTIONS = "zk_num_alive_connections";
		public static final String ZK_OUTSTANDING_REQUESTS = "zk_outstanding_requests";

	}

	public interface TopicCache {
		public static final String NAME = "TopicCacheData";
	}

	public interface ServerDevice {
		public static final int TIME_OUT = 3000;
		public static final int BUFFER_SIZE = 8049;
	}

	public interface CollectorType {
		public static final String ZK = "zookeeper";
		public static final String KAFKA = "kafka";
	}

	public interface Zookeeper {
		public static final String LEADER = "leader";
	}

	public interface IM {
		public static String TITLE = "Kafka Eagle Alert";
		public static String MARKDOWN = "markdown";
		public static String STRING = "string";
	}

	public interface WeChat {
		public static String TOUSER = "@all";
		public static String TOPARTY = "PartyID1|PartyID2";
		public static String TOTAG = "TagID1 | TagID2";
		public static long AGENTID = 1;
	}

	public interface Topic {
		public static int PARTITION_LENGTH = 10;
		public final static String[] KEYS = new String[] { "cleanup.policy", "compression.type", "delete.retention.ms", "file.delete.delay.ms", "flush.messages", "flush.ms", "follower.replication.throttled", "index.interval.bytes", "leader.replication.throttled.replicas", "max.message.bytes", "message.downconversion.enable", "message.format.version",
				"message.timestamp.difference.max.ms", "message.timestamp.type", "min.cleanable.dirty.ratio", "min.compaction.lag.ms", "min.insync.replicas", "preallocate", "retention.bytes", "retention.ms", "segment.bytes", "segment.index.bytes", "segment.jitter.ms", "segment.ms", "unclean.leader.election.enable" };

		public final static String ADD = "ADD";
		public final static String DELETE = "DELETE";
		public final static String DESCRIBE = "DESCRIBE";

		public final static String SUCCESS = "SUCCESS";
		public final static String FAILED = "FAILED";

		public final static String LOGSIZE = "logsize";
		public final static String CAPACITY = "capacity";

		public final static int BATCH_SIZE = 500;

		public final static int RUNNING = 0;
		public final static int SHUTDOWN = 1;
		public final static int PENDING = 2;

		public final static String RUNNING_STRING = "Running";
		public final static String SHUTDOWN_STRING = "Shutdown";
		public final static String PENDING_STRING = "Pending";

		public final static String PRODUCERS = "producers";
		public final static String CONSUMERS = "consumers";
		public final static String LAG = "lag";
	}

	public interface Component {
		/** Flink app consumer don't commit consumer info into kafka. */
		public static String UNKNOW = "unknow-host";

	}

	public interface AlarmType {
		public static String[] TYPE = new String[] { "DingDing", "WeChat", "Email" };
		public static String[] CLUSTER = new String[] { "Kafka", "Zookeeper", "Topic" };
		public static String[] LEVEL = new String[] { "P0", "P1", "P2", "P3" };
		public static int[] MAXTIMES = new int[] { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		public static String EMAIL = "Email";
		public static String DingDing = "DingDing";
		public static String WeChat = "WeChat";
		public static String WebHook = "WebHook";
		public static String HTTP_GET = "get";
		public static String HTTP_POST = "post";
		public static String DISABLE = "N";
		public static String TOPIC = "Topic";
	}

	public interface AlarmQueue {
		public static String JOB_PARAMS = "job_params";
	}

}

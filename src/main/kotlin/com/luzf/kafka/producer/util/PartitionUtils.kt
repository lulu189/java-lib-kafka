package com.luzf.kafka.producer.util

import org.apache.kafka.common.serialization.StringSerializer
import org.apache.kafka.common.utils.Utils

object PartitionUtils {

    /**
     * 返回对应 [key] 在该 [topic] 下的分区
     */
    fun partition(topic: String, key: String, numPartitions: Int): Int {
        val keyStringSerializer = StringSerializer()
        val keyBytes = keyStringSerializer.serialize(topic, key)

        return Utils.toPositive(Utils.murmur2(keyBytes)) % numPartitions
    }
}
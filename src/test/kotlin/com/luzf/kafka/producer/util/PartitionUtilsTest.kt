package com.luzf.kafka.producer.util

import org.junit.Assert
import org.junit.Test

class PartitionUtilsTest {

    @Test
    fun partitionTest() {
        val topic = "lu_test"
        val key = "lu"
        val numPartitions = 20

        Assert.assertEquals(PartitionUtils.partition(topic, key, numPartitions), 16)
    }
}
/*
 * Tencent is pleased to support the open source community by making Spring Cloud Tencent available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.cloud.polaris.tsf;

import com.tencent.cloud.common.tsf.ConditionalOnTsfEnabled;
import com.tencent.cloud.polaris.DiscoveryPropertiesAutoConfiguration;

import org.springframework.cloud.commons.util.UtilAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Bootstrap configuration for TSF discovery.
 *
 * @author Haotian Zhang
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnTsfEnabled
@Import({TsfDiscoveryPropertiesAutoConfiguration.class,
		DiscoveryPropertiesAutoConfiguration.class,
		UtilAutoConfiguration.class})
public class TsfDiscoveryPropertiesBootstrapConfiguration {

}
/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.ai.dashscope.common;

/**
 * @author nuocheng.lxm
 * @date 2024/7/24 11:37
 */
public class DashScopeException extends RuntimeException {

	public DashScopeException(String message) {
		super(message);
	}

	public DashScopeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DashScopeException(ErrorCodeEnum error) {
		super(error.getCode() + ":" + error.message());
	}

}

/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import static org.springframework.restdocs.RestDocumentation.modifyResponseTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;

public class ResponsePostProcessing {

	private MockMvc mockMvc;

	public void general() throws Exception {
		// tag::general[]
		this.mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andDo(modifyResponseTo(/* ... */) // <1>
					.andDocument("index")); // <2>
		// end::general[]
	}

}

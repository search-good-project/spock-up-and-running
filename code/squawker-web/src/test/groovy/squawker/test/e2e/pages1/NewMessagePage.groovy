/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package squawker.test.e2e.pages1

import geb.Page

// tag::interactive-page[]
class NewMessagePage extends Page {

  static url = "#/new-message"

  static atCheckWaiting = true
  static at = {
    $(".page-header").text() == "New Message"
  }

  static content = {
    textarea {
      $(".sq-new-message textarea") // <1>
    }
    postButton {
      $(".sq-new-message button[type=submit]") // <2>
    }
  }
}
// end::interactive-page[]

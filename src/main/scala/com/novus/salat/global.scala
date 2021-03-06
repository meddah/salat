/**
* Copyright (c) 2010, 2011 Novus Partners, Inc. <http://novus.com>
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
* For questions and comments about this product, please see the project page at:
*
* http://github.com/novus/salat
*
*/
package com.novus.salat

import java.math.{RoundingMode, MathContext}

package object global {
  implicit val ctx = new Context { val name = Some("global") }
  val NoTypeHints = new Context {
    val name = Some("global-no-type-hints")
    override val typeHint = None
  }
  implicit val mathCtx = new MathContext(17, RoundingMode.HALF_UP)
}

/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api.xml;

import org.w3c.dom.Node;

/**
 * Implementation of {@link XmlNodeAssert} handling xml element nodes.  
 * 
 * @author Michał Piotrkowski
 */
public class XmlElementAssert extends AbstractXmlNodeAssert {

  public XmlElementAssert(Node actual) {
    super(actual, XmlElementAssert.class);
  }
  
  @Override
  protected String type() {
    return "element";
  }

  @Override
  public XmlNodeAssert isElement() {

    // success 
    return myself;
  }

}
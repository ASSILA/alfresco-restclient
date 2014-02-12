/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.alfresco.dto.content;

import java.io.File;

import uk.co.techblue.alfresco.dto.BaseDto;

/**
 * The Class DocumentContent.
 */
public class DocumentContent extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7947888264561168246L;

    /** The doc file. */
    private File docFile;

    /**
     * Gets the doc file.
     * 
     * @return the doc file
     */
    public File getDocFile() {
        return docFile;
    }

    /**
     * Sets the doc file.
     * 
     * @param docFile the new doc file
     */
    public void setDocFile(final File docFile) {
        this.docFile = docFile;
    }
}

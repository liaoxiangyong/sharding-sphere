/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.metadata;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Table metadata.
 *
 * @author panjuan
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class TableMetaData {
    
    private final Collection<ColumnMetaData> columnMetaData;
    
    /**
     * Get all column names.
     *
     * @return column name list.
     */
    public List<String> getAllColumnNames() {
        List<String> columnNames = new ArrayList<>();
        for (ColumnMetaData each : columnMetaData) {
            columnNames.add(each.getColumnName());
        }
        return columnNames;
    }
}

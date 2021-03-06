/*
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
 */
package com.facebook.presto.spi;

public interface ConnectorHandleResolver
{
    boolean canHandle(ConnectorTableHandle tableHandle);

    boolean canHandle(ConnectorColumnHandle columnHandle);

    boolean canHandle(ConnectorSplit split);

    boolean canHandle(ConnectorIndexHandle indexHandle);

    boolean canHandle(ConnectorOutputTableHandle tableHandle);

    boolean canHandle(ConnectorInsertTableHandle tableHandle);

    Class<? extends ConnectorTableHandle> getTableHandleClass();

    Class<? extends ConnectorColumnHandle> getColumnHandleClass();

    Class<? extends ConnectorIndexHandle> getIndexHandleClass();

    Class<? extends ConnectorSplit> getSplitClass();

    Class<? extends ConnectorOutputTableHandle> getOutputTableHandleClass();

    Class<? extends ConnectorInsertTableHandle> getInsertTableHandleClass();
}

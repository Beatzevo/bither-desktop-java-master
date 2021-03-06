/**
 * Copyright 2011 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bither.platform.listener;

/**
 * <p>Generic response to provide the following to {@link net.bither.platform.GenericApplication}:</p>
 * <ul>
 * <li>Proxies any native handling code for quit response</li>
 * </ul>
 *
 * @since 0.3.0
 */
public interface GenericQuitResponse extends GenericEvent {

    /**
     * Call if quit should be stopped due to application tasks
     */
    void cancelQuit();

    /**
     * Call if quit is OK to proceed
     */
    void performQuit();
}

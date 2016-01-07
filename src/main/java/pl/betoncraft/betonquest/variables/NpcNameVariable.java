/**
 * BetonQuest - advanced quests for Bukkit
 * Copyright (C) 2015  Jakub "Co0sh" Sapalski
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.betoncraft.betonquest.variables;

import pl.betoncraft.betonquest.BetonQuest;
import pl.betoncraft.betonquest.api.Variable;
import pl.betoncraft.betonquest.conversation.Conversation;

/**
 * This variable resolves into the name of the NPC.
 * 
 * @author Jakub Sapalski
 */
public class NpcNameVariable extends Variable {

    public NpcNameVariable(String packName, String instruction) {
        super(packName, instruction);
    }
    
    @Override
    public String getValue(String playerID) {
        return Conversation.getConversation(playerID).getData()
                .getQuester(BetonQuest.getInstance().getDBHandler(playerID)
                .getLanguage());
    }

}
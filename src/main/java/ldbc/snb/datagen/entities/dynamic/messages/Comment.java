/* 
 Copyright (c) 2013 LDBC
 Linked Data Benchmark Council (http://www.ldbcouncil.org)
 
 This file is part of ldbc_snb_datagen.
 
 ldbc_snb_datagen is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 
 ldbc_snb_datagen is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with ldbc_snb_datagen.  If not, see <http://www.gnu.org/licenses/>.
 
 Copyright (C) 2011 OpenLink Software <bdsmt@openlinksw.com>
 All Rights Reserved.
 
 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation;  only Version 2 of the License dated
 June 1991.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.*/
package ldbc.snb.datagen.entities.dynamic.messages;


import ldbc.snb.datagen.entities.dynamic.person.IP;
import ldbc.snb.datagen.entities.dynamic.person.PersonSummary;

import java.util.TreeSet;

public class Comment extends Message {

    private long postId;
    private long replyOf;

    public Comment() {
        super();
    }

    public Comment(Comment comment) {
        super(comment.getMessageId(), comment.getCreationDate(), comment.getDeletionDate(), comment.getAuthor(), comment.getForumId(), comment.getContent(),
              comment.getTags(), comment.getCountryId(), comment.getIpAddress(), comment.getBrowserId(),comment.isExplicitlyDeleted());
        postId = comment.postId();
        replyOf = comment.replyOf();
    }

    public Comment(long commentId,
                   long creationDate,
                   long deletionDate,
                   PersonSummary author,
                   long forumId,
                   String content,
                   TreeSet<Integer> tags,
                   int countryId,
                   IP ipAddress,
                   int browserId,
                   long postId,
                   long replyOf,
                   boolean isExplicitlyDeleted
    ) {

        super(commentId, creationDate, deletionDate, author, forumId, content, tags, countryId, ipAddress, browserId,isExplicitlyDeleted);
        this.postId = postId;
        this.replyOf = replyOf;
    }

    public void initialize(long commentId,
                           long creationDate,
                           long deletionDate,
                           PersonSummary author,
                           long forumId,
                           String content,
                           TreeSet<Integer> tags,
                           int countryId,
                           IP ipAddress,
                           int browserId,
                           long postId,
                           long replyOf,
                           boolean isExplicitlyDeleted) {
        super.initialize(commentId, creationDate, deletionDate, author, forumId, content, tags, countryId, ipAddress, browserId,isExplicitlyDeleted);
        this.postId = postId;
        this.replyOf = replyOf;
    }

    public long postId() {
        return postId;
    }

    public long replyOf() {
        return replyOf;
    }


}

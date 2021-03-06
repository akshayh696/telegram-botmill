/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.telegram.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.google.gson.annotations.SerializedName;

/**
 * Upon receiving a message with this object, Telegram clients will display a
 * reply interface to the user (act as if the user has selected the bot�s
 * message and tapped �Reply'). This can be extremely useful if you want to
 * create user-friendly step-by-step interfaces without having to sacrifice <a
 * href="https://core.telegram.org/bots#privacy-mode">privacy mode</a>.<br/>
 * <br/>
 * Example: A poll bot for groups runs in privacy mode (only receives commands,
 * replies to its messages and mentions). There could be two ways to create a
 * new poll:
 * <ul>
 * <li>Explain the user how to send a command with parameters (e.g. /newpoll
 * question answer1 answer2). May be appealing for hardcore users but lacks
 * modern day polish.</li>
 * <li>Guide the user through a step-by-step process. �Please send me your
 * question�, �Cool, now let�s add the first answer option�, �Great. Keep adding
 * answer options, then send /done when you�re ready�.</li>
 * </ul>
 * The last option is definitely more attractive. And if you use ForceReply in
 * your bot�s questions, it will receive the user�s answers even if it only
 * receives replies, commands and mentions � without any extra work for the
 * user.
 * 
 * @author Donato Rimenti
 * 
 */
public class ForceReply implements ReplyMarkupOption, Serializable {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Shows reply interface to the user, as if they manually selected the bot�s
	 * message and tapped �Reply'.
	 */
	@NotNull
	@SerializedName("force_reply")
	private boolean forceReply;

	/**
	 * Optional. Use this parameter if you want to force reply from specific
	 * users only. Targets: 1) users that are @mentioned in the text of the
	 * {@link Message} object; 2) if the bot's message is a reply (has
	 * reply_to_message_id), sender of the original message.
	 */
	private boolean selective;

	/**
	 * Gets the {@link #forceReply}.
	 *
	 * @return the {@link #forceReply}.
	 */
	public boolean isForceReply() {
		return forceReply;
	}

	/**
	 * Sets the {@link #forceReply}.
	 *
	 * @param forceReply the {@link #forceReply} to set.
	 */
	public void setForceReply(boolean forceReply) {
		this.forceReply = forceReply;
	}

	/**
	 * Gets the {@link #selective}.
	 *
	 * @return the {@link #selective}.
	 */
	public boolean isSelective() {
		return selective;
	}

	/**
	 * Sets the {@link #selective}.
	 *
	 * @param selective the {@link #selective} to set.
	 */
	public void setSelective(boolean selective) {
		this.selective = selective;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (forceReply ? 1231 : 1237);
		result = prime * result + (selective ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForceReply other = (ForceReply) obj;
		if (forceReply != other.forceReply)
			return false;
		if (selective != other.selective)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ForceReply [forceReply=" + forceReply + ", selective="
				+ selective + "]";
	}

}

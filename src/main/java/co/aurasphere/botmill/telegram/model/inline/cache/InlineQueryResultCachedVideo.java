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
package co.aurasphere.botmill.telegram.model.inline.cache;

import com.google.gson.annotations.SerializedName;

import co.aurasphere.botmill.telegram.model.inline.InlineQueryResultType;

/**
 * Represents a link to a video file stored on the Telegram servers. By default,
 * this video file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the video.
 * 
 * @author Donato Rimenti
 * 
 */
public class InlineQueryResultCachedVideo extends InlineQueryResultCached {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A valid file identifier for the video file.
	 */
	@SerializedName("video_file_id")
	private String videoFileId;

	/**
	 * Title for the result.
	 */
	private String title;

	/**
	 * Optional. Short description of the result.
	 */
	private String description;

	// TODO: validation?
	/**
	 * Optional. Caption of the video to be sent, 0-200 characters.
	 */
	private String caption;

	/**
	 * Instantiates a new InlineQueryResultCachedVideo.
	 */
	public InlineQueryResultCachedVideo() {
		super(InlineQueryResultType.VIDEO);
	}

	/**
	 * Gets the {@link #videoFileId}.
	 *
	 * @return the {@link #videoFileId}.
	 */
	public String getVideoFileId() {
		return videoFileId;
	}

	/**
	 * Sets the {@link #videoFileId}.
	 *
	 * @param videoFileId
	 *            the {@link #videoFileId} to set.
	 */
	public void setVideoFileId(String videoFileId) {
		this.videoFileId = videoFileId;
	}

	/**
	 * Gets the {@link #title}.
	 *
	 * @return the {@link #title}.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the {@link #title}.
	 *
	 * @param title
	 *            the {@link #title} to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the {@link #description}.
	 *
	 * @return the {@link #description}.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the {@link #description}.
	 *
	 * @param description
	 *            the {@link #description} to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the {@link #caption}.
	 *
	 * @return the {@link #caption}.
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * Sets the {@link #caption}.
	 *
	 * @param caption
	 *            the {@link #caption} to set.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.
	 * InlineQueryInputMessageContentResult#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((videoFileId == null) ? 0 : videoFileId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.aurasphere.botmill.telegram.model.inline.
	 * InlineQueryInputMessageContentResult#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InlineQueryResultCachedVideo other = (InlineQueryResultCachedVideo) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (videoFileId == null) {
			if (other.videoFileId != null)
				return false;
		} else if (!videoFileId.equals(other.videoFileId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.aurasphere.botmill.telegram.model.inline.cache.InlineQueryResultCached
	 * #toString()
	 */
	@Override
	public String toString() {
		return "InlineQueryResultCachedVideo [videoFileId=" + videoFileId
				+ ", title=" + title + ", description=" + description
				+ ", caption=" + caption + ", inputMessageContent="
				+ inputMessageContent + ", type=" + type + ", id=" + id + "]";
	}

}

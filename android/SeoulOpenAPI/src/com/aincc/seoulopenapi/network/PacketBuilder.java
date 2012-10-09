package com.aincc.seoulopenapi.network;

import com.aincc.lib.network.common.IPacket;

/**
 * 
 * <h3><b>PacketBuilder</b></h3></br>
 * 
 * @author aincc@barusoft.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class PacketBuilder implements IPacket
{

	/**
	 * response buffer
	 * 
	 * @since 1.0.0
	 */
	private StringBuffer buffer = null;

	/**
	 * constructor
	 * 
	 * @since 1.0.0
	 * @param buffer
	 */
	public PacketBuilder(StringBuffer buffer)
	{
		this.buffer = buffer;
	}

	@Override
	public String getTransCode() throws Exception
	{
		// no use
		return null;
	}

	@Override
	public void fromBytes(byte[] param)
	{
		// no use
	}

	@Override
	public byte[] toBytes()
	{
		// no use
		return null;
	}

	@Override
	public String toString()
	{
		return this.buffer.toString();
	}

}

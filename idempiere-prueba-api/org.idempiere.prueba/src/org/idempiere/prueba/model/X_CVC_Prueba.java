/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.idempiere.prueba.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for CVC_Prueba
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="CVC_Prueba")
public class X_CVC_Prueba extends PO implements I_CVC_Prueba, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250829L;

    /** Standard Constructor */
    public X_CVC_Prueba (Properties ctx, int CVC_Prueba_ID, String trxName)
    {
      super (ctx, CVC_Prueba_ID, trxName);
      /** if (CVC_Prueba_ID == 0)
        {
			setCVC_Prueba_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_CVC_Prueba (Properties ctx, int CVC_Prueba_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, CVC_Prueba_ID, trxName, virtualColumns);
      /** if (CVC_Prueba_ID == 0)
        {
			setCVC_Prueba_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_CVC_Prueba (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_CVC_Prueba[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set tabla prueba.
		@param CVC_Prueba_ID tabla prueba
	*/
	public void setCVC_Prueba_ID (int CVC_Prueba_ID)
	{
		if (CVC_Prueba_ID < 1)
			set_ValueNoCheck (COLUMNNAME_CVC_Prueba_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_CVC_Prueba_ID, Integer.valueOf(CVC_Prueba_ID));
	}

	/** Get tabla prueba.
		@return tabla prueba	  */
	public int getCVC_Prueba_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CVC_Prueba_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CVC_Prueba_UU.
		@param CVC_Prueba_UU CVC_Prueba_UU
	*/
	public void setCVC_Prueba_UU (String CVC_Prueba_UU)
	{
		set_Value (COLUMNNAME_CVC_Prueba_UU, CVC_Prueba_UU);
	}

	/** Get CVC_Prueba_UU.
		@return CVC_Prueba_UU	  */
	public String getCVC_Prueba_UU()
	{
		return (String)get_Value(COLUMNNAME_CVC_Prueba_UU);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}
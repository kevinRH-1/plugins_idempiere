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

/** Generated Model for XX_dolar_api
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="XX_dolar_api")
public class X_XX_dolar_api extends PO implements I_XX_dolar_api, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250826L;

    /** Standard Constructor */
    public X_XX_dolar_api (Properties ctx, int XX_dolar_api_id, String trxName)
    {
      super (ctx, XX_dolar_api_id, trxName);
      /** if (XX_dolar_api_id == 0)
        {
			setName (null);
			setT_dolar_api_id (0);
        } */
    }

    /** Standard Constructor */
    public X_XX_dolar_api (Properties ctx, int XX_dolar_api_id, String trxName, String ... virtualColumns)
    {
      super (ctx, XX_dolar_api_id, trxName, virtualColumns);
      /** if (XX_dolar_api_ID == 0)
        {
			setName (null);
			setT_dolar_api_ID (0);
        } */
    }

    /** Load Constructor */
    public X_XX_dolar_api (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
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
      StringBuilder sb = new StringBuilder ("X_XX_dolar_api[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set consulta.
		@param c_api consulta
	*/
	public void setc_api (String c_api)
	{
		set_Value (COLUMNNAME_c_api, c_api);
	}

	/** Get consulta.
		@return consulta	  */
	public String getc_api()
	{
		return (String)get_Value(COLUMNNAME_c_api);
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

	/** Set precio.
		@param precio precio
	*/
	public void setprecio (String precio)
	{
		set_Value (COLUMNNAME_precio, precio);
	}

	/** Get precio.
		@return precio	  */
	public String getprecio()
	{
		return (String)get_Value(COLUMNNAME_precio);
	}

	/** Set dolar api.
		@param T_dolar_api_ID dolar api
	*/
	public void setT_dolar_api_ID (int T_dolar_api_ID)
	{
		if (T_dolar_api_ID < 1)
			set_ValueNoCheck (COLUMNNAME_T_dolar_api_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_T_dolar_api_ID, Integer.valueOf(T_dolar_api_ID));
	}

	/** Get dolar api.
		@return dolar api	  */
	public int getT_dolar_api_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_dolar_api_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set T_dolar_api_UU.
		@param T_dolar_api_UU T_dolar_api_UU
	*/
	public void setT_dolar_api_UU (String T_dolar_api_UU)
	{
		set_Value (COLUMNNAME_T_dolar_api_UU, T_dolar_api_UU);
	}

	/** Get T_dolar_api_UU.
		@return T_dolar_api_UU	  */
	public String getT_dolar_api_UU()
	{
		return (String)get_Value(COLUMNNAME_T_dolar_api_UU);
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
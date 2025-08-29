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

/** Generated Model for CVC_Prueba_Detalles
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="CVC_Prueba_Detalles")
public class X_CVC_Prueba_Detalles extends PO implements I_CVC_Prueba_Detalles, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250829L;

    /** Standard Constructor */
    public X_CVC_Prueba_Detalles (Properties ctx, int CVC_Prueba_Detalles_ID, String trxName)
    {
      super (ctx, CVC_Prueba_Detalles_ID, trxName);
      /** if (CVC_Prueba_Detalles_ID == 0)
        {
			setCVC_Prueba_Detalles_ID (0);
			setCVC_Prueba_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_CVC_Prueba_Detalles (Properties ctx, int CVC_Prueba_Detalles_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, CVC_Prueba_Detalles_ID, trxName, virtualColumns);
      /** if (CVC_Prueba_Detalles_ID == 0)
        {
			setCVC_Prueba_Detalles_ID (0);
			setCVC_Prueba_ID (0);
        } */
    }

    /** Load Constructor */
    public X_CVC_Prueba_Detalles (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_CVC_Prueba_Detalles[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set prueba detalles.
		@param CVC_Prueba_Detalles_ID prueba detalles
	*/
	public void setCVC_Prueba_Detalles_ID (int CVC_Prueba_Detalles_ID)
	{
		if (CVC_Prueba_Detalles_ID < 1)
			set_ValueNoCheck (COLUMNNAME_CVC_Prueba_Detalles_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_CVC_Prueba_Detalles_ID, Integer.valueOf(CVC_Prueba_Detalles_ID));
	}

	/** Get prueba detalles.
		@return prueba detalles	  */
	public int getCVC_Prueba_Detalles_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CVC_Prueba_Detalles_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CVC_Prueba_Detalles_UU.
		@param CVC_Prueba_Detalles_UU CVC_Prueba_Detalles_UU
	*/
	public void setCVC_Prueba_Detalles_UU (String CVC_Prueba_Detalles_UU)
	{
		set_Value (COLUMNNAME_CVC_Prueba_Detalles_UU, CVC_Prueba_Detalles_UU);
	}

	/** Get CVC_Prueba_Detalles_UU.
		@return CVC_Prueba_Detalles_UU	  */
	public String getCVC_Prueba_Detalles_UU()
	{
		return (String)get_Value(COLUMNNAME_CVC_Prueba_Detalles_UU);
	}

	public I_CVC_Prueba getCVC_Prueba() throws RuntimeException
	{
		return (I_CVC_Prueba)MTable.get(getCtx(), I_CVC_Prueba.Table_ID)
			.getPO(getCVC_Prueba_ID(), get_TrxName());
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
}
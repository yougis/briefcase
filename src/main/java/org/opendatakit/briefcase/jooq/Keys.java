/*
 * This file is generated by jOOQ.
 */
package org.opendatakit.briefcase.jooq;


import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.opendatakit.briefcase.jooq.tables.FormMetadata;
import org.opendatakit.briefcase.jooq.tables.records.FormMetadataRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

  // -------------------------------------------------------------------------
  // IDENTITY definitions
  // -------------------------------------------------------------------------


  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  public static final UniqueKey<FormMetadataRecord> SYS_PK_10131 = UniqueKeys0.SYS_PK_10131;
  public static final UniqueKey<FormMetadataRecord> SYS_CT_10133 = UniqueKeys0.SYS_CT_10133;

  // -------------------------------------------------------------------------
  // FOREIGN KEY definitions
  // -------------------------------------------------------------------------


  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private static class UniqueKeys0 {
    public static final UniqueKey<FormMetadataRecord> SYS_PK_10131 = Internal.createUniqueKey(FormMetadata.FORM_METADATA, "SYS_PK_10131", FormMetadata.FORM_METADATA.ID);
    public static final UniqueKey<FormMetadataRecord> SYS_CT_10133 = Internal.createUniqueKey(FormMetadata.FORM_METADATA, "SYS_CT_10133", FormMetadata.FORM_METADATA.FORM_NAME, FormMetadata.FORM_METADATA.FORM_ID, FormMetadata.FORM_METADATA.FORM_VERSION);
  }
}

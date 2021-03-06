/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.eharmony.aloha.audit.impl.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Score extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6931384953297219663L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Score\",\"namespace\":\"com.eharmony.aloha.audit.impl.avro\",\"fields\":[{\"name\":\"model\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ModelId\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",{\"type\":\"array\",\"items\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]}],\"default\":null},{\"name\":\"subvalues\",\"type\":[{\"type\":\"array\",\"items\":\"Score\"},\"null\"],\"default\":[]},{\"name\":\"errorMsgs\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"],\"default\":[]},{\"name\":\"missingVarNames\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"],\"default\":[]},{\"name\":\"prob\",\"type\":[\"null\",\"float\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.eharmony.aloha.audit.impl.avro.ModelId model;
  @Deprecated public java.lang.Object value;
  @Deprecated public java.util.List<com.eharmony.aloha.audit.impl.avro.Score> subvalues;
  @Deprecated public java.util.List<java.lang.CharSequence> errorMsgs;
  @Deprecated public java.util.List<java.lang.CharSequence> missingVarNames;
  @Deprecated public java.lang.Float prob;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Score() {}

  /**
   * All-args constructor.
   * @param model The new value for model
   * @param value The new value for value
   * @param subvalues The new value for subvalues
   * @param errorMsgs The new value for errorMsgs
   * @param missingVarNames The new value for missingVarNames
   * @param prob The new value for prob
   */
  public Score(com.eharmony.aloha.audit.impl.avro.ModelId model, java.lang.Object value, java.util.List<com.eharmony.aloha.audit.impl.avro.Score> subvalues, java.util.List<java.lang.CharSequence> errorMsgs, java.util.List<java.lang.CharSequence> missingVarNames, java.lang.Float prob) {
    this.model = model;
    this.value = value;
    this.subvalues = subvalues;
    this.errorMsgs = errorMsgs;
    this.missingVarNames = missingVarNames;
    this.prob = prob;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return model;
    case 1: return value;
    case 2: return subvalues;
    case 3: return errorMsgs;
    case 4: return missingVarNames;
    case 5: return prob;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: model = (com.eharmony.aloha.audit.impl.avro.ModelId)value$; break;
    case 1: value = (java.lang.Object)value$; break;
    case 2: subvalues = (java.util.List<com.eharmony.aloha.audit.impl.avro.Score>)value$; break;
    case 3: errorMsgs = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: missingVarNames = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: prob = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'model' field.
   * @return The value of the 'model' field.
   */
  public com.eharmony.aloha.audit.impl.avro.ModelId getModel() {
    return model;
  }

  /**
   * Sets the value of the 'model' field.
   * @param value the value to set.
   */
  public void setModel(com.eharmony.aloha.audit.impl.avro.ModelId value) {
    this.model = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Object value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'subvalues' field.
   * @return The value of the 'subvalues' field.
   */
  public java.util.List<com.eharmony.aloha.audit.impl.avro.Score> getSubvalues() {
    return subvalues;
  }

  /**
   * Sets the value of the 'subvalues' field.
   * @param value the value to set.
   */
  public void setSubvalues(java.util.List<com.eharmony.aloha.audit.impl.avro.Score> value) {
    this.subvalues = value;
  }

  /**
   * Gets the value of the 'errorMsgs' field.
   * @return The value of the 'errorMsgs' field.
   */
  public java.util.List<java.lang.CharSequence> getErrorMsgs() {
    return errorMsgs;
  }

  /**
   * Sets the value of the 'errorMsgs' field.
   * @param value the value to set.
   */
  public void setErrorMsgs(java.util.List<java.lang.CharSequence> value) {
    this.errorMsgs = value;
  }

  /**
   * Gets the value of the 'missingVarNames' field.
   * @return The value of the 'missingVarNames' field.
   */
  public java.util.List<java.lang.CharSequence> getMissingVarNames() {
    return missingVarNames;
  }

  /**
   * Sets the value of the 'missingVarNames' field.
   * @param value the value to set.
   */
  public void setMissingVarNames(java.util.List<java.lang.CharSequence> value) {
    this.missingVarNames = value;
  }

  /**
   * Gets the value of the 'prob' field.
   * @return The value of the 'prob' field.
   */
  public java.lang.Float getProb() {
    return prob;
  }

  /**
   * Sets the value of the 'prob' field.
   * @param value the value to set.
   */
  public void setProb(java.lang.Float value) {
    this.prob = value;
  }

  /**
   * Creates a new Score RecordBuilder.
   * @return A new Score RecordBuilder
   */
  public static com.eharmony.aloha.audit.impl.avro.Score.Builder newBuilder() {
    return new com.eharmony.aloha.audit.impl.avro.Score.Builder();
  }

  /**
   * Creates a new Score RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Score RecordBuilder
   */
  public static com.eharmony.aloha.audit.impl.avro.Score.Builder newBuilder(com.eharmony.aloha.audit.impl.avro.Score.Builder other) {
    return new com.eharmony.aloha.audit.impl.avro.Score.Builder(other);
  }

  /**
   * Creates a new Score RecordBuilder by copying an existing Score instance.
   * @param other The existing instance to copy.
   * @return A new Score RecordBuilder
   */
  public static com.eharmony.aloha.audit.impl.avro.Score.Builder newBuilder(com.eharmony.aloha.audit.impl.avro.Score other) {
    return new com.eharmony.aloha.audit.impl.avro.Score.Builder(other);
  }

  /**
   * RecordBuilder for Score instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Score>
    implements org.apache.avro.data.RecordBuilder<Score> {

    private com.eharmony.aloha.audit.impl.avro.ModelId model;
    private com.eharmony.aloha.audit.impl.avro.ModelId.Builder modelBuilder;
    private java.lang.Object value;
    private java.util.List<com.eharmony.aloha.audit.impl.avro.Score> subvalues;
    private java.util.List<java.lang.CharSequence> errorMsgs;
    private java.util.List<java.lang.CharSequence> missingVarNames;
    private java.lang.Float prob;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.eharmony.aloha.audit.impl.avro.Score.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.model)) {
        this.model = data().deepCopy(fields()[0].schema(), other.model);
        fieldSetFlags()[0] = true;
      }
      if (other.hasModelBuilder()) {
        this.modelBuilder = com.eharmony.aloha.audit.impl.avro.ModelId.newBuilder(other.getModelBuilder());
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subvalues)) {
        this.subvalues = data().deepCopy(fields()[2].schema(), other.subvalues);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.errorMsgs)) {
        this.errorMsgs = data().deepCopy(fields()[3].schema(), other.errorMsgs);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.missingVarNames)) {
        this.missingVarNames = data().deepCopy(fields()[4].schema(), other.missingVarNames);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.prob)) {
        this.prob = data().deepCopy(fields()[5].schema(), other.prob);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Score instance
     * @param other The existing instance to copy.
     */
    private Builder(com.eharmony.aloha.audit.impl.avro.Score other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.model)) {
        this.model = data().deepCopy(fields()[0].schema(), other.model);
        fieldSetFlags()[0] = true;
      }
      this.modelBuilder = null;
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subvalues)) {
        this.subvalues = data().deepCopy(fields()[2].schema(), other.subvalues);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.errorMsgs)) {
        this.errorMsgs = data().deepCopy(fields()[3].schema(), other.errorMsgs);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.missingVarNames)) {
        this.missingVarNames = data().deepCopy(fields()[4].schema(), other.missingVarNames);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.prob)) {
        this.prob = data().deepCopy(fields()[5].schema(), other.prob);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'model' field.
      * @return The value.
      */
    public com.eharmony.aloha.audit.impl.avro.ModelId getModel() {
      return model;
    }

    /**
      * Sets the value of the 'model' field.
      * @param value The value of 'model'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setModel(com.eharmony.aloha.audit.impl.avro.ModelId value) {
      validate(fields()[0], value);
      this.modelBuilder = null;
      this.model = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'model' field has been set.
      * @return True if the 'model' field has been set, false otherwise.
      */
    public boolean hasModel() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'model' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.eharmony.aloha.audit.impl.avro.ModelId.Builder getModelBuilder() {
      if (modelBuilder == null) {
        if (hasModel()) {
          setModelBuilder(com.eharmony.aloha.audit.impl.avro.ModelId.newBuilder(model));
        } else {
          setModelBuilder(com.eharmony.aloha.audit.impl.avro.ModelId.newBuilder());
        }
      }
      return modelBuilder;
    }

    /**
     * Sets the Builder instance for the 'model' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setModelBuilder(com.eharmony.aloha.audit.impl.avro.ModelId.Builder value) {
      clearModel();
      modelBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'model' field has an active Builder instance
     * @return True if the 'model' field has an active Builder instance
     */
    public boolean hasModelBuilder() {
      return modelBuilder != null;
    }

    /**
      * Clears the value of the 'model' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearModel() {
      model = null;
      modelBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Object getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setValue(java.lang.Object value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'subvalues' field.
      * @return The value.
      */
    public java.util.List<com.eharmony.aloha.audit.impl.avro.Score> getSubvalues() {
      return subvalues;
    }

    /**
      * Sets the value of the 'subvalues' field.
      * @param value The value of 'subvalues'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setSubvalues(java.util.List<com.eharmony.aloha.audit.impl.avro.Score> value) {
      validate(fields()[2], value);
      this.subvalues = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'subvalues' field has been set.
      * @return True if the 'subvalues' field has been set, false otherwise.
      */
    public boolean hasSubvalues() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'subvalues' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearSubvalues() {
      subvalues = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorMsgs' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getErrorMsgs() {
      return errorMsgs;
    }

    /**
      * Sets the value of the 'errorMsgs' field.
      * @param value The value of 'errorMsgs'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setErrorMsgs(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.errorMsgs = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMsgs' field has been set.
      * @return True if the 'errorMsgs' field has been set, false otherwise.
      */
    public boolean hasErrorMsgs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'errorMsgs' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearErrorMsgs() {
      errorMsgs = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'missingVarNames' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getMissingVarNames() {
      return missingVarNames;
    }

    /**
      * Sets the value of the 'missingVarNames' field.
      * @param value The value of 'missingVarNames'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setMissingVarNames(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.missingVarNames = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'missingVarNames' field has been set.
      * @return True if the 'missingVarNames' field has been set, false otherwise.
      */
    public boolean hasMissingVarNames() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'missingVarNames' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearMissingVarNames() {
      missingVarNames = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'prob' field.
      * @return The value.
      */
    public java.lang.Float getProb() {
      return prob;
    }

    /**
      * Sets the value of the 'prob' field.
      * @param value The value of 'prob'.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder setProb(java.lang.Float value) {
      validate(fields()[5], value);
      this.prob = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'prob' field has been set.
      * @return True if the 'prob' field has been set, false otherwise.
      */
    public boolean hasProb() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'prob' field.
      * @return This builder.
      */
    public com.eharmony.aloha.audit.impl.avro.Score.Builder clearProb() {
      prob = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Score build() {
      try {
        Score record = new Score();
        if (modelBuilder != null) {
          record.model = this.modelBuilder.build();
        } else {
          record.model = fieldSetFlags()[0] ? this.model : (com.eharmony.aloha.audit.impl.avro.ModelId) defaultValue(fields()[0]);
        }
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.Object) defaultValue(fields()[1]);
        record.subvalues = fieldSetFlags()[2] ? this.subvalues : (java.util.List<com.eharmony.aloha.audit.impl.avro.Score>) defaultValue(fields()[2]);
        record.errorMsgs = fieldSetFlags()[3] ? this.errorMsgs : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.missingVarNames = fieldSetFlags()[4] ? this.missingVarNames : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.prob = fieldSetFlags()[5] ? this.prob : (java.lang.Float) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

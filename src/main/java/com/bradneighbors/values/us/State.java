package com.bradneighbors.values.us;

/**
 * Enumerates all United States' States, Districts, and Outlying Territories.
 */
@SuppressWarnings("unused")
public enum State {

  US_AL("US_AL", "AL", "Alabama", Category.STATE),
  US_AK("US_AK", "AK", "Alaska", Category.STATE),
  US_AZ("US_AZ", "AZ", "Arizona", Category.STATE),
  US_AR("US_AR", "AR", "Arkansas", Category.STATE),
  US_CA("US_CA", "CA", "California", Category.STATE),
  US_CO("US_CO", "CO", "Colorado", Category.STATE),
  US_CT("US_CT", "CT", "Connecticut", Category.STATE),
  US_DE("US_DE", "DE", "Delaware", Category.STATE),
  US_FL("US_FL", "FL", "Florida", Category.STATE),
  US_GA("US_GA", "GA", "Georgia", Category.STATE),
  US_HI("US_HI", "HI", "Hawaii", Category.STATE),
  US_ID("US_ID", "ID", "Idaho", Category.STATE),
  US_IL("US_IL", "IL", "Illinois", Category.STATE),
  US_IN("US_IN", "IN", "Indiana", Category.STATE),
  US_IA("US_IA", "IA", "Iowa", Category.STATE),
  US_KS("US_KS", "KS", "Kansas", Category.STATE),
  US_KY("US_KY", "KY", "Kentucky", Category.STATE),
  US_LA("US_LA", "LA", "Louisiana", Category.STATE),
  US_ME("US_ME", "ME", "Maine", Category.STATE),
  US_MD("US_MD", "MD", "Maryland", Category.STATE),
  US_MA("US_MA", "MA", "Massachusetts", Category.STATE),
  US_MI("US_MI", "MI", "Michigan", Category.STATE),
  US_MN("US_MN", "MN", "Minnesota", Category.STATE),
  US_MS("US_MS", "MS", "Mississippi", Category.STATE),
  US_MO("US_MO", "MO", "Missouri", Category.STATE),
  US_MT("US_MT", "MT", "Montana", Category.STATE),
  US_NE("US_NE", "NE", "Nebraska", Category.STATE),
  US_NV("US_NV", "NV", "Nevada", Category.STATE),
  US_NH("US_NH", "NH", "New Hampshire", Category.STATE),
  US_NJ("US_NJ", "NJ", "New Jersey", Category.STATE),
  US_NM("US_NM", "NM", "New Mexico", Category.STATE),
  US_NY("US_NY", "NY", "New York", Category.STATE),
  US_NC("US_NC", "NC", "North Carolina", Category.STATE),
  US_ND("US_ND", "ND", "North Dakota", Category.STATE),
  US_OH("US_OH", "OH", "Ohio", Category.STATE),
  US_OK("US_OK", "OK", "Oklahoma", Category.STATE),
  US_OR("US_OR", "OR", "Oregon", Category.STATE),
  US_PA("US_PA", "PA", "Pennsylvania", Category.STATE),
  US_RI("US_RI", "RI", "Rhode Island", Category.STATE),
  US_SC("US_SC", "SC", "South Carolina", Category.STATE),
  US_SD("US_SD", "SD", "South Dakota", Category.STATE),
  US_TN("US_TN", "TN", "Tennessee", Category.STATE),
  US_TX("US_TX", "TX", "Texas", Category.STATE),
  US_UT("US_UT", "UT", "Utah", Category.STATE),
  US_VT("US_VT", "VT", "Vermont", Category.STATE),
  US_VA("US_VA", "VA", "Virginia", Category.STATE),
  US_WA("US_WA", "WA", "Washington", Category.STATE),
  US_WV("US_WV", "WV", "West Virginia", Category.STATE),
  US_WI("US_WI", "WI", "Wisconsin", Category.STATE),
  US_WY("US_WY", "WY", "Wyoming", Category.STATE),
  US_DC("US_DC", "DC", "DISTRICT of Columbia", Category.DISTRICT),
  US_AS("US_AS", "AS", "American Samoa", Category.OUTLYING_TERRITORY),
  US_GU("US_GU", "GU", "Guam", Category.OUTLYING_TERRITORY),
  US_MP("US_MP", "MP", "Northern Mariana Islands", Category.OUTLYING_TERRITORY),
  US_PR("US_PR", "PR", "Puerto Rico", Category.OUTLYING_TERRITORY),
  US_UM("US_UM", "UM", "United States Minor Outlying Islands", Category.OUTLYING_TERRITORY),
  US_VI("US_VI", "VI", "Virgin Islands, U.S.", Category.OUTLYING_TERRITORY);

  /**
   * Sub categorizes states by iso definition.
   */
  public static enum Category {
    STATE, DISTRICT, OUTLYING_TERRITORY
  }

  private String iso3166Dash2Code;
  private Category category;
  private String abbrieviation;
  private String name;

  private State(String iso3166Dash2Code, String stateAbbreviation, String name, Category category) {
    this.iso3166Dash2Code = iso3166Dash2Code;
    this.name = name;
    this.abbrieviation = stateAbbreviation;
    this.category = category;
  }

  /**
   * @return The ISO 3166-2 state code, like "US_AK" for Alaska.
   */
  public String getIsoCode() {
    return iso3166Dash2Code;
  }

  /**
   * @return The full name of the state, like "Alaska" for Alaska.
   */
  public String getName() {
    return name;
  }

  /**
   * @return The state's sub category.
   */
  public Category getCategory() {
    return category;
  }

  /**
   * @return The single abbreviation of the state, like "AK" for Alaska.
   */
  public String getAbbrieviation() {
    return abbrieviation;
  }
}

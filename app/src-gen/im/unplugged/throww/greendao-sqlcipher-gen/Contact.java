package im.unplugged.throww.greendao-sqlcipher-gen;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CONTACT".
 */
public class Contact {

    private Long id;
    /** Not-null value. */
    private String phoneNumber;
    /** Not-null value. */
    private String countryCode;
    /** Not-null value. */
    private String lookupKey;
    private Boolean usesThroww;

    public Contact() {
    }

    public Contact(Long id) {
        this.id = id;
    }

    public Contact(Long id, String phoneNumber, String countryCode, String lookupKey, Boolean usesThroww) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.lookupKey = lookupKey;
        this.usesThroww = usesThroww;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** Not-null value. */
    public String getCountryCode() {
        return countryCode;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** Not-null value. */
    public String getLookupKey() {
        return lookupKey;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
    }

    public Boolean getUsesThroww() {
        return usesThroww;
    }

    public void setUsesThroww(Boolean usesThroww) {
        this.usesThroww = usesThroww;
    }

}

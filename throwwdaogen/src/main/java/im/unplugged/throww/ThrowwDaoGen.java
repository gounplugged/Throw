package im.unplugged.throww;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.Entity;

public class ThrowwDaoGen {
    private static int DB_VERSION = 1;
    private static String GEN_PACKAGE = "im.unplugged.throww.greendao-sqlcipher-gen";
    private static String GEN_LOCATION = "../app/src-gen";

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(DB_VERSION, GEN_PACKAGE);

        addContact(schema);

        new DaoGenerator().generateAll(schema, GEN_LOCATION);
    }

    private static void addContact(Schema schema) {
        Entity contact = schema.addEntity("Contact");
        contact.addIdProperty();
        contact.addStringProperty("phoneNumber").notNull();
        contact.addStringProperty("countryCode").notNull();
        contact.addStringProperty("lookupKey").notNull();
        contact.addBooleanProperty("usesThroww");
    }
}

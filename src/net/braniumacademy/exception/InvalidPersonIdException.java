package net.braniumacademy.exception;

/**
 *
 * @author T3D Computer
 */
public class InvalidPersonIdException extends Exception {

    private String invalidId;

    public InvalidPersonIdException() {
    }

    public InvalidPersonIdException(String invalidId, String message) {
        super(message);
        this.invalidId = invalidId;
    }

    public String getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(String invalidId) {
        this.invalidId = invalidId;
    }
}

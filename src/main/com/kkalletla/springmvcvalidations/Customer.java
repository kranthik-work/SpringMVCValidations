package main.com.kkalletla.springmvcvalidations;

import main.com.kkalletla.springmvcvalidations.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is Required")
    @Size(min=1, message = "At least one character is required")
    private String lastName;

    @NotNull(message = "Required")
    @Min(value=0, message = "Passes should be greater than or equal to 0")
    @Max(value=10, message = "Passes should be lesser than 10")
    private Byte freePass;

    @Pattern(regexp = "^[0-9]{5}", message = "only 5 digits allowed")
    private String postalCode;

    @CourseCode(value = {"KK","LUV"}, message = "Begin with KK or LUV")
    private String courseCode;

    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getFreePass() {
        return freePass;
    }

    public void setFreePass(Byte freePass) {
        this.freePass = freePass;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

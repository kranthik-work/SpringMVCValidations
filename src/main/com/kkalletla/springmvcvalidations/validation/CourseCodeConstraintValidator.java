package main.com.kkalletla.springmvcvalidations.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String[] coursePrefix;

    /*To initialize the value to be checked*/
    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    /*The first parameter is to get the value entered bt the user from the HTML form.
    * Second is used to place additional error messages*/
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result=false;
        if(s!=null){
            for (String match: coursePrefix) {
                result = s.startsWith(match);
                if(result)
                    break;
            }
        }
        else
            result = false;
        return result;
    }
}

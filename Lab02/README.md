# Exercise 1

| Test case | Expected Results| Actual Results| Verdict|
| ------------- | ------------- | ------------- | ------------- |
| 1  | accepted | ![pass1](/Lab02/photos/working_registration_1.png "Working1") ![confirm1](/Lab02/photos/confirmation_working_1.png "Confirm1")| Pass |
| 2  | accepted  |![pass2](/Lab02/photos/working_registration_2.png "Working2") ![confirm2](/Lab02/photos/confirmation_working_2.png "Confirm2") | Pass |
| 3  | accepted  | ![pass3](/Lab02/photos/working_registration_2.png "Working3") ![confirm3](/Lab02/photos/confirmation_working_3.png "Confirm3") | Pass |
| 4  | fail age and postal code | ![fail1](/Lab02/photos/fail_age_and_postal_code.png "fail1")  | fail |
| 5  | fail Username and postal code and email | ![fail2](/Lab02/photos/fail_Username_and_postal_code_and_email.png "fail2") | fail |
| 6  | fail everything | ![fail3](/Lab02/photos/fail_everything.png "fail3") | fail |

# JUnit Parameterized Runner
Output from Running the Test
![outputParameter](/Lab02/photos/junitParametrizedRunner.png "outputParameter")

# Exercise 2
Test Run using bin\test

![bin1](/Lab02/photos/test_run_bin_test1.png "bin1")
![bin2](/Lab02/photos/test_run_bin_test2.png "bin2")

Typical explicit test cases that doesn't use exceptions

![explicit good](/Lab02/photos/explicit_test_no_exceptions.png "explicit good")

Typical explicit test cases that have exceptions

![explicit bad](/Lab02/photos/explicit_test_with_exceptions.png "explicit bad")

Parametrized test values for test cases that run OK and return a Date

![parametrized good](/Lab02/photos/parametrized_values_no_exception.png "parametrized good")

Parametrized test values for test cases that DO result in an exception

![parametrized bad](/Lab02/photos/parametrized_values_with_exception.png "parametrized bad")


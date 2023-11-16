## Final Test Work
### ***Automation tests for EastIsland.lt***

#### Link to the website [www.eastisland.lt](https://eastisland.lt/)


## ***Test cases***

#### TS1 Account Registration
1. TC1 Positive Account Registration Test
    - Enter valid email;
    - Enter valid password;
    - Click on button "Register";

   
Expected result: Account is created, profile and orders are shown.

2. TC2 Negative Account Registration Test
   - Enter invalid email;
   - Enter valid password;
   - Click on button "Register";


Expected result: Error is shown, account is not allowed to create.

#### TS2 Login Tests
1. TC1 Positive Login Test
   - Enter valid email;
   - Enter valid password;
   - Click on button "Login";


Expected result: Login is successful, profile and orders are shown.

2. TC2 Negative Login Test
   - Enter valid email;
   - Enter not invalid - empty password;
   - Click on button "Login";


Expected result: Error is shown, not allowed to log in.

#### TS3 Logout test
1. TC1 Positive Login Test
   - Enter valid email;
   - Enter valid password;
   - Click on button "Login";
   - Click on button "Logout"


Expected result: Logout is successful, login page is open.

#### TS4 Customer profile creation
1. TC1 Positive Customer Information Test
   - Enter valid email;
   - Enter valid password;
   - Click on button "Login";
   - Click on button "Edit data";
   - Enter name;
   - Enter email;
   - Enter mobile phone;
   - Enter shipping name;
   - Enter shipping phone number;
   - Enter address;
   - Enter city;
   - Enter post code;
   - Click on button "Save";


Expected result: Profile is created, added information is shown.

#### TS5 Add Gift Coupon to cart
1. TC1 Positive Login Test
   - Select 200Eur amount button;
   - Enter name;
   - Enter message;
   - Click on button "Add to bag"

Expected result: Selected coupon is added to cart, cart page is opened.


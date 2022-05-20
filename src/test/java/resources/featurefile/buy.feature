Feature: Search functionality
  As user, I would like to Find the car by searching

  Background: I am on HomePage
    Given     I click on Url https://www.carsguide.com.au/
    Then      I successfully on homepage of carsguide website

  @sanity @smoke @regression
  Scenario Outline: Search the buy car with model
    When            I mouse hover on buy+sell tab
    And             I click ‘Search Cars’ link
    Then            I navigate to ‘new and used car search’ page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make "<make>" in results

    Examples:
      | make    | model   | location           | price    | make    |
      | Holden  | Belmont | NSW - Central West | $70,000  | Holden  |
      | Mazda   | B4000   | NSW - Far West     | $90,000  | Mazda   |
      | Suzuki  | Jimny   | NSW - Riverina     | $30,000  | Suzuki  |
      | Toyota  | Altezza | NSW - South Coast  | $60,000  | Toyota  |
      | Alpine  | A110    | NSW - Sydney       | $45,000  | Alpine  |
      | Hyundai | I30     | QLD - All          | $150,000 | Hyundai |

  @smoke @regression
  Scenario Outline: Search the used car with model
    When            I mouse hover on buy+sell tab
    And             I click ‘Used’ link
    Then            I navigate to ‘Used Cars For Sale’ page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make used cars "<make>" in results

    Examples:
      | make        | model     | location            | price   | make        |
      | Rover       | Any Model | NSW - All           | $60,000 | Rover       |
      | Audi        | A6        | NSW - Central West  | $90,000 | Audi        |
      | Volvo       | XC90      | NT - South          | $50,000 | Volvo       |
      | Ford        | Corsair   | QLD - Far North     | $50,000 | Ford        |
      | BMW         | 1 Series  | SA - Eyre Peninsula | $25,000 | BMW         |
      | Lamborghini | Huracan   | VIC - All           | $60,000 | Lamborghini |




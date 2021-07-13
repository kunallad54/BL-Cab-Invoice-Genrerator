# BL-Cab-Invoice-Genrerator

## USECASES : 

1. Given Distance and Time ,the invoice generator should return total fare of the journey
   COST --> Rs. 10 per kilometer , Rs. 1 per minute
            Minimum Fare = 5 Rs.

2. The InVoice Generator Should Now Take Multiple Rides,and Calculate Total Aggregate
   for all.

3. Enhanced Invoice :
   The invoice generator should now return the following as a part of invoice :
      - Total Number of Rides
      - Total Fare
      - Average Fare per Ride

4. InVoice Service :
   Given an User ID,The Invoice Service gets the list of rides from
   Ride Repository,and returns an invoice

5. Premium Rides (Bonus)
   - The Cab Agency now supports two types of rides normal rides and premium rides
      * Normal Rides - Rs. 10 per km, Rs. 1 per min, Minimum Fare - Rs. 5
      * Premium Rides - Rs. 15 per km, Rs. 2 per min, Minimum Fare - Rs. 20

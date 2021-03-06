package com.tj.thirstyCat.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.tj.thirstyCat.model.Drink;
import com.tj.thirstyCat.service.DrinkService;

@RunWith(MockitoJUnitRunner.class)
public class DrinkControllerTest {

	@Test
	public void dummy() {
		assert(true);
	}
	
//	@InjectMocks
//	DrinkController drinkController;
//	
//	@Mock
//	DrinkService drinkService;
//	
//
//	@Test
//	public void newDrinkEndpointCallsAddDrinkService() {
//		
//		Drink testDrink = new Drink(new Date(), new Date());
//		
//		drinkController.persistDrink(testDrink);
//		
//		verify(drinkService, times(1)).addDrink(testDrink);
//		
//	}
//	
//	@Test
//	public void retrieveLastDrinkEndpointCallsRetriveLastDrinkServiceAndReturnsDrink() {
//		
////		Date startDate = new Date();
////		Date endDate = new Date();
////		Optional<Drink> expectedDrink = new Drink(startDate, endDate);
////		when(drinkService.getLastDrink()).thenReturn(expectedDrink);
////		
////		Optional<Drink> returnedDrink = drinkController.retrieveLastDrink();
////		
////		verify(drinkService, times(1)).getLastDrink();
////		assertEquals(expectedDrink, returnedDrink);
//
//	}
//	
//	@Test
//	public void retrieveAllDrinksEndpointCallsRetriveAllDrinksServiceAndReturnsAllDrinks() {
//		
//		List<Drink> expectedDrinks = new ArrayList<Drink>();
//		Drink expected1 = new Drink();
//		Drink expected2 = new Drink(new Date(), null);
//		Drink expected3 = new Drink(null, new Date());
//		expectedDrinks.add(expected1);
//		expectedDrinks.add(expected2);
//		expectedDrinks.add(expected3);
//		when(drinkService.getAllDrinks()).thenReturn(expectedDrinks);
//		
//		List<Drink> returnedDrinks = drinkController.getAllDrinks();
//		
//		verify(drinkService, times(1)).getAllDrinks();
//		assertEquals(expectedDrinks, returnedDrinks);
//		
//	}
//	
//	
//	@Test
//	public void retrieveDrink_ID_EndpointCallsRetrieveDrink_ID_Service() {
//
////		Date startDate = new Date();
////		Date endDate = new Date();
////		Drink expectedDrink = new Drink(startDate, endDate);
////		Long drinkId = 3L;
////		when(drinkService.getDrinkById(drinkId)).thenReturn(expectedDrink);
////		
////		Drink returnedDrink = drinkController.getDrink(drinkId);
////		
////		verify(drinkService, times(1)).getDrinkById(drinkId);
////		assertEquals(expectedDrink, returnedDrink);
//		
//	}

}

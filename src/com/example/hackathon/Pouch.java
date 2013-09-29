package com.example.hackathon;

public class Pouch {
	//#define class for a money pouch
   
	// the pouch class has
    // three field
	
	public float budget , expense;
	public String label;
	
	/*constructor*/
	public Pouch(float budget, float expense,
            String label) {
		budget = 0;
		expense = 0;
		label = "";
	} 
	
	public void add(int expense_i) {
		expense += expense_i;
	}
	
	public void initialise(int initial_value){
		budget = initial_value;
	}
	
	public void rename(String new_name){
		label = new_name;
	}
	
	public void change_budget(int new_budget){
		budget = new_budget;
	}
	 
		
}

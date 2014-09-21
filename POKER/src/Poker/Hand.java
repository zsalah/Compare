
	
	//Below Method will Compare the Hand, for Strength
	//Which ever one had a large Strength is declared the Winner
	
	public static Comparator<Hand> RankOfHand = new Comparator<Hand>() {
		
		@SuppressWarnings("unused")
		public int CompareStrength(final Hand Hand1, final Hand Hand2) {
			
			short FinalResult;
			
			FinalResult = 0;
			
			FinalResult = (short) (Hand2.getHandStrength() - Hand1.getHandStrength());
			
			boolean going;
			
			going = true;
			
			//Check if FinalResult Does Not to Yield to 0, 
			//then Return the Strength by Subtracting the second hand 
			//Strength from the first hand Strength
			
			while (going) {
				
				if (FinalResult != 0) {
					
					return FinalResult;
				}
				
				
				going = false;
				
			}
				
			//Return the Strength of High Pair
				
			FinalResult = (short) (Hand2.getHighPairStrength() - Hand1.getHighPairStrength());
			
			while (going) {
				
				if (FinalResult != 0 ) {
					
					return FinalResult;

					
				}
				
				going = false;
				
			}
				
			//Return the Strength of Low Pair
				
			FinalResult = (short) (Hand2.getLowPairStrength() - Hand1.getLowPairStrength());
			
			while (going) {
				
				if (FinalResult != 0) {
					
					return FinalResult;
					
				}
				
				going = false;
				
			}
			
			//Return the Kicker Strength
			
			FinalResult = (short) (Hand2.getKicker() - Hand1.getKicker());
			
			while (going)	{
				
				if (FinalResult != 0) {
					
					return FinalResult;
					
				}
				
				going = false;
				
			}
			return FinalResult;

		}

		@Override
		public int compare(Hand o1, Hand o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	};
	
}
		
			
		

			
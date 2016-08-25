package craps;
import java.util.Scanner;
public class crapsFirstProject
	{
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static int dollors= 100;
		static int diceRoll1=0;
		static int diceRoll2=0;
		static int totalDice;
		static int totalDice2;
		static int amountBet=0;

		public static void main(String[] args)
			{
				wannaPlay();
				rules();
				play();
				

			}
		public static int rollDice()
		{
			int diceRoll1 = (int) (Math.random() * 6) + 1;
			int diceRoll2 = (int) (Math.random() * 6) + 1;
			 totalDice = diceRoll1 + diceRoll2;
			return totalDice;
		}
		public static int rollDice2()
			{
				int diceRoll1 = (int) (Math.random() * 6) + 1;
				int diceRoll2 = (int) (Math.random() * 6) + 1;
				 totalDice2 = diceRoll1 + diceRoll2;
				return totalDice2;
			}
		public static void wannaPlay()
		{
			System.out.println("Hello! what is your name?");
			String name= userInput.nextLine();
			System.out.println("hello " + name);
			System.out.println("Would you like to play a game of Craps? please type (1) for yes or (2) for no");
			int yesOrNo= userInput.nextInt();
			if (yesOrNo == 1)
				{
					System.out.println("Awesome!");
					
				}
			else 
				{
					System.out.println("to bad. I forgot how to close the program.");
					
				}
		}
		public static void rules()
		{
			System.out.println("no this definitaly didnt work!!!")
			System.out.println("Ok. You are starting off with 100 dollors to gamble with");
			System.out.println("craps is a dice rolling game. You get two dice and you roll them...");
			System.out.println("If you roll a 7 or 11 you automatically win and double the amount you gambled");
			System.out.println("If you roll a 2 or 12 you automatically loose all the money you have gambled");
			System.out.println("If you roll any other number you have to roll continuasly until you role the same number you first rolled on your first roll or you roll a 7");
			System.out.println("if you roll a seven you loose if you roll the same number as your first roll you win and double the amount gambled");
			System.out.println("does this all make sense? please type (1) for Yes or (2) for no");
			int yesOrNo= userInput.nextInt();
			if (yesOrNo == 1)
				{
					System.out.println("Awesome! lets continue.");
					
				}
			else 
				{
					System.out.println("alright what issues are you having?");
					System.out.println("(1) gambling, (2) first roll, (3) after first roll, (4) winning, (5) never mind i dont have a question.");
					int questions= userInput.nextInt();
					if(questions ==1)
						{
							System.out.println("You start with $100 before you roll you choose how much you would like to bet");
							System.out.println("if you win you double the amount you bet");
							System.out.println("All Clear. type (1) for yes or (2) for no");
							int yesOrNo2= userInput.nextInt();
							if (yesOrNo2 == 1)
								{
									System.out.println("Awesome!");
									System.out.println("do you have any other questions? type (1) for yes or (2) for no");
									int yesOrNo3= userInput.nextInt();
									if (yesOrNo3 == 1)
										{
											rules();
											
										}
									else 
										{
											System.out.println("Awesome!");
											
										}							
								}
							else 
								{
									System.out.println("to bad. You will catch on.");
									
								}
						}
					else if(questions ==2)
						{
								System.out.println("your first role you roll 2 dice if you roll a 7 or 11 you win");
								System.out.println("if you roll a 2 or 12 you loose");
								System.out.println("if you roll niether you begain the other rolling.");
								System.out.println("All Clear. type (1) for yes or (2) for no");
								int yesOrNo2= userInput.nextInt();
								if (yesOrNo2 == 1)
									{
										System.out.println("Awesome!");
										System.out.println("do you have any other questions? type (1) for yes or (2) for no");
										int yesOrNo3= userInput.nextInt();
										if (yesOrNo3 == 1)
											{
												rules();
												
											}
										else 
											{
												System.out.println("Awesome!");													
											}
											
									}
								else 
									{
										System.out.println("to bad. You will catch on.");
										
									}
						}
					else if(questions ==3)
						{
								System.out.println("if you dont roll a 7,11,2,or12 on your first roll you will continue to roll until you match your first roll");
								System.out.println("or you roll a 7. if you roll a 7 you loose. if you roll the number you rolled first you win and double your gambled money.");
								System.out.println("All Clear. type (1) for yes or (2) for no");
								int yesOrNo2= userInput.nextInt();
								if (yesOrNo2 == 1)
									{
										System.out.println("Awesome!");
										System.out.println("do you have any other questions? type (1) for yes or (2) for no");
										int yesOrNo3= userInput.nextInt();
										if (yesOrNo3 == 1)
											{
												rules();
												
											}
										else 
											{
												System.out.println("Awesome!");													
											}
											
									}
								else 
									{
										System.out.println("to bad. You will catch on.");
										
									}
						}
					else if(questions ==4)
						{
								System.out.println("ok you dont really win you continue until you no longer want to play or yoy loose all of your money.");
								System.out.println("All Clear. type (1) for yes or (2) for no");
								int yesOrNo2= userInput.nextInt();
								if (yesOrNo2 == 1)
									{
										System.out.println("Awesome!");
										System.out.println("do you have any other questions? type (1) for yes or (2) for no");
										int yesOrNo3= userInput.nextInt();
										if (yesOrNo3 == 1)
											{
												rules();
												
											}
										else 
											{
												System.out.println("Awesome!");													
											}
											
									}
								else 
									{
										System.out.println("to bad. You will catch on.");
										
									}
						}
					else 
						{
								System.out.println("awesome lets continue!");
								
						}
				}
		}
		public static void gamble()
		{
			System.out.println("How much would you like to bet?");
			amountBet= userInput.nextInt();
			if (amountBet>dollors)
				{
					System.out.println("no!");
					gamble();
				}
			else if (amountBet<=0)
				{
					System.out.println("no!");
					gamble();
				}
			else
				{
					dollors= dollors-amountBet;
				}
		}
		public static void continuePlaying()
			{
						boolean roll2 = true;
						while(roll2)
							{
								if (dollors>=0)
									{
										rollDice2();
										if (totalDice2==totalDice)
											{
												System.out.println("you rolled a " + totalDice2);
												System.out.println("congradulations you win");
												dollors=dollors + amountBet*2;
											play();
											}
										else if (totalDice2==7)
											{
												System.out.println("you rolled a " + totalDice2);
												System.out.println("you loose");
												if(dollors==0)
													{
														looseGame();
														roll2 = false;
													}
												else
													{
														roll2 = false;
													}
											play();
											}
										else
											{
												System.out.println("you rolled a " + totalDice2 + " and continue rolling");
											}
									}
								else
									{
										looseGame();
										roll2 = false;
									}
							}
					
			}
		public static void play()
		{
				boolean game = true;
				while(game)
					{
						if (dollors>=0)
							{
								System.out.println("you have " + dollors + " dollars. would you like to bet type (1) for yes or (2) for no");
								int wannaBet= userInput.nextInt();
								if(wannaBet==1)
									{
										gamble();
									}
								else
									{
										game = false;
										endGame();
									}
								rollDice();
								if (totalDice==7||totalDice==11)
									{
										System.out.println("you rolled a " + totalDice);
										System.out.println("you win");
										dollors=dollors + amountBet*2;
									}
								else if (totalDice==2||totalDice==12)
									{
										System.out.println("you rolled a " + totalDice);
										System.out.println("you loose");
										if(dollors==0)
											{
												looseGame();
												game = false;
											}
									}
								else 
									{
										System.out.println("you rolled a " + totalDice);
										System.out.println("now you must roll until you roll a 7 or re-roll that number.");
										continuePlaying();
									}
							}
						else
							{
								game = false;
								looseGame();
							}
					}									
		}
		public static void endGame()
		{
			System.out.println("congrats you ended the game with " + dollors + " dollors.");
		}
		public static void looseGame()
		{
			System.out.println("you no longer have any money would you like to play again? if yes type (1) if no type (2)");
			int wannaPlayAgain= userInput.nextInt();
			if (wannaPlayAgain==1)
				{
					System.out.println("sweet");
					dollors=dollors+100;
					play();
				}
			else
				{
					System.out.println("ok!");
					System.exit(0);
				}
		}

	}

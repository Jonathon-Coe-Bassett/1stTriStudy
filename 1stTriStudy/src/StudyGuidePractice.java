
public class StudyGuidePractice
	{
	
		public static void main(String[] args)
			{		//Finals are on Nov 8 2016, today is Nov 7 2016. Better start studying in a program built solely to mess around with.
				
				//First thing, Binary Search.
				//BinTraceQuizzer should help.
				
				//base Conversion. Yikes. There's probably a website for that kind of stuff, and likely a built in quizzer. If not, I'll ask some family members to help.
				
				//2d arrays. Alright.
				//A 2d array is really just an array of arrays. 3d an array of arrays of arrays, and so forth.
				int[][] array2d={{1, 2}, {3, 4}, {10, 120}};
				//Boom
				//Calling values out of the array. How about I print it all?
				for (int i=0; i<array2d.length; i++)
					{
						//NESTED FOR LOOP
						for (int j=0; j<array2d[i].length;j++) //Glad that works
							{
								System.out.println(array2d[i][j]);
							}
					}
				System.out.println("");
				//To seperate the problem outcomes.
				
				//The next one is Modulous operations, the '%' thing in math. The modulous returns the remainder of a division of the first and second number. Useful to see if something is even.
				System.out.println(6942%2);
				//The above will return 0
				
				//POJO.
				//Easy enough, I'll do that in another class later, and allocate some space below to print out the object n' stuff.
				//SPACE
				
				System.out.println("");
				
				//Arraylist of objects. I'll do an arraylist of the POJO objects from earlier, and print out some info.
				
				System.out.println("");
				
				//Random Number Generator.
				int x=((int)( Math.random()*9) +1);
				//So, the above code generates any number from 1-10.
				//I'll have to remember how the casting works with the ints.
				System.out.println(x);
				//Should be pretty random.
				
				//Class inheritance, I'll have to refer to me 'Reality' program.
				
				//That seems to be it. Great.
				
			}

	}

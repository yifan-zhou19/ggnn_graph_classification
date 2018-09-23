package <missing>;

public class GlobalMembers
{
	//**********************
	public static int a = 0;
	public static int b = 0;
	public static int c = 0;
	public static int[] words = new int[4];
	public static String rank = new String(new char[4]);
	//**********************
	public static int Main()
	{
		for (int i = 0;i <= 3;i++)
		{
			words[i] = 0;
		}

		for (a = 1;a <= 3;a++)
		{
		   for (b = 1;b <= 3;b++)
		   {
				   if (b == a)
				   {
					   continue;
				   }
				 for (c = 1;c <= 3;c++)
				 {
					 if (b == c || a == c)
					 {
						 continue;
					 }
				 words[1] = (b > a) + (c == a); //????
				 words[2] = (a > b) + (a > c);
				 words[3] = (c > b) + (b > a);
				  if (words[1] == words[2] || words[2] == words[3] || words[3] == words[1]) //a,b,c??????
				  {
					   continue;
				  }


				 for (int i = 1;i <= 3;i++) //??
				 {
						 if (words[i] == 2)
						 {
						 rank = tangible.StringFunctions.changeCharacter(rank, 1, i + 64);
						 }
						 else if (words[i] == 1)
						 {
						 rank = tangible.StringFunctions.changeCharacter(rank, 2, i + 64);
						 }
						 else if (words[i] == 0)
						 {
						 rank = tangible.StringFunctions.changeCharacter(rank, 3, i + 64);
						 }
				 }
				 }
		   }
		}
				 System.out.print(rank.charAt(1));
				 System.out.print(rank.charAt(2));
				 System.out.print(rank.charAt(3));
							  return 0;
	}

}


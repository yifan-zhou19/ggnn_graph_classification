package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] rank = new int[6];
	  String words = new String(new char[6]);
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int i;
	  int j;
	  int k;
	  int sum;
	  for (a = 1;a < 6;a++)
	  {
		for (b = 1;b < 6;b++)
		{
		  for (c = 1;c < 6;c++)
		  {
			for (d = 1;d < 6;d++)
			{
			  for (e = 1;e < 6;e++)
			  {
				words = tangible.StringFunctions.changeCharacter(words, a, (e == 1));
				words = tangible.StringFunctions.changeCharacter(words, b, (b == 2));
				words = tangible.StringFunctions.changeCharacter(words, c, (a == 5));
				words = tangible.StringFunctions.changeCharacter(words, d, (c != 1));
				words = tangible.StringFunctions.changeCharacter(words, e, (d == 1));
				rank[1] = a;
				rank[2] = b;
				rank[3] = c;
				rank[4] = d;
				rank[5] = e;
				if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e)
				{
				 sum = words.charAt(2) + words.charAt(1);
				 k = words.charAt(3) + words.charAt(4) + words.charAt(5);
				 if (sum == 2 && k == 0 && e != 2 && e != 3)
				 {
				   for (i = 1;i < 5;i++)
				   {
					 System.out.print(rank[i]);
					 System.out.print(" ");
				   }
				   System.out.print(rank[5]);
				   System.out.print("\n");
				 }
				}
			  }
			}
		  }
		}
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;

	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] words = new int[3]; //words[3]???????????i?????a,b,c??????
	   int i;
	   int a;
	   int b;
	   int c;
	   String rank = new String(new char[3]); //rank[3]????????????
	   for (a = 0;a < 3;a++) //?????????????
	   {
		   for (b = 0;b < 3;b++)
		   {
			   for (c = 0;c < 3;c++)
			   {
			   words[a] = (b > a) + (c == a);
			   words[b] = (a > b) + (a > c);
			   words[c] = (c > b) + (b > a);
			   if (words[0] > words[1] && words[1] > words[2])
			   {
				  rank = tangible.StringFunctions.changeCharacter(rank, a, 'A'); //????????????????????
				  rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
				  rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
				  for (i = 0;i < 3;i++)
				  {
				  System.out.print(rank.charAt(i));
				  }
			   }
			   }
		   }
	   }
	  return 0;
	}
}


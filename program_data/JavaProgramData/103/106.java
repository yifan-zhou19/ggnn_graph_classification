package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[10000]);
		  int i;
		  s = new Scanner(System.in).nextLine();
		  int l = s.length();
			for (i = 0;i < l;i++)
			{
			for (int j = 'a';j <= 'z';j++)
			{
			if (s.charAt(i) == j)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, j - 32);
			}
			}
			}
			char max = s.charAt(0);
			int k = 0;
		  for (i = 0;i <= l;i++)
		  {
		  if (s.charAt(i) == max)
		  {
			  k++;
		  }
		  else
		  {
			   System.out.printf("(%c,%d)",max,k);
			   max = s.charAt(i);
			   k = 0;
			   i--;
		  }

		  }
		  System.in.read();
		  System.in.read();
	}

}


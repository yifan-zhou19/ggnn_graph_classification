package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[200]);
	  char k;
	  int[] pla = new int[200];
	  int s;
	  int e;
	  int i;
	  int l;
	  int j;
	  int t;
	  c = new Scanner(System.in).nextLine();
	  l = c.length();
	  j = 0;
	  for (i = 0;i < l;i++)
	  {
		if (c.charAt(i) == ' ')
		{
		   j++;
		   pla[j] = i;
		}
	  }
	  for (i = 1;i <= j + 1;i++)
	  {
		if (i == 1)
		{
			s = 0;
		}
		else
		{
			s = pla[i - 1] + 1;
		}
		if (i == j + 1)
		{
			e = l - 1;
		}
		else
		{
			e = pla[i] - 1;
		}
		for (t = 0;s + t < e - t;t++)
		{
		   k = c.charAt(s + t);
		   c = tangible.StringFunctions.changeCharacter(c, s + t, c.charAt(e - t));
		   c = tangible.StringFunctions.changeCharacter(c, e - t, k);
		}
	  }
	  for (i = l - 1;i >= 0;i--)
	  {
	   System.out.printf("%c",c.charAt(i));
	  }
	  return 0;
	}

}


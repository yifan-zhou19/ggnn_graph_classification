package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int k;
	int[] c = new int[1000];
	  String a = new String(new char[1000]);
	  String b = new String(new char[1000]);
	  String e = new String(new char[1000]);
	  a = new Scanner(System.in).nextLine();
	 m = a.length();
	  for (i = 0;i <= m;i++)
	  {
			if (a.charAt(i) < 'a')
			{
			  b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
		  else
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + 'A'-'a');
		  }
	  }
	  c[0] = 1;
	  e = tangible.StringFunctions.changeCharacter(e, 0, b.charAt(0));
	  k = 0;
	  for (i = 1;i <= m;i++)
	  {
			  if (b.charAt(i) == b.charAt(i - 1))
			  {
			  c[k] = c[k] + 1;
			  }
		  else
		  {
				k = k + 1;
			  e = tangible.StringFunctions.changeCharacter(e, k, b.charAt(i));
			  c[k] = c[k] + 1;
		  }
	  }
	  for (i = 0;i <= k - 1;i++)
	  {
	  System.out.printf("(%c,%d)",e.charAt(i),c[i]);
	  }
	}
}


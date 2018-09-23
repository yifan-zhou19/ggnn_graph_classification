package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[15]);
	  String t = new String(new char[15]);
	  int i;
	  int k;
	  while (scanf("%s%s", s, t) != EOF)
	  {
		k = 0;
		for (i = 1; s.charAt(i); ++i)
		{
		  if (s.charAt(k) < s.charAt(i))
		  {
			  k = i;
		  }
		}
		for (i = 0; i <= k; ++i)
		{
		  System.out.print(s.charAt(i));
		}
		System.out.printf("%s", t);
		for (i = k + 1; s.charAt(i); ++i)
		{
		  System.out.print(s.charAt(i));
		}
		System.out.print('\n');
	  }
	  return 0;
	}

}

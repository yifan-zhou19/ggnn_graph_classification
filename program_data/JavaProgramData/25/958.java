package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int u = 0;
		int b = 0;
		int n;
		int i;
		int d = 0;
		int j;
		int[] c = new int[1000];
	 String a = new String(new char[1000]);
	 String w = new String(new char[1000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		if (i == 0)
		{
		 a = tangible.StringFunctions.changeCharacter(a, 0, '2');
		 continue;
		}
		for (j = 0;j <= 0.4 * n;j++)
		{
			if ((a.charAt(j) - '0' < 0) || (a.charAt(j) - '0'>9))
			{
			   a = tangible.StringFunctions.changeCharacter(a, j, '0');
			}
		   b = a.charAt(j) - '0';
		   if (b * 2 >= 10)
		   {
		   c[j + 1] = 1;
		   a = tangible.StringFunctions.changeCharacter(a, j, (b * 2) % 10 + '0' + c[j]);
		   c[j] = 0;
		   }
		   if (b * 2 < 10)
		   {
					  a = tangible.StringFunctions.changeCharacter(a, j, b * 2 + '0' + c[j]);
					   c[j] = 0;
		   }

		}

	 }
	 for (int t = a.length();t >= 0;t--)
	 {
	 if ((a.charAt(t) - '0' >= 0) && (a.charAt(t) - '0' <= 9))
	 {
	  w = tangible.StringFunctions.changeCharacter(w, d, a.charAt(t));
	  d++;
	 }
	 }

	  for (i = 0;i < w.length();i++)
	  {
	   if (w.charAt(i) != '0')
	   {
	   u = i;
	   break;
	   }
	  }
	   for (i = u;i < w.length();i++)
	   {
	   if ((w.charAt(i) - '0' >= 0) && (w.charAt(i) - '0' <= 9))
	   {
	   System.out.printf("%c",w.charAt(i));
	   }
	   }
	if (n == 0)
	{
	System.out.print("1");
	}
	}

}


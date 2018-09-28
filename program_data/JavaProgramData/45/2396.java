package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		int n;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		n = s.length();
		m = w.length();
		if (m == n)
		{
		System.out.print("0");
		}
		for (j = 0;j <= m - n + 5;j++)
		{
		i = 0;
		k = j;
		while (s.charAt(i) == w.charAt(k) && i < n)
		{
		   i++;
		   k++;
		}
		  if (i == n)
		  {
			   System.out.printf("%d",j);
			   i = 200;
			   j = 200;
		  }
		}
	 return 0;
	}

}


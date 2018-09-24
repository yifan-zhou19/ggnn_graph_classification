package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[310]);
		final String b = "abcdefghijklmnopqrstuvwxyz";
		int i;
		int j;
		int p;
		int[] c = new int[27];
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		p = a.length();
		for (j = 0;j <= 25;j++)
		{
						  for (i = 0;i < p;i++)
						  {
							  if (a.charAt(i) == b.charAt(j))
							  {
								  c[j]++;
							  }
						  }
						  if (c[j] != 0)
						  {
							  System.out.printf("%c=%d\n", b.charAt(j), c[j]);
							  q++;
						  }

		}
	if (q == 0)
	{
		System.out.print("No");
	}
		return 0;
	}

}


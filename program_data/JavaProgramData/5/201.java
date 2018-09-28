package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sz = new char[2][510];
		double a;
		double e;
		int b;
		int c;
		int d;
		int f;
		int[] s = new int[2];
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		for (b = 0;b < 2;b++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 sz[b] = tempVar2.charAt(0);
			 }
			 s[b] = String.valueOf(sz[0]).length();
			 for (f = 0;f < s[b];f++)
			 {
				  if (sz[b][f] != 'A' && sz[b][f] != 'T' && sz[b][f] != 'G' && sz[b][f] != 'C')
				  {
						  System.out.print("error");
						  return 0;
				  }
			 }
		}
		if (s[0] != s[1])
		{
			System.out.print("error\n");
			return 0;
		}

		for (b = 0;b < s[0];b++)
		{
			if (sz[0][b] == sz[1][b])
			{
				d++;
			}
		}
		e = 1.0 * d / s[0];
		if (e > a)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}
}


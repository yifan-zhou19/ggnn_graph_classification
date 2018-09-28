package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double k;
		int i;
		int j = 0;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		char[][] sz = new char[2][1000];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sz[1] = tempVar3.charAt(0);
		}
		p = String.valueOf(sz[0]).length();
		q = String.valueOf(sz[1]).length();
		if (p != q)
		{
			System.out.print("error");
			return 0;
		}
	   for (i = 0;i < q;i++)
	   {
		   if (sz[0][i] != 'A' && sz[0][i] != 'T' && sz[0][i] != 'C' && sz[0][i] != 'G')
		   {
			   System.out.print("error");
			   return 0;
		   }
		   if (sz[1][i] != 'A' && sz[1][i] != 'T' && sz[1][i] != 'C' && sz[1][i] != 'G')
		   {
			   System.out.print("error");
			   return 0;
		   }
	   }
		for (i = 0;sz[0][i] != '\0';i++)
		{
			if (sz[0][i] == sz[1][i])
			{
				j++;
			}
		}
		k = 1.0 * j / i;
		if (k > n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}


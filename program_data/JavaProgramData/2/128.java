package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int maxc = 0;
		int i;
		int j;
		int n;
		int[] a = new int[1000];
		int c;
		char maxp;
		char[][] b = new char[1000][27];
		char p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (p = 'A';p <= 'Z';p++)
		{
			c = 0;
			 for (i = 0;i < n;i++)
			 {
				for (j = 0;;j++)
				{
					if (b[i][j] == '\0')
					{
						break;
					}
					if (b[i][j] == p)
					{
						c++;
					}

				}
			 }
			if (c > maxc)
			{
				maxc = c;
				maxp = p;
			}
		}
		System.out.printf("%c\n",maxp);
		System.out.printf("%d\n",maxc);




		  for (i = 0;i < n;i++)
		  {
				for (j = 0;;j++)
				{
					if (b[i][j] == '\0')
					{
						break;
					}
					if (b[i][j] == maxp)
					{
						System.out.printf("%d\n",a[i]);
					}

				}
		  }






		return 0;
	}

}


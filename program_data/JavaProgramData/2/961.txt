public class lib
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static lib[] book = tangible.Arrays.initializeWithDefaultlibInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		int e;
		e = 0;
		int[] tol = new int[1000];
		int[][] own = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(book[i].num) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		for (k = 'A';k <= 'Z';k++)
		{
			for (i = 0;i <= n - 1;i++)
			{
				for (p = 0;p <= 25;p++)
				{
					if (k == book[i].author.charAt(p))
					{
						tol[k]++;
						own[k][i] = book[i].num;
					}
				}
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (tol[i] > e)
			{
				e = tol[i];
			}
		}
		for (k = 'A';k <= 'Z';k++)
		{
			if (tol[k] == e)
			{
				System.out.printf("%c\n%d\n",k,tol[k]);
				for (p = 0;p <= n - 1;p++)
				{
					if (own[k][p] != 0)
					{
						System.out.printf("%d\n",own[k][p]);
					}
				}
				break;
			}
		}
		return 0;
	}
}


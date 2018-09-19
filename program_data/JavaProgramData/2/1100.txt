public class book
{
	public int id;
	public String aut = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[27];
		book[] cal = tangible.Arrays.initializeWithDefaultbookInstances(1001);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cal[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cal[i].aut = tempVar3.charAt(0);
			}
		}
		for (j = 65;j < 91;j++)
		{
			for (i = 0;i < m;i++)
			{
				for (k = 0;k < 27;k++)
				{
					if (cal[i].aut.charAt(k) == j)
					{
						a[j - 65]++;
					}
				}
			}
		}
		int max = 0;
		int t;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			  t = i;
			}
		}

		System.out.printf("%c\n%d\n",t + 65,max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (cal[i].aut.charAt(j) == t + 65)
				{
					System.out.printf("%d\n",cal[i].id);
				}
			}
		}
		return 0;
	}
}


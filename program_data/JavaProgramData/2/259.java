public class book
{
	public int ISBN;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] k = new int[26];
		int max = 0;
		char a;
		char d = 'A';
		for (i = 0;i < 26;i++)
		{
			k[i] = 0;
		}
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
				b[i].ISBN = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].name = tempVar3.charAt(0);
			}
		}
		for (a = 'A';a <= 'Z';a++)
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < 26;j++)
				{
					if (b[i].name.charAt(j) == a)
					{
						k[a - 'A']++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (k[i] >= max)
			{
				max = k[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (k[i] == max)
			{
				d += i;
				System.out.printf("%c\n",d);
				System.out.printf("%d\n",max);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (b[i].name.charAt(j) == d)
				{
					System.out.printf("%d\n",b[i].ISBN);
				}
			}
		}
		return 0;
	}
}


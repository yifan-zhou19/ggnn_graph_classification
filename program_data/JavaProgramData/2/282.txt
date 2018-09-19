public class author
{
	public char name;
	public int count;
}

package <missing>;

public class GlobalMembers
{
	public static author[] aut = tangible.Arrays.initializeWithDefaultauthorInstances(26);

	public static int max(author[] a)
	{
		int i;
		int max;
		max = a[0].count;
		for (i = 0;i < 26;i++)
		{
			if (a[i].count > max)
			{
				max = a[i].count;
			}
		}
		return (max);
	}
	public static void Main()
	{
		int m;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int n;
		int[] l = new int[1000];
		int[] book_name = new int[1000];
		char[][] author_name = new char[1000][27];
		for (i = 0;i < 26;i++)
		{
		aut[i].name = 'A' + i;
		aut[i].count = 0;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book_name[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				author_name[i] = tempVar3.charAt(0);
			}
			l[i] = String.valueOf(author_name[i]).length();
			for (j = 0;j < 26;j++)
			{
			for (n = 0;n < l[i];n++)
			{
					if (author_name[i][n] == aut[j].name)
					{
					aut[j].count++;
					}
			}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (aut[i].count == max(aut))
			{
				System.out.printf("%c\n",aut[i].name);
				h = i;
			}
		}
		System.out.printf("%d\n",max(aut));
		for (i = 0;i < m;i++)
		{
			l[i] = String.valueOf(author_name[i]).length();
			for (n = 0;n < l[i];n++)
			{
				if (author_name[i][n] == aut[h].name)
				{
					System.out.printf("%d\n",book_name[i]);
				}
			}
		}
	}
}


public class book
{
	public int id;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		book[] b = tangible.Arrays.initializeWithDefaultbookInstances(999);
		int[] a = new int[26];
		int m;
		int i;
		int j;
		int max;
		int maxauthor;
		char c;
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
				b[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].author = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;b[i].author.charAt(j) != '\0';j++)
			{
				c = b[i].author.charAt(j);
				a[c - 65]++;
			}
		}
		max = a[0];
		maxauthor = 0;
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxauthor = i;
			}
		}
		System.out.printf("%c\n%d\n",maxauthor + 65,max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;b[i].author.charAt(j) != '\0';j++)
			{
				c = b[i].author.charAt(j);
				if (c == maxauthor + 65)
				{
					System.out.printf("%d\n",b[i].id);
					break;
				}
			}
		}
		return 0;
	}
}


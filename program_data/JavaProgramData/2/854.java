public class aut
{
	public char name;
	public int num;
	public int[] id = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static aut[] author = tangible.Arrays.initializeWithDefaultautInstances(26);

	public static int Main()
	{
		int m;
		int i;
		int j;
		int ID;
		int max = 0;
		int maxauthor;
		int[] k = new int[26];
		String c = new String(new char[27]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			author[i].name = 'A' + i;
			author[i].num = 0;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
			for (j = 0;c.charAt(j);j++)
			{
				author[c.charAt(j) - 'A'].id[k[c.charAt(j) - 'A']] = ID;
				k[c.charAt(j) - 'A']++;
				author[c.charAt(j) - 'A'].num++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (author[i].num > max)
			{
				max = author[i].num;
				maxauthor = i;
			}
		}
		System.out.printf("%c\n%d\n",author[maxauthor].name,author[maxauthor].num);
		for (i = 0;i < author[maxauthor].num;i++)
		{
			System.out.printf("%d\n",author[maxauthor].id[i]);
		}

		return 0;
	}
}


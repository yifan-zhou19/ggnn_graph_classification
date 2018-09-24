public class author
{
	public String num = new String(new char[4]);
	public String str = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int[] zimu = new int[26];
		int x;
		int max;
		char p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		author[] auth = tangible.Arrays.initializeWithDefaultauthorInstances(m);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				auth[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				auth[i].str = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				x = auth[i].str.charAt(j) - 65;
				zimu[x]++;
			}
		}
		max = zimu[0];
		for (i = 0;i < 26;i++)
		{
			if (zimu[i] > max)
			{
				max = zimu[i];
				p = i;
			}
		}
		System.out.printf("%c\n%d\n",p + 65,max);

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (auth[i].str.charAt(j) == p + 65)
				{
					System.out.printf("%s\n",auth[i].num);
				}
			}
		}

		auth = null;
	}
}


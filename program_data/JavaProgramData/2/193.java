public class book
{
	public int num;
	public String ren = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		book[] shu = tangible.Arrays.initializeWithDefaultbookInstances(999);
		int m;
		int i;
		int j;
		int k;
		int max = 0;
		int p;
		int[] a = new int[26];
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
				shu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i].ren = tempVar3.charAt(0);
			}
			for (j = 0;shu[i].ren.charAt(j) != '\0';j++)
			{
				for (k = 65;k < 91;k++)
				{
				if (shu[i].ren.charAt(j) == k)
				{
					a[k - 65]++;
				}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max == a[i])
			{
				p = i + 65;
				System.out.printf("%c\n%d\n",p,a[p - 65]);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;shu[i].ren.charAt(j) != '\0';j++)
			{
				if (p == shu[i].ren.charAt(j))
				{
					System.out.printf("%d\n",shu[i].num);
				}
			}
		}
	}
}


public class book
{
	public int num;
	public String aut = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int x;
		int a = 0;
		int[] count = new int[26];
		char y;
		book[] all = tangible.Arrays.initializeWithDefaultbookInstances(1000);
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
				all[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				all[i].aut = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (all[i].aut.charAt(j) >= 'A' && all[i].aut.charAt(j) <= 'Z')
				{
					x = (int)(all[i].aut.charAt(j) - 'A');
					count[x]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (count[i] > a)
			{
				a = count[i];
				k = i;
			}
		}
		y = k + 'A';
		System.out.printf("%c\n%d\n",y,a);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (all[i].aut.charAt(j) == y)
				{
					System.out.printf("%d\n",all[i].num);
					break;
				}
			}
		}
		return 0;
	}

}


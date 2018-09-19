public class cs
{
	public int b;
	public String a = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int max = 0;
		int[][] c = new int[200][1000];
		int[] count = new int[200];
		cs[] x = tangible.Arrays.initializeWithDefaultcsInstances(1000);
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
				x[i].b = Integer.parseInt(tempVar2);
			}
			x[i].a = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(x[i].a).length();j++)
			{
				for (k = 65;k < 91;k++)
				{
					if (x[i].a.charAt(j) == k)
					{
						count[k]++;
					c[k][count[k]] = x[i].b;
					}
				}
			}
		}
		for (k = 65;k < 91;k++)
		{
			if (count[k] > max)
			{
				max = count[k];
			}
		}
		for (k = 65;k < 91;k++)
		{
			if (count[k] == max)
			{
				System.out.printf("%c\n%d\n",k,count[k]);
				for (j = 1;j <= max;j++)
				{
					System.out.printf("%d\n",c[k][j]);
				}
			}
		}
		return 0;
	}
}


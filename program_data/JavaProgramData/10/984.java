public class missile
{
	public int file;
	public int reign;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		missile[] a = tangible.Arrays.initializeWithDefaultmissileInstances(30);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].file = Integer.parseInt(tempVar2);
			}
		}
		a[n].reign = 1;
		for (i = n - 1;i >= 1;i--)
		{
			a[i].reign = 1;
			for (j = i + 1;j <= n;j++)
			{
				if (a[j].file <= a[i].file)
				{
					if (a[j].reign + 1 > a[i].reign)
					{
						a[i].reign = a[j].reign + 1;
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i].reign > max)
			{
				max = a[i].reign;
			}
		}
		System.out.printf("%d",max);
	}

}


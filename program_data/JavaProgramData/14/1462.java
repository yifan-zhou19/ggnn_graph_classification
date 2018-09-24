public class student
{
	public int num;
	public int y;
	public int b;
	public int he;
}

package <missing>;

public class GlobalMembers
{
	public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100003);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int he;
		int k;
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
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].b = Integer.parseInt(tempVar4);
			}
			a[i].he = a[i].y + a[i].b;
		};

		for (i = 1;i <= 2;i++)
		{
			k = i;
			for (j = i + 1;j <= n;j++)
			{
				if (a[j].he > a[k].he)
				{
					k = j;
				}
			}
			System.out.printf("%d %d",a[k].num,a[k].he);
			System.out.print("\n");
			a[k].he = 0;
		}
				k = 1;
			for (j = i + 1;j <= n;j++)
			{
				if (a[j].he > a[k].he)
				{
					k = j;
				}
			}
			System.out.printf("%d %d",a[k].num,a[k].he);
			a[k].he = 0;
	}
}


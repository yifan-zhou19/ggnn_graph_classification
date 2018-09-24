public class missile
{
	public int num;
	public int high;
}

package <missing>;

public class GlobalMembers
{
	public static missile[] a = tangible.Arrays.initializeWithDefaultmissileInstances(25);
	public static void f(int n, int sum)
	{
		int i = 0; //a[n].num???1?
		int t = 1;
		if (n == sum - 1)
		{
			a[n].num = 1;
		}
		else
		{
			a[n].num = 1;
			for (i = n + 1;i <= sum - 1;i++)
			{
				if (a[n].high >= a[i].high)
				{
					if (a[i].num + 1 > a[n].num)
					{
						a[n].num = a[i].num + 1;
					} //??????  .XXX
				}
			}
		}
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int sum = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		//a=(struct missile*)malloc(sum*sizeof(struct missile));
		for (i = 0;i <= sum - 1;i++) //read in
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].high = Integer.parseInt(tempVar2);
			}
		}
		for (i = sum - 1;i >= 0;i--) //find num
		{
			f(i, sum);
		}
		for (i = 0;i <= sum - 1;i++) //find max
		{
			if (a[i].num > max)
			{
				max = a[i].num;
			}
		}
		System.out.printf("%d",max);
	}

}


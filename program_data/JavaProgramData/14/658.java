public class inf
{
	public int nu;
	public int b;
	public int c;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static inf[] a = tangible.Arrays.initializeWithDefaultinfInstances(100010);
	public static inf tmp = new inf();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int tmp1;
		int tmp2;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				a[i - 1].sum = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i - 1].nu = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i - 1].b = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i - 1].c = Integer.parseInt(tempVar4);
				}
				a[i - 1].sum = a[i - 1].b + a[i - 1].c;
		}
		for (i = 0;i < 3;i++)
		{
			tmp1 = i;
			tmp2 = a[i].sum;
			for (j = i + 1;j < n;j++)
			{
				if (a[j].sum > tmp2)
				{
						tmp2 = a[j].sum;
						tmp1 = j;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp=a[i];
			tmp.copyFrom(a[i]);
			a[i] = a[tmp1];
			a[tmp1] = tmp;
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",a[i].nu,a[i].sum);
		}
		return 0;
	}

}


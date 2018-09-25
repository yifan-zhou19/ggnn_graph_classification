public class p
{
	public int in;
	public int out;
}

package <missing>;

public class GlobalMembers
{
	public static p[] a = tangible.Arrays.initializeWithDefaultpInstances(1000);

	public static void Main()
	{
		int i;
		int n;
		int j;
		int max;
		int[] t = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0].in = Integer.parseInt(tempVar);
		}
		i = 1;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d",a[i++].in) == 1)
		{
			;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0].out = Integer.parseInt(tempVar2);
		}
		i = 1;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d",a[i++].out) == 1)
		{
			;
		}
		n = i - 1;

		for (j = 0;j < 999;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i].in <= j != 0 && a[i].out >= j + 1)
				{
					t[j]++;
				}
			}
		}
		//max//
		for (j = 0;j < 999;j++)
		{
			if (j == 0)
			{
				max = t[j];
			}
			else if (t[j] > max)
			{
				max = t[j];
			}
		}
		//print//
		System.out.printf("%d %d\n",n,max);
	}
}


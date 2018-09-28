public class Interval
{
	public int sta;
	public int end;
}

package <missing>;

public class GlobalMembers
{
	public static int maximum(int a,int b,int c)
	{
		if (a >= b != 0 && a >= c)
		{
			return a;
		}
		if (b >= a != 0 && b >= c)
		{
			return b;
		}
		if (c >= a != 0 && c >= b)
		{
			return c;
		}
	}
	public static int compare(Object a, Object b)
	{
		return ((Interval)a).sta - ((Interval)b).sta;
	}
	public static int Main()
	{
		Interval[] a = tangible.Arrays.initializeWithDefaultIntervalInstances(50000);
		int i;
		int j = 0;
		int n;
		int end = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].sta = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].end = Integer.parseInt(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(a,n,sizeof(Interval),compare);
		for (i = 0;i < n - 1;i++)
		{
			max = maximum(max, max, a[i].end);
			if (max >= a[i + 1].sta)
			{
				j++;
				end = maximum(end, a[i].end, a[i + 1].end);
			}
			else
			{
				break;
			}
		}
		if (j == n - 1)
		{
			System.out.printf("%d %d\n",a[0].sta,end);
		}
		else
		{
			System.out.print("no");
		}
	}
}


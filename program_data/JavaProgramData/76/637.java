public class Interval
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static Interval[] interval = tangible.Arrays.initializeWithDefaultIntervalInstances(MAXLEN);
	public static Interval[] output = tangible.Arrays.initializeWithDefaultIntervalInstances(MAXLEN);

	public static int cmp(Object __a, Object __b)
	{
		Interval _a = (Interval) __a;
		Interval _b = (Interval) __b;
		if (_a.a == _b.a)
		{
			return _a.b - _b.b;
		}
		return _a.a - _b.a;
	}

	public static int Main()
	{
		int cases;
		int left;
		int right;
		int cnt;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		for (i = 0; i < cases; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				interval[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				interval[i].b = Integer.parseInt(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(interval, cases, sizeof(Interval), cmp);

		left = interval[0].a;
		right = interval[0].b;
		cnt = 0;
		for (i = 1; i < cases; i++)
		{
			if (interval[i].a > right)
			{
				System.out.print("no\n");
				return 0;
			}
			else
			{
				right = MAX(right, interval[i].b);
			}
		}
		System.out.printf("%d %d\n", left, right);
		return 0;
	}
}


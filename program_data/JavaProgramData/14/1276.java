public class stu
{
	public int id;
	public int verbal;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] a;
		stu t = new stu();
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = tangible.Arrays.initializeWithDefaultstuInstances(n);
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i].id = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i].verbal = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i].math = Integer.parseInt(tempVar4);
				}
				a[i].sum = a[i].verbal + a[i].math;
			}
			for (j = 0;j < 3;j++)
			{
				for (i = n;i > j;i--)
				{
					if (a[i].sum > a[i - 1].sum)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[i];
						t.copyFrom(a[i]);
						a[i] = a[i - 1];
						a[i - 1] = t;
					}
				}
			}
			for (i = 0;i < 3;i++)
			{
			System.out.printf("%d %d\n",a[i].id,a[i].sum);
			}

		return 0;

	}
}


public class student
{
	public int num;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student e = new student();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i].chinese + a[i].math >= a[i + 1].chinese + a[i + 1].math)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=a[i];
				e.copyFrom(a[i]);
				a[i] = a[i + 1];
				a[i + 1] = e;
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			if (a[i].chinese + a[i].math >= a[i + 1].chinese + a[i + 1].math)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=a[i];
				e.copyFrom(a[i]);
				a[i] = a[i + 1];
				a[i + 1] = e;
			}
		}
		for (i = 0;i < n - 3;i++)
		{
			if (a[i].chinese + a[i].math >= a[i + 1].chinese + a[i + 1].math)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=a[i];
				e.copyFrom(a[i]);
				a[i] = a[i + 1];
				a[i + 1] = e;
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			System.out.printf("%d %d\n",a[i].num,a[i].chinese + a[i].math);
		}
		return 0;
	}


}


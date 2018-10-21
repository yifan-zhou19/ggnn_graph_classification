public class student
{
	public int d;
	public int score;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp1;
		int temp2;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100002);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].d = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp2 = Integer.parseInt(tempVar4);
			}
			a[i].score = temp1 + temp2;
		}

		student max1 = new student();
		student max2 = new student();
		student max3 = new student();
		max1.d = max2.d = max3.d = -1;
		max1.score = max2.score = max3.score = 0;

		for (i = 0; i < n; i++)
		{
			if (a[i].score > max1.score)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3 = max2;
				max3.copyFrom(max2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max2 = max1;
				max2.copyFrom(max1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max1 = a[i];
				max1.copyFrom(a[i]);
			}
			else if (a[i].score > max2.score)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3 = max2;
				max3.copyFrom(max2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max2 = a[i];
				max2.copyFrom(a[i]);
			}
			else if (a[i].score > max3.score)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max3 = a[i];
				max3.copyFrom(a[i]);
			}
		}

		System.out.printf("%d %d\n", max1.d, max1.score);
		if (max2.d != -1)
		{
			System.out.printf("%d %d\n", max2.d, max2.score);
		}
		if (max3.d != -1)
		{
			System.out.printf("%d %d\n", max3.d, max3.score);
		}
		return 0;
	}

}


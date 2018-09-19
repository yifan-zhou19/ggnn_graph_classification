package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int maths;
	//	};
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student temp = new student();
		int i;
		int[] b = new int[100000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].maths = tempVar4;
			}
		}

		for (i = 1;i < n;i++)
		{
			if ((a[i].chinese + a[i].maths) > (a[0].chinese + a[0].maths))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[0];
				temp.copyFrom(a[0]);
				a[0] = a[i];
				a[i] = temp;
			}
		}
		System.out.printf("%d %d\n",a[0].num,a[0].chinese + a[0].maths);

		for (i = 2;i < n;i++)
		{
			if ((a[i].chinese + a[i].maths) > (a[1].chinese + a[1].maths))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[1];
				temp.copyFrom(a[1]);
				a[1] = a[i];
				a[i] = temp;
			}
		}
		System.out.printf("%d %d\n",a[1].num,a[1].chinese + a[1].maths);

		for (i = 3;i < n;i++)
		{
			if ((a[i].chinese + a[i].maths) > (a[2].chinese + a[2].maths))
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[2];
				temp.copyFrom(a[2]);
				a[2] = a[i];
				a[i] = temp;
			}
		}
		System.out.printf("%d %d\n",a[2].num,a[2].chinese + a[2].maths);
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int math;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		int i;
		int t;
		int h;
		int l = 0;
		int n;
		int[] a = new int[100001];
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
			stu[i].num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stu[i].chinese = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stu[i].math = tempVar4;
		}
		}
		for (i = 0;i < n;i++)
		{
		a[i] = stu[i].chinese + stu[i].math;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		leap:
		t = a[0];
		h = 0;
		for (i = 1;i < n;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
				h = i;
			}
		}
		System.out.printf("%ld %d\n",stu[h].num,a[h]);
		l++;
		a[h] = 0;
		if (l < 3)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto leap;
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
			 return ((int)a - (int)b);
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   int num;
	//		   int chinese;
	//		   int maths;
	//		   int amount;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		int[] a = new int[100000];
		int n;
		int l;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].maths = tempVar4;
			}
			a[i] = stu[i].chinese + stu[i].maths;
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
		for (int h = n - 1;h >= 0;h--)
		{
				if (a[n - 1] == stu[h].chinese + stu[h].maths)
				{
					l = stu[h].num;
				}
		}
		 for (int g = n - 1;g >= 0;g--)
		 {
				if (a[n - 2] == stu[g].chinese + stu[g].maths && (g + 1) != l)
				{
					j = stu[g].num;
				}
		 }
		 for (int f = n - 1;f >= 0;f--)
		 {
				if (a[n - 3] == stu[f].chinese + stu[f].maths && (f + 1) != j && (f + 1) != l)
				{
					k = stu[f].num;
				}
		 }
		System.out.printf("%d %d\n",l,a[n - 1]);
		System.out.printf("%d %d\n",j,a[n - 2]);
		System.out.printf("%d %d\n",k,a[n - 3]);
	}
}


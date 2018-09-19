package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		int[] zf = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int name;
	//		int yw;
	//		int sx;
	//
	//	}
	//	stu[100000];
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yw = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].sx = tempVar4;
			}
			zf[i] = stu[i].yw + stu[i].sx;
		}
		for (j = 1;j < 4;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (zf[i] >= zf[i + 1])
				{
					a = zf[i];
					zf[i] = zf[i + 1];
					zf[i + 1] = a;
					a = stu[i].name;
					stu[i].name = stu[i + 1].name;
					stu[i + 1].name = a;
				}
			}
		}
		for (i = n - 1;i >= n - 3;i--)
		{
		System.out.printf("%d %d\n",stu[i].name,zf[i]);
		}
	}


}


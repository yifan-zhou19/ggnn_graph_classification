package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct score
	//	{
	//		int num;
	//	 int verbal;
	//	 int math;
	//	 int sum;
	//	};
		score[] a = tangible.Arrays.initializeWithDefaultscoreInstances(4);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].verbal = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].math = tempVar4;
			}
			a[i].sum = a[i].verbal + a[i].math;
		}
		for (i = 0;i <= 1;i++)
		{
			for (j = 1;j <= 2 - i;j++)
			{
				if (a[i].verbal + a[i].math < a[i + j].verbal + a[i + j].math)
				{
					t = a[i].num;
					a[i].num = a[i + j].num;
					a[i + j].num = t;
					t = a[i].sum;
					a[i].sum = a[i + j].sum;
					a[i + j].sum = t;
				}
			}
		}
		for (i = 3;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[3].num = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[3].verbal = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[3].math = tempVar7;
			}
			if (a[3].verbal + a[3].math > a[0].sum)
			{
				t = a[1].num;
				a[1].num = a[0].num;
				a[2].num = t;
				a[0].num = a[3].num;
				t = a[1].sum;
				a[1].sum = a[0].sum;
				a[2].sum = t;
				a[0].sum = a[3].verbal + a[3].math;
			}
			else if (a[3].verbal + a[3].math > a[1].sum)
			{
				a[2].num = a[1].num;
				a[1].num = a[3].num;
				a[2].sum = a[1].sum;
				a[1].sum = a[3].verbal + a[3].math;
			}
			else if (a[3].verbal + a[3].math > a[2].sum)
			{
				a[2].num = a[3].num;
				a[2].sum = a[3].verbal + a[3].math;
			}
		}
		for (i = 0;i <= 2;i++)
		{
			System.out.printf("%d %d\n",a[i].num,a[i].sum);
		}
	}
}


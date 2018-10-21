package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int scorechinese;
	//		int scoremath;
	//		int sum;
	//	}
	//	a[100000];
		int n;
		int i;
		int j;
		int temp;
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
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].scorechinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].scoremath = tempVar4;
			}
			a[i].sum = a[i].scorechinese + a[i].scoremath;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i].sum < a[j].sum)
				{
					temp = a[i].sum,a[i].sum = a[j].sum,a[j].sum = temp;
					temp = a[i].num,a[i].num = a[j].num,a[j].num = temp;
				}
			}
			System.out.printf("%d %d\n",a[i].num,a[i].sum);
		}
		return 0;
	}


}


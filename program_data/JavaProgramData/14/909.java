package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int maths;
	//		int sum;
	//	}
	//	t[100000],l;
		int n;
		int i;
		int j;
		int k;
		int tmp;
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
				t[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				t[i].maths = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			t[i].sum = t[i].chinese + t[i].maths;
		}
		for (i = 0;i < 3;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (t[j].sum > t[k].sum)
				{
					k = j;
				}
			}
			l = t[k];
					  t[k] = t[i];
					  t[i] = l;
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%ld %ld\n",t[i].num,t[i].sum);
		}
		return 0;
	}
}


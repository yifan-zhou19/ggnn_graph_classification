package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		final String s1 = "male";
		final String s2 = "female";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char sex[10];
	//		double hei;
	//	}
	//	stu[40];
		double[] sz1 = new double[40];
		double[] sz2 = new double[40];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].hei = tempVar3;
			}
			if (strcmp(stu[i].sex,s1) == 0)
			{
				sz1[a] = stu[i].hei;
				a = a + 1;
			}
			if (strcmp(stu[i].sex,s2) == 0)
			{
				sz2[b] = stu[i].hei;
				b = b + 1;
			}
		}
		double e;

		for (k = 1;k < a + 1;k++)
		{
			for (j = 0;j < a + 1 - k;j++)
			{
				if (sz1[j] > sz1[j + 1])
				{
					e = sz1[j + 1];
					sz1[j + 1] = sz1[j];
					sz1[j] = e;
				}
			}
		}
			for (k = 1;k < b + 1;k++)
			{
			for (j = 0;j < b + 1 - k;j++)
			{
				if (sz2[j] < sz2[j + 1])
				{
					e = sz2[j + 1];
					sz2[j + 1] = sz2[j];
					sz2[j] = e;
				}
			}
			}
		for (j = 1;j < a + 1;j++)
		{
			System.out.printf("%.2lf ",sz1[j]);
		}
		for (j = 0;j < b - 1;j++)
		{
			System.out.printf("%.2lf ",sz2[j]);
		}
	System.out.printf("%.2lf",sz2[b - 1]);
		return 0;
	}







}


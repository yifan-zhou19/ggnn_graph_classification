package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	patient[100];
		int n;
		int i;
		int j;
		int k;
		int on = 0;
		int[] old = new int[100];
		int flag;
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
				patient[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patient[i].age = tempVar3;
			}
		}
		for (j = 120;j >= 60;j--)
		{
			for (i = 0;i < n;i++)
			{
				if (patient[i].age == j)
				{
					System.out.printf("%s\n",patient[i].id);
					old[on] = i;
					on++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (k = 0;k < on;k++)
			{
				if (i == old[k])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.printf("%s\n",patient[i].id);
			}
		}
		return 0;
	}
}


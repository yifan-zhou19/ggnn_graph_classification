package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		int id[7];
	//		int age;
	//	}
	//	patient[100];
		int i;
		int n;
		int max = 0;
		int k;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				patient[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (patient[i].age > max)
			{
				max = patient[i].age;
			}
		}
		for (k = max;k > 59;k--)
		{
			for (i = 0;i < n;i++)
			{
				if (patient[i].age == k)
				{
					System.out.printf("%s\n",patient[i].id);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (patient[i].age < 60)
			{
				System.out.printf("%s\n",patient[i].id);
			}
		}
	}
}


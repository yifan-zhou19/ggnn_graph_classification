package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Patient
	//	{
	//		char ID[10];
	//		int age;
	//	}
	//	patient[100],patient2[100];
		Patient t = new Patient();
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int num;
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
				patient[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				patient[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (patient[i].age >= 60)
			{
				patient2[j] = patient[i];
				j++;
			}
		}
		num = j;
		for (i = 0;i < n;i++)
		{
			if (patient[i].age < 60)
			{
				patient2[j] = patient[i];
				j++;
			}
		}
		for (k = 1;k < num;k++)
		{
			for (i = 0;i < num - k;i++)
			{
				if (patient2[i + 1].age > patient2[i].age)
				{
					t = patient2[i + 1];
					patient2[i + 1] = patient2[i];
					patient2[i] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",patient2[i].ID);
		}
		return 0;
	}

}


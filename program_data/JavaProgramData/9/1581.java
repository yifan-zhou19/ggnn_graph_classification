package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//	int age;
	//	}
	//	patient[100],old[100],t;
		int a;
		int i = 0;
		int j = 0;
		int k = 0;
		int r;
		int i1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;j + i < a;i++)
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
			if (patient[i].age >= 60)
			{
				old[j] = patient[i];
				j++;
				i--;
			}
		}
		for (r = 0;r < j - 1;r++)
		{
			for (k = 0;k < j - 1 - r;k++)
			{
				if (old[k].age < old[k + 1].age)
				{
					t = old[k];
					old[k] = old[k + 1];
					old[k + 1] = t;
				}
			}
		}
		for (r = 0;r < j;r++)
		{
			System.out.printf("%s\n",old[r].id);
		}
		for (r = 0;r < i;r++)
		{
			System.out.printf("%s\n",patient[r].id);
		}
		return 0;
	}


}


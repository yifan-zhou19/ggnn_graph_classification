package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patients
	//	{
	//	   char id[10];
	//	   int age;
	//	   }
	//	   temp;
		patients[] patient = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
		patients[] old = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
		int i;
		int j;
		int n;
		int first;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		first = 0;
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
			if (patient[i].age >= 60)
			{
				old[first] = patient[i];
				first = first + 1;
			}
		}
		for (i = 0;i < first;i++)
		{
			for (j = 0;j < first - i - 1;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					temp = old[j];
					old[j] = old[j + 1];
					old[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < first;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (patient[i].age < 60)
			{
				System.out.printf("%s\n",patient[i].id);
			}
		}
		return 0;
	}

}


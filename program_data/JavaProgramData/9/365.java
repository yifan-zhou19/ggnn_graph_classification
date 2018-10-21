package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient_t
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	patients[100], t;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patients[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patients[i].age = tempVar3;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = n - 1; j > i; j--)
			{
				if (patients[j].age >= 60 && patients[j].age > patients[j - 1].age)
				{
					t = patients[j];
					patients[j] = patients[j - 1];
					patients[j - 1] = t;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", patients[i].id);
		}
		return 0;
	}
}


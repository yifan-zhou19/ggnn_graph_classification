package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int mid;
		String M = new String(new char[11]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[11];
	//		int age;
	//	};
		patient[] per = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				per[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				per[i].age = tempVar3;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (per[i].age < 60 && per[i + 1].age >= 60)
				{
					mid = per[i].age;
					M = per[i].ID;
					per[i].age = per[i + 1].age;
					per[i].ID = per[i + 1].ID;
					per[i + 1].age = mid;
					per[i + 1].ID = M;
				}
				if (per[i].age >= 60 && per[i + 1].age >= 60 && per[i].age < per[i + 1].age)
				{
					mid = per[i].age;
					M = per[i].ID;
					per[i].age = per[i + 1].age;
					per[i].ID = per[i + 1].ID;
					per[i + 1].age = mid;
					per[i + 1].ID = M;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",per[i].ID);
		}
		per = null;
	}
}


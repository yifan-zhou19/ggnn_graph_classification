package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int m = 0;
		int[] patage = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char num[20];
	//		int age;
	//	};
		patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
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
				pat[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				patage[j] = pat[i].age;
				j++;
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (patage[j] < patage[j + 1])
				{
					temp = patage[j];
					patage[j] = patage[j + 1];
					patage[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (patage[i] == patage[i - 1])
			{
				continue;
			}
			for (j = 0;j < n;j++)
			{
				if (pat[j].age == patage[i])
				{
					System.out.printf("%s\n",pat[j].num);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				continue;
			}
			else
			{
				System.out.printf("%s\n",pat[i].num);
			}
		}
		return 0;
	}
}


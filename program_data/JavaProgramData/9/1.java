package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	};

		int n;
		int i;
		int j;
		int k;
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);

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
				p[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
		}

		for (i = 1; i < n; i++)
		{
			if (p[i].age >= 60)
			{
				j = 0;
				while (j < i && p[j].age >= p[i].age)
				{
					j++;
				}
				if (j < i)
				{
					patient tmp = p[i];
					for (k = i;k > j;k--)
					{
						p[k] = p[k - 1];
					}
					p[j] = tmp;
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", p[i].id);
		}

		return 0;
	}

}


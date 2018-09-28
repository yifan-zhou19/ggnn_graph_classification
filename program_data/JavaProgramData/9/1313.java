package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char id[10];
	//	int age;
	//	};
		s[] S = tangible.Arrays.initializeWithDefaultsInstances(100);
		s Si = new s();
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
				S[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				S[i].age = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (S[j + 1].age >= 60)
				{
					if (S[j].age < S[j + 1].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: Si=S[j];
						Si.copyFrom(S[j]);
						S[j] = S[j + 1];
						S[j + 1] = Si;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",S[i].id);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct client
	//	{
	//		char num[11];
	//		int age;
	//	};
		client[] line = tangible.Arrays.initializeWithDefaultclientInstances(100);
		client temp = new client();

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
				line[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				line[i].age = tempVar3;
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (line[j].age >= 60 && line[j + 1].age >= 60)
				{
					if (line[j].age < line[j + 1].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=line[j];
						temp.copyFrom(line[j]);
						line[j] = line[j + 1];
						line[j + 1] = temp;
					}
				}
				if (line[j].age < 60 && line[j + 1].age >= 60)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=line[j];
						temp.copyFrom(line[j]);
						line[j] = line[j + 1];
						line[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",line[i].num);
		}

	}
}


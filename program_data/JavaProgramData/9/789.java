package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char num[10];
	//		int age;
	//	};
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient temp = new patient();
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i].num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[i].age = tempVar3;
		}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (p[j].age > p[i].age && p[j].age >= 60)
				{
					for (k = j;k > i;k--)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=p[k];
						temp.copyFrom(p[k]);
						p[k] = p[k - 1];
						p[k - 1] = temp;
					}
				}
			}
			System.out.printf("%s\n",p[i].num);
		}
		System.out.printf("%s\n",p[n - 1].num);
		return 0;
	}

}


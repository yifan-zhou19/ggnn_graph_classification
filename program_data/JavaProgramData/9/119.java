package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int s;
		int t;
		int k = 0;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[10];
	//		int age;
	//	};
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] d = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient temp = new patient();
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
				p[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
				d[j++] = p[i];
			}
			else
			{
				c[k++] = p[i];
			}
		}
		s = j;
		t = k;
		for (i = 1;i < s;i++)
		{
			for (j = 0;j < s - i;j++)
			{
				if (d[j].age < d[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
					temp.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%s\n",d[i].ID);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%s\n",c[i].ID);
		}
	}

}


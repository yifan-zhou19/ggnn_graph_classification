package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct bingren
	//	{
	//		char num[10];
	//		int age;
	//	};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		bingren[] u = tangible.Arrays.initializeWithDefaultbingrenInstances(1000);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				u[i].age = tempVar3;
			}
		}
		bingren[] v = tangible.Arrays.initializeWithDefaultbingrenInstances(1000);
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (u[i].age > 59)
			{
				v[j] = u[i];
			j++;
			}
		}
		int k;
		bingren e = new bingren();
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (v[i].age < v[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=v[i+1];
					e.copyFrom(v[i + 1]);
					v[i + 1] = v[i];
					v[i] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",v[i].num);
		}
			for (i = 0;i < n;i++)
			{
				if (u[i].age < 60)
				{
				System.out.printf("%s\n",u[i].num);
				}
			}
		return 0;
	}



}


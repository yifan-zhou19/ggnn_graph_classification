// ??(14-6) ????.cpp : Defines the entry point for the console application.
//


public class patient
{
	public String id = new String(new char[20]);
	public int age;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		for (i = 1;i <= n;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			p[i].num = i;
		}
		for (i = 1;i <= n - 1;++i)
		{
			for (j = i + 1;j <= n;++j)
			{
				if (p[j].age > p[i].age)
				{
					patient t = new patient();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[i];
					t.copyFrom(p[i]);
					p[i] = p[j];
					p[j] = t;
				}
			}
		}
		for (i = 1;p[i].age >= 60;++i)
		{
			for (j = i + 1;p[j].age == p[i].age;++j)
			{
				if (p[i].num > p[j].num)
				{
					patient t = new patient();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[i];
					t.copyFrom(p[i]);
					p[i] = p[j];
					p[j] = t;
				}
			}
			System.out.printf("%s\n",p[i].id);
		}
		for (j = i;j <= n;++j)
		{
			int k;
			for (k = j + 1;k <= n;++k)
			{
				if (p[j].num > p[k].num)
				{
					patient t = new patient();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[j];
					t.copyFrom(p[j]);
					p[j] = p[k];
					p[k] = t;
				}
			}
			System.out.printf("%s\n",p[j].id);
		}
		return 0;
	}


}


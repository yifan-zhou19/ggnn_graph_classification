public class patient
{
	public String No = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(101);
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].No = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		patient t = new patient();
		for (i = 2;i <= n;i++)
		{
			if (p[i].age >= 60)
			{
				for (j = i;j > 1;j--)
				{
					if (p[j - 1].age < p[j].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[j-1];
						t.copyFrom(p[j - 1]);
						p[j - 1] = p[j];
						p[j] = t;
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",p[i].No);
		}
		return 0;
	}
}


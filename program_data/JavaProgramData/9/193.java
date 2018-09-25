public class patient
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static int cmp(Object _p1, Object _p2)
	{
		patient p1 = (patient)_p1;
		patient p2 = (patient)_p2;
		if (p1.age >= 60 && p1.age < 60)
		{
			return -1;
		}
		else if (p1.age < 60 && p2.age >= 60)
		{
			return 1;
		}
		else if (p1.age >= 60 && p2.age >= 60)
		{
			return p2.age - p1.age;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int i;
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
				pat[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(pat,n,sizeof(patient),cmp);

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",pat[i].ID);
		}
		return 0;
	}

}


public class patient
{
	public int order;
	public int age;
	public String id = new String(new char[10]);
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		patient pa = (struct patient) a;
		patient pb = (struct patient) b;
		if ((pa.age >= 60) && (pb.age < 60))
		{
			return -1;
		}
		else if ((pa.age < 60) && (pb.age >= 60))
		{
			return 1;
		}
		else if ((pa.age >= 60) && (pa.age != pb.age))
		{
			return pb.age - pa.age;
		}
		else
		{
			return pa.order - pb.order;
		}
	}

	public static int Main()
	{
		int i;
		int num;
		patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0; i < num; ++i)
		{
			pat[i].order = i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pat[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(pat[i].age) = Integer.parseInt(tempVar3);
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(pat, num, sizeof(patient), cmp);

		for (i = 0; i < num; ++i)
		{
			System.out.printf("%s\n", pat[i].id);
		}
	}

}


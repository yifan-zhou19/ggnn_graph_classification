package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char name[16];
	//		int age;
	//	};
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i].name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[i].age = tempVar3;
		}
		}
		patient[] q = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		for (i = 0,j = 0;i < n;i++)
		{
		if (p[i].age >= 60)
		{
			q[j].name = p[i].name,q[j].age = p[i].age,j++;
		}
		}
		int k;
		int t;
		String s = new String(new char[16]);
		for (k = 0;k < j;k++)
		{
			for (i = 0;i < j - k - 1;i++)
			{
			if (q[i].age < q[i + 1].age)
			{
			s = q[i].name,strcpy(q[i].name,q[i + 1].name),strcpy(q[i + 1].name,s), t = q[i].age,q[i].age = q[i + 1].age,q[i + 1].age = t;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
		if (p[i].age < 60)
		{
			q[j].name = p[i].name,q[j].age = p[i].age,j++;
		}
		}
		for (i = 0;i < n;i++)
		{
		System.out.println(q[i].name);
		}
		System.out.print('\n');
	}
}


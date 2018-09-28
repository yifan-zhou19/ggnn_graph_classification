public class patient
{
	public String id = new String(new char[11]);
	public int age;
}

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
		patient p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (patient)malloc(len);
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		int anum = 0;
		int bnum = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			if (p.age >= 60)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[anum] = (patient)malloc(len);
				a[anum].id = p.id;
				a[anum].age = p.age;
				anum++;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				b[bnum] = (patient)malloc(len);
				b[bnum].id = p.id;
				b[bnum].age = p.age;
				bnum++;
			}
		}
		for (i = 0;i < anum - 1;i++)
		{
			for (j = 0;j < anum - i - 1;j++)
			{
			if (a[j].age < a[j + 1].age)
			{
				p.age = a[j].age;
				a[j].age = a[j + 1].age;
				a[j + 1].age = p.age;
				p.id = a[j].id;
				a[j].id = a[j + 1].id;
				a[j + 1].id = p.id;
			}
			}
		}
		for (i = 0;i < anum;i++)
		{
		System.out.printf("%s\n",a[i].id);
		}
		for (i = 0;i < bnum;i++)
		{
		System.out.printf("%s\n",b[i].id);
		}
	}
}


public class patient
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int max;
		int num = 0;
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(110);
		patient t = new patient();
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
				a[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
			max = i;
			for (j = i;j < n;j++)
			{
				if (a[j].age > a[max].age)
				{
					max = j;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[max];
			t.copyFrom(a[max]);
			for (j = max;j > i;j--)
			{
				a[j] = a[j - 1];
			}
			a[i] = t;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i].id);
		}
		return 0;
	}

}


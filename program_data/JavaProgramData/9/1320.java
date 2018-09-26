public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		String p = new String(new char[10]);
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
			if (a[i].age >= 60)
			{
				for (k = 0;i - k >= 1;k++)
				{
					if (a[i - k].age > a[i - k - 1].age)
					{
						e = a[i - k].age;
						a[i - k].age = a[i - k - 1].age;
						a[i - k - 1].age = e;

						p = a[i - k].id;
						a[i - k].id = a[i - k - 1].id;
						a[i - k - 1].id = p;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i].id);
		}
		return 0;
	}
}


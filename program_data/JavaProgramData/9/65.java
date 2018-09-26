public class patient
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int k = 0;
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] t = tangible.Arrays.initializeWithDefaultpatientInstances(1);
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
				a[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
			if (a[i].age >= 60)
			{
				b[j].ID = a[i].ID;
				b[j].age = a[i].age;
				j = j + 1;
			}
			else
			{
				c[k].ID = a[i].ID;
				c[k].age = a[i].age;
				k = k + 1;
			}

		}
		m = j;
		for (j = 1;j <= m - 1;j++)
		{
			for (i = 0;i <= m - 1 - j;i++)
			{
				if (b[i].age < b[i + 1].age)
				{
				   t[0].ID = b[i].ID;
					t[0].age = b[i].age;
				   b[i].ID = b[i + 1].ID;
				   b[i].age = b[i + 1].age;
				   b[i + 1].ID = t[0].ID;
				   b[i + 1].age = t[0].age;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",b[i].ID);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",c[i].ID);
		}
		return 0;
	}
}


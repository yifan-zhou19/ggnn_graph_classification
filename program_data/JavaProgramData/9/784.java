public class information
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static information[] a;
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max;
		int p;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = tangible.Arrays.initializeWithDefaultinformationInstances(n);
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age > 59)
			{
				q++;
			}
		}
		for (i = 0;i < q;i++)
		{
			max = 0;
			for (j = 0;j < n;j++)
			{
				if (max < a[j].age)
				{
					max = a[j].age;
					p = j;
				}
			}
			System.out.printf("%s\n",a[p].ID);
			a[p].age = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age != 0)
			{
				System.out.printf("%s\n",a[i].ID);
			}
		}
	}

}


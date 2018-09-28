public class peo
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static peo[] a = tangible.Arrays.initializeWithDefaultpeoInstances(150);
	public static peo[] b = tangible.Arrays.initializeWithDefaultpeoInstances(150);
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int e;
		int k;
		String c = new String(new char[10]);
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
				b[j].id = a[i].id;
				b[j].age = a[i].age;
				j++;
			}
		}
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (b[i].age < b[i + 1].age)
				{
					e = b[i + 1].age;
					b[i + 1].age = b[i].age;
					b[i].age = e;
					c = b[i + 1].id;
					b[i + 1].id = b[i].id;
					b[i].id = c;
				}
			}
		}
			for (i = 0;i < j;i++)
			{
				System.out.printf("%s\n",b[i].id);
			}
			for (i = 0;i < n;i++)
			{
				if (a[i].age < 60)
				{
				System.out.printf("%s\n",a[i].id);
				}
			}
	}
}


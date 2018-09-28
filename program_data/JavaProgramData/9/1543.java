public class p
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble(p[] a, int n)
	{
		int i;
		int j;
		p temp = new p();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j].age >= 60)
				{
					if (a[j + 1].age > a[j].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
						temp.copyFrom(a[j]);
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
				else
				{
					if (a[j + 1].age >= 60)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
						temp.copyFrom(a[j]);
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		p[] a = tangible.Arrays.initializeWithDefaultpInstances(100);
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
		bubble(a, n);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i].id);
		}
		return 0;
	}

}


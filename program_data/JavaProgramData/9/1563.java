public class pa
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static pa[] p = tangible.Arrays.initializeWithDefaultpaInstances(105);
	public static pa t = new pa();
	public static pa[] a = tangible.Arrays.initializeWithDefaultpaInstances(105);
	public static int Main()
	{
		int i;
		int k;
		int n;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 0;i + k < n;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			if (p[i].age >= 60)
			{
				a[k] = p[i];
				k++;
			}
			else
			{
				i++;
			}
		}
		for (c = 0;c < k - 1;c++)
		{
			for (d = 0;d < k - 1;d++)
			{
				if (a[d].age < a[d + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[d];
					t.copyFrom(a[d]);
					a[d] = a[d + 1];
					a[d + 1] = t;
				}

			}
		}

		if (k >= 0)
		{
			k--;
		for (c = 0;c <= k;c++)
		{
			System.out.printf("%s\n",a[c].num);
		}
		}
	if (i >= 0)
	{
		i--;
		for (d = 0;d <= i;d++)
		{
			System.out.printf("%s\n",p[d].num);
		}
	}
		return 0;
	}

}


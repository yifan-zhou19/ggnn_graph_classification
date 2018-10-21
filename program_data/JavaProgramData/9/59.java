public class bin
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static bin t = new bin();
	public static bin[] b = tangible.Arrays.initializeWithDefaultbinInstances(100);
	public static bin[] c = tangible.Arrays.initializeWithDefaultbinInstances(100);
	public static bin[] a = tangible.Arrays.initializeWithDefaultbinInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int p;
		int q;
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
				a[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
			if (a[i].age >= 60)
			{
				b[j] = a[i];
				j++;
			}
			p = j;
			if (a[i].age < 60)
			{
				c[k] = a[i];
				k++;
			}
			q = k;
		}

		for (j = 1;j < p;j++)
		{
		for (i = 0;i < p - j;i++)
		{
			if (b[i].age < b[i + 1].age)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=b[i];
			  t.copyFrom(b[i]);
			  b[i] = b[i + 1];
			  b[i + 1] = t;
			}
		}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%s\n",b[i].num);
		}
		for (i = 0;i < q;i++)
		{
			System.out.printf("%s\n",c[i].num);
		}
	}
}


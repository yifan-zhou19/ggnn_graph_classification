public class v
{
	public String a = new String(new char[10]);
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int l;
		int k;
		v[] c;
		v[] e = tangible.Arrays.initializeWithDefaultvInstances(100);
		v y = new v();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = tangible.Arrays.initializeWithDefaultvInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i].b = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i].b >= 60)
			{
				e[j] = c[i];
				j = j + 1;
			}

		}
		k = j;
		for (l = 1;l < k;l++)
		{
			for (j = 0;j < k - l;j++)
			{
				if (e[j].b < e[j + 1].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: y=e[j];
					y.copyFrom(e[j]);
					e[j] = e[j + 1];
					e[j + 1] = y;

				}
			}
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%s\n",e[j].a);
		}
		for (i = 0;i < n;i++)
		{
			if (c[i].b < 60)
			{
				System.out.printf("%s\n",c[i].a);
			}
		}
	  return 0;
	}
}


public class prin
{
	public double b;
	public int a;
	public int flag;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double ar = 0;
		prin[] p = tangible.Arrays.initializeWithDefaultprinInstances(10000);
		int i;
		int j;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].a = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			ar = ar + p[i].a / n;
		}
		for (i = 0;i < n;i++)
		{
			p[i].b = (double)Math.abs(p[i].a - ar);
			p[i].flag = 0;
		}
		k = p[0].b;
		for (i = 0;i < n;i++)
		{
			if (p[i].b > k)
			{
				k = p[i].b;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].b == k)
			{
				p[i].flag = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].flag == 1)
			{
				System.out.printf("%d",p[i].a);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (p[j].flag == 1)
			{
				System.out.printf(",%d",p[j].a);
			}
		}
		return 0;
	}


}


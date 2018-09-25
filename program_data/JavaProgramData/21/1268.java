public class cha
{
	public int a;
	public float c;
}

package <missing>;

public class GlobalMembers
{
	public static cha[] d = tangible.Arrays.initializeWithDefaultchaInstances(300);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int o = 0;
		int h;
		float k;
		float s = 0F;
		float z = 0F;
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
				d[i].a = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			z = z + d[i].a;
		}
		s = z / n;
		for (i = 0;i < n;i++)
		{
			d[i].c = s - d[i].a;
			if (d[i].c < 0F)
			{
				d[i].c = (-1) * d[i].c;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				if (d[i].c < d[i + j].c)
				{
					k = d[i].c;
					d[i].c = d[i + j].c;
					d[i + j].c = k;
					h = d[i].a;
					d[i].a = d[i + j].a;
					d[i + j].a = h;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (d[0].c == d[i].c)
			{
				o++;
			}
		}
		for (i = 0;i < o;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				if (d[i].a >= d[i + j].a)
				{
					k = d[i].c;
					d[i].c = d[i + j].c;
					d[i + j].c = k;
					h = d[i].a;
					d[i].a = d[i + j].a;
					d[i + j].a = h;
				}
			}
		}
		for (i = 0;i < o;i++)
		{
			System.out.printf("%d,",d[i].a);
		}
		System.out.printf("%d\n",d[i].a);
		return 0;
	}
}


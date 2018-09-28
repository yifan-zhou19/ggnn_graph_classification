public class ren
{
	public String x = new String(new char[21]);
	public char g;
	public char s;
	public int a1;
		public int a2;
		public int n;
		public int c;
}

package <missing>;

public class GlobalMembers
{
	public static ren[] a = tangible.Arrays.initializeWithDefaultrenInstances(102);

	public static void Main()
	{
		int N;
		int i;
		int max = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].a1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].a2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].s = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].n = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			a[i].c = 0;
		}
		for (i = 0;i < N;i++)
		{
			if (a[i].a1 > 80 && a[i].n >= 1)
			{
				a[i].c = a[i].c + 8000;
			}
			if (a[i].a1 > 85 && a[i].a2 > 80)
			{
				a[i].c = a[i].c + 4000;
			}
			if (a[i].a1 > 90)
			{
				a[i].c = a[i].c + 2000;
			}
			if (a[i].a1 > 85 && a[i].s == 'Y')
			{
				a[i].c = a[i].c + 1000;
			}
			if (a[i].a2 > 80 && a[i].g == 'Y')
			{
				a[i].c = a[i].c + 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			z = z + a[i].c;

			if (max < a[i].c)
			{
				max = a[i].c;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i].c == max)
			{
				System.out.printf("%s\n%d\n%ld",a[i].x,a[i].c,z);
				break;
			}
		}
	}
}


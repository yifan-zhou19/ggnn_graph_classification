public class In
{
	public String name = new String(new char[21]);
	public int g1;
	public int g2;
	public char y1;
	public char y2;
	public int g3;
	public int g;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int b;
		int d = 0;
		int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	In[] a = tangible.Arrays.initializeWithDefaultInInstances(101);
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i].name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].g1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[i].g2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			a[i].y1 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			a[i].y2 = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			a[i].g3 = Integer.parseInt(tempVar7);
		}
		if (a[i].g3 > 0)
		{
			b = 1;
		}
		else
		{
			b = 0;
		}
	a[i].g = (a[i].g1 / 81) * b * 8000 + (a[i].g1 / 86) * (a[i].g2 / 81) * 4000 + (a[i].g1 / 91) * 2000 + (a[i].g1 / 86) * (a[i].y2 / 81) * 1000 + (a[i].g2 / 81) * (a[i].y1 / 81) * 850;
	}
	for (i = 0;i < n;i++)
	{
		d = d + a[i].g;
	if (a[i].g > m)
	{
		m = a[i].g;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i].g == m)
	{
		System.out.printf("%s\n%d\n%d\n",a[i].name,a[i].g,d);
		break;
	}
	}
	return 0;
	}
}


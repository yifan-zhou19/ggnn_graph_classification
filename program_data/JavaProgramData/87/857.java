package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		int i;
		int[] a = new int[50];
		int[] b = new int[50];
		int[] c = new int[50];
		int[] d = new int[50];
		int[] e = new int[50];
		int[] f = new int[50];
		int m = -1;
		int[] n = new int[50];
		for (i = 0;i < 50;i++)
		{
		n[i] = 0;
		}
		for (i = 0;i >= 0;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f[i] = Integer.parseInt(tempVar6);
		}
		m++;
		if (a[i] == 0 && b[i] == 0 && c[i] == 0 && e[i] == 0 && f[i] == 0)
		{
			break;
		}
		}
		for (i = 0;i < m;i++)
		{
		d[i] = d[i] + 12;
		if (f[i] < c[i])
		{
			f[i] = f[i] + 60;
			e[i]--;
			n[i] = n[i] + f[i] - c[i];
		}
		else
		{
			n[i] = n[i] + f[i] - c[i];
		}
		if (e[i] < b[i])
		{
			e[i] = e[i] + 60;
			d[i]--;
			n[i] = n[i] + (e[i] - b[i]) * 60;
		}
		else
		{
			n[i] = n[i] + (e[i] - b[i]) * 60;
		}
		n[i] = n[i] + (d[i] - a[i]) * 3600;
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%d\n",n[i]);
		}
		return 0;
	  }

}


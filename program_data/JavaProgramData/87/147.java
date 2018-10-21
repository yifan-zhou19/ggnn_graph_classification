package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[100];
	  int[] b = new int[100];
	  int[] c = new int[100];
	  int[] d = new int[100];
	  int[] e = new int[100];
	  int[] f = new int[100];
	  int s;
	  int i;
	  for (i = 0;a[i] != 0;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f[i] = Integer.parseInt(tempVar6);
		}
	  }
	  for (i = 0;a[i] != 0;i++)
	  {
		s = (12 + d[i] - a[i]) * 3600 + (e[i] - b[i]) * 60 + (f[i] - c[i]);
		System.out.printf("%d\n",s);
	  }
	  return 0;
	}

}


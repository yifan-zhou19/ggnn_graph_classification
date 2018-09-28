package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[100][100];
	 int h;
	 int l;
	 int k;
	 int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		h = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		l = Integer.parseInt(tempVar2);
	}
	for (k = 0;k < h;k++)
	{
	 for (j = 0;j < l;j++)
	 {
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[k][j] = Integer.parseInt(tempVar3);
	}
	 }
	}
	int ph = 0;
	int pl = 0;
	System.out.printf("%d\n",a[ph][pl]);
	a[ph][pl] = 0;
	int cs = h * l;
	for (int z = 1;z < cs;z++)
	{
		if ((ph == 0 || a[ph - 1][pl] == 0) && a[ph][pl + 1] != 0)
		{
		   pl = pl + 1;
		   System.out.printf("%d\n",a[ph][pl]);
		   a[ph][pl] = 0;
		}
		else if ((pl == l - 1 || a[ph][pl + 1] == 0) && a[ph + 1][pl] != 0)
		{
			ph = ph + 1;
			System.out.printf("%d\n",a[ph][pl]);
			a[ph][pl] = 0;
		}
		else if (a[ph + 1][pl] == 0 && pl != 0 && a[ph][pl - 1] != 0)
		{
			pl = pl - 1;
			System.out.printf("%d\n",a[ph][pl]);
			a[ph][pl] = 0;
		}
		else if ((a[ph][pl - 1] == 0 || ph == 0) && a[ph - 1][pl] != 0)
		{
			ph = ph - 1;
			System.out.printf("%d\n",a[ph][pl]);
			a[ph][pl] = 0;
		}
		else
		{
			break;
		}
	}
	return 0;
	}
}


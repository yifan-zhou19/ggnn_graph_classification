package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[30];
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int t;
		int[] c = new int[30];
		for (i = 1;i < k;i++)
		{
					 t = 0;
				  for (j = 0;j < 30;j++)
				  {
								   c[j] = 0;
				  }
				  for (j = i - 1;j >= 0;j--)
				  {
								   if (a[j] >= a[i])
								   {
										   c[t] = b[j];
										   t++;
								   }
				  }
				  qsort(c,t,(Integer.SIZE / Byte.SIZE),compare);
				  b[i] = c[0] + 1;
		}
		for (i = 0;i < k;i++)
		{
						if (m < b[i])
						{
						m = b[i];
						}
		}
		System.out.printf("%d\n",m);
		System.in.read();
		System.in.read();
		System.in.read();
	}
}


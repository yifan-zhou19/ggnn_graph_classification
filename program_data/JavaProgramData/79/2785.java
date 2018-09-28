package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		while (n[i] != 0 && m != 0)
		{
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
		}
		num = i - 1;
		return 0;
	}
	public static void circle(int t)
	{
		int j;
		for (j = 1;j <= n[t];j++)
		{
			a[j] = 1;
		}
		baoshu(n[t], 1);
		return;
	}
	public static void print()
	{
		for (i = 1;i <= num;i++)
		{
			System.out.printf("%d\n",ans[i]);
		}
		return;
	}
	public static void baoshu(int p, int q)
	{
		int zz;
		int j;
		int k;
		int z;
		if (p == 1)
		{
			ans[i] = q;
			return;
		}
		else
		{
		zz = q;
		j = 1;
		while (j < m[i])
		{
			j++;
			if (zz < n[i])
			{
				z = zz;
				for (k = zz + 1;k <= n[i];k++)
				{
				   if (a[k] == 1)
				   {
					   zz = k;
					   break;
				   }
				}
				 if (z == zz)
				 {
				   for (k = 1;k <= zz;k++)
				   {
					  if (a[k] == 1)
					  {
						  zz = k;
						  break;
					  }
				   }
				 }
			}
			else
			{
				for (k = 1;k <= n[i];k++)
				{
				   if (a[k] == 1)
				   {
					   zz = k;
					   break;
				   }
				}
			}
		}
		a[zz] = 0;
		z = zz;
		for (k = z;k <= n[i];k++)
		{
				   if (a[k] == 1)
				   {
					   zz = k;
					   break;
				   }
		}
		if (z == zz)
		{
		  for (k = 1;k < z;k++)
		  {
				   if (a[k] == 1)
				   {
					   zz = k;
					   break;
				   }
		  }
		}
		baoshu(p - 1, zz);
		}
	  return;
	}
	public static int[] n = new int[100];
	public static int[] m = new int[100];
	public static int[] a = new int[300];
	public static int[] ans = new int[100];
	public static int num;
	public static int i;
	public static int Main()
	{
		read();
		for (i = 1;i <= num;i++)
		{
			circle(i);
		}
		print();
		return 0;
	}

}


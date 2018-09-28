package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][100];
		int[] b = new int[n];
		int i;
		int j;
		int[] c = new int[n];
		int[] d = new int[n];
		int k;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
			d[i] = n;
			for (j = 0;j < n;j++)
			{
					  if (b[j] >= 60 && b[j] > c[i])
					  {
						   for (k = 0;k < i;k++)
						   {
							   if (j == d[k])
							   {
							   break;
							   }
						   }
						   if (k == i)
						   {
							   c[i] = b[j];
							   d[i] = j;
						   }
					  }
			}
			if (d[i] != n && b[d[i]] >= 60)
			{
			System.out.printf("%s\n",a[d[i]]);
			}
		}
		for (i = 0;i < n;i++)
		{
			 if (b[i] < 60)
			 {
			 System.out.printf("%s\n",a[i]);
			 }
		}
		System.in.read();
		System.in.read();
	}

}


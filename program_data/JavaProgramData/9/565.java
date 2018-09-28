package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		char[][] a = new char[100][10];
		char[][] over = new char[100][10];
		char[][] below = new char[100][10];
		char[][] h = new char[100][10];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (int i = 1;i <= n;i++)
		{
			if (b[i] >= 60)
			{
				  c[i] = b[i];
			  over[i] = a[i];
			}
			else
			{
				  d[i] = b[i];
			  below[i] = a[i];
			}

		}
	for (k = 101;k >= 60;k--)
	{
		i = 1;
		while (i <= n)
		{
			if (c[i] == k)
			{
			System.out.printf("%s\n",over[i]);
			}
		i++;
		}
	}
		i = 1;
		while (i <= n)
		{
			  if (d[i] != 0)
			  {
			  System.out.printf("%s\n",below[i]);
			  }
		i++;
		}
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}
}


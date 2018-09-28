package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int x;
		int i = 0;
		int m;
		int k = 0;
		int num = 0;
		int num1 = 0;
		int[] a = new int[1000000];
		int[] b = new int[1000000];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				if (a[i] == 0 && b[i] == 0)
				{
				break;
				}
				else
				{
					i++;
				}
		}
		for (x = 0;x < n;x++)
		{
			m = 0;
			for (j = 0;j < i;j++)
			{
							if (a[j] == x)
							{
									   m = 1;
									   break;
							}
			}
			if (m == 0)
			{
					 c[k] = x;
					 k++;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
		for (j = 0;j < k;j++)
		{
						for (x = 0;x < i;x++)
						{
										if (b[x] == c[j])
										{
										num++;
										}
						}
						if (num == n - 1)
						{
									 System.out.printf("%d",c[j]);
									 num1++;
						}
		}
		if (num1 == 0)
		{
			System.out.print("NOT FOUND");
		}
		}
		System.in.read();
		System.in.read();
	}
}


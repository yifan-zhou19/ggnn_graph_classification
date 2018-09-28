package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[65535];
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
		System.out.print("0\n");
		}
		while (true)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				if (i == 0 && j == 0)
				{
				break;
				}
				else
				{
					a[i]--;
					a[j]++;
				}
		}
		for (i = 0;i < n;i++)
		{
						if (a[i] == (n - 1))
						{
									   System.out.printf("%d",i);
									   sum++;
						}
		}
		if (sum == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}

}


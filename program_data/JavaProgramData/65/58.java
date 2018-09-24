package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[200];
		int[] b = new int[200];
		int t = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							b[i] = Integer.parseInt(tempVar3);
						}
		}
		for (i = 0;i < n;i++)
		{
						if (a[i] == 0 && b[i] == 1)
						{
										   t++;
						}
						else if (a[i] == 1 && b[i] == 2)
						{
							 t++;
						}
						else if (a[i] == 2 && b[i] == 0)
						{
							 t++;
						}
						else if (a[i] == b[i])
						{
							 continue;
						}
						else
						{
							 j++;
						}
		}
		if (t == j)
		{
				 System.out.print("Tie");
		}
		else if (t > j)
		{
			 System.out.print("A");
		}
		else if (t < j)
		{
			 System.out.print("B");
		}


		return EXIT_SUCCESS;
	}
}


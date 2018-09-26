package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int[] a = new int[2000];
		int[] b = new int[2000];
		int i;
		int j;
		int c;
		int[] d = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d[0] = 0;
		d[1] = 0;
		for (j = 0;j < n;j++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Integer.parseInt(tempVar3);
				}
				c = a[j] - b[j];
				if (c == 1)
				{
					d[1]++;
				}
				else if (c == 2)
				{
					d[0]++;
				}
				else if (c == -1)
				{
					d[0]++;
				}
				else if (c == -2)
				{
					d[1]++;
				}
				else
				{
					continue;
				}
		}
		if (d[0] > d[1])
		{
			System.out.print("A\n");
		}
		else if (d[0] < d[1])
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}

	  return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int y = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			if (a[i] == 0)
			{
				if (b[i] == 0)
				{
					y++;
					k++;
				}
				else if (b[i] == 1)
				{
					y++;
				}
				else if (b[i] == 2)
				{
					k++;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 0)
				{
					k++;
				}
				else if (b[i] == 1)
				{
					y++;
					k++;
				}
				else if (b[i] == 2)
				{
					y++;
				}
			}
			else if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					y++;
				}
				else if (b[i] == 1)
				{
					k++;
				}
				else if (b[i] == 2)
				{
					y++;
					k++;
				}
			}
		}
		if (y > k)
		{
			System.out.print("A");
		}
		else if (y == k)
		{
			System.out.print("Tie");
		}
		else if (y < k)
		{
			System.out.print("B");
		}


		return 0;
	}
}


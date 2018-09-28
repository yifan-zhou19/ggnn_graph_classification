package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int count = 0;
		int[][] a = new int[200][2];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 0 && a[i][1] == 1)
			{
				count++;
			}
			else if (a[i][0] == 0 && a[i][1] == 2)
			{
				count--;
			}
			else if (a[i][0] == 0 && a[i][1] == 0)
			{
				count += 0;
			}
			else if (a[i][0] == 1 && a[i][1] == 0)
			{
				count--;
			}
			else if (a[i][0] == 1 && a[i][1] == 1)
			{
				count += 0;
			}
			else if (a[i][0] == 1 && a[i][1] == 2)
			{
				count++;
			}
			else if (a[i][0] == 2 && a[i][1] == 0)
			{
				count++;
			}
			else if (a[i][0] == 2 && a[i][1] == 1)
			{
				count--;
			}
			else if (a[i][0] == 2 && a[i][1] == 2)
			{
				count += 0;
			}
		}
		if (count == 0)
		{
			System.out.print("Tie\n");
		}
		else if (count > 0)
		{
			System.out.print("A\n");
		}
		else
		{
			System.out.print("B\n");
		}
		return 0;
	}
}


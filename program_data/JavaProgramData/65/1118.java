package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int result;
		result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[200][2];
		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][0] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][1] = Integer.parseInt(tempVar3);
				}
				if ((a[i][0] == 0 && a[i][1] == 1) || (a[i][0] == 1 && a[i][1] == 2) || (a[i][0] == 2 && a[i][1] == 0))
				{
				result = result + 1;
				}
			else if (a[i][0] == a[i][1])
			{
				result = result;
			}
			else if ((a[i][0] == 0 && a[i][1] == 2) || (a[i][0] == 1 && a[i][1] == 0) || (a[i][0] == 2 && a[i][1] == 1))
			{
				result = result - 1;
			}
		}
		if (result > 0)
		{
			System.out.print("A");
		}
		else if (result < 0)
		{
			System.out.print("B");
		}
		else if (result == 0)
		{
			System.out.print("Tie");
		}
	return 0;
	}


}


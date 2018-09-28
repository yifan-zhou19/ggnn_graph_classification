package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int[][] kg = new int[300][5];
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
				kg[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				kg[i][1] = Integer.parseInt(tempVar3);
			}
			if (kg[i][0] == 0 && kg[i][1] == 1)
			{
				a++;
			}
			else if (kg[i][0] == 0 && kg[i][1] == 2)
			{
				b++;
			}
			else if (kg[i][0] == 1 && kg[i][1] == 0)
			{
				b++;
			}
			else if (kg[i][0] == 1 && kg[i][1] == 2)
			{
				a++;
			}
			else if (kg[i][0] == 2 && kg[i][1] == 0)
			{
				a++;
			}
			else if (kg[i][0] == 2 && kg[i][1] == 1)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}
}


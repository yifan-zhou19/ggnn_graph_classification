package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[][] game = new int[201][2];
	int a = 0;
	int b = 0;
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
			game[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			game[i][1] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (game[i][0] == game[i][1])
		{
			continue;
		}
		else if (game[i][0] == 0 && game[i][1] == 1)
		{
			a++;
			continue;
		}
		else if (game[i][0] == 0 && game[i][1] == 2)
		{
			b++;
			continue;
		}
		else if (game[i][0] == 1 && game[i][1] == 0)
		{
			b++;
			continue;
		}
		else if (game[i][0] == 1 && game[i][1] == 2)
		{
			a++;
			continue;
		}
		else if (game[i][0] == 2 && game[i][1] == 0)
		{
			a++;
			continue;
		}
		else if (game[i][0] == 2 && game[i][1] == 1)
		{
			b++;
			continue;
		}
	}
	if (a == b)
	{
		System.out.print("Tie");
	}
	else if (a > b)
	{
		System.out.print("A");
	}
	else
	{
		System.out.print("B");
	}
		return 0;
	}
}


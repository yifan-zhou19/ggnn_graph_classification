package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int[][] c = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((c[i][0] == 0 && c[i][1] == 1) || (c[i][0] == 1 && c[i][1] == 2) || (c[i][0] == 2 && c[i][1] == 0))
			{
				a++;
			}
			else if (c[i][0] == c[i][1])
			{
				a = a + 0;
				b = b + 0;
			}
			else
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (b > a)
		{
			System.out.print("B");
		}
			if (a == b)
			{
				System.out.print("Tie");
			}
		return 0;
	}

}


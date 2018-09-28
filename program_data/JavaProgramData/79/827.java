package <missing>;

public class GlobalMembers
{
	public static int joseph(int n,int m)
	{
		int[] mon = new int[300];
		int i;
		int j;
		int f;

		for (i = 0;i < n;i++)
		{
			mon[i] = i + 1; //????? ?n?
		}
		for (i = -1,j = 0;n != 1;)
		{
			i = i + 1;
			j = j + 1;
			if (i >= n)
			{
				i = 0;
			}
			if (j == m)
			{
				for (f = i;f < n - 1;f++)
				{
					mon[f] = mon[f + 1];
				}
				n = n - 1;
				j = 0;
				i = i - 1;
			}
		}
		return mon[0];
	}


	public static void Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int t;
		int king;
		int i;

		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0)
			{
				break;
			}
		}
		t = i;
		for (i = 0;i < t;i++)
		{
			king = joseph(n[i], m[i]);
			System.out.printf("%d",king);
			if (i != t - 1)
			{
				System.out.print("\n");
			}
		}
	}

}


package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n;
		int h = 0;
		int hmax = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][3]; //a?????
		for (int i = 1;i <= n;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (90 <= a[i][1] != 0 && a[i][1] <= 140 && 60 <= a[i][2] != 0 && a[i][2] <= 90)
			{
				h++;
			}
			else
			{
				h = 0;
			}
			hmax = h >= hmax != 0?h:hmax;
		}
		System.out.print(hmax);
	}
}


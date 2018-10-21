package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] dish = new int[9][9];
		int[][] temp = new int[9][9];
		int i = 0;
		int j = 0;
		int n = 0;
		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dish[4][4] = m;
		int[] p = dish[0];
		int[] q = temp[0];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 81;j++,p++,q++)
			{
				if (p[0] != 0)
				{
					q[0] += 2 * p[0];
					*(q - 1) += p[0];
					q[1] += p[0];
					*(q - 9) += p[0];
					q[9] += p[0];
					*(q - 10) += p[0];
					q[10] += p[0];
					*(q - 8) += p[0];
					q[8] += p[0];
				}
			}
			p = dish[0];
			q = temp[0];
			for (j = 0;j < 81;j++,p++,q++)
			{
				p[0] = q;
				q[0] = 0;
			}
			p = dish[0];
			q = temp[0];
		}
		for (i = 0;i < 81;i++)
		{
			if ((i + 1) % 9 == 0)
			{
				System.out.print((p + i));
				System.out.print("\n");
			}
			else
			{
				System.out.print((p + i));
				System.out.print(" ");
			}
		}
		return 0;
	}
}


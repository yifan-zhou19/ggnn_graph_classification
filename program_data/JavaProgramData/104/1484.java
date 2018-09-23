package <missing>;

public class GlobalMembers
{
	public static int a(int x,int i) //?x?????i??
	{
		if (i == 1)
		{
			return x;
		}
		else
		{
			return a(x, i - 1) / 2;
		}
	}
	public static int Main()
	{
		int x; //??x?y
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] xline = new int[100]; //??x?y???
		int[] yline = new int[100];
		int i = 1; //??x?y???
		do
		{
			xline[i] = a(x, i);
			i++;
		}while (a(x, i) != 0);
		int j = 1;
		do
		{
			yline[j] = a(y, j);
			j++;
		}while (a(y, j) != 0);
		for (j--, i--;yline[j] == xline[i] && j >= 1 && i >= 1;j--, i--)
		{
			; //??????????????
		}
		System.out.print(xline[++i]);
		return 0;
	}

}


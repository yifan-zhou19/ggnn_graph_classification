package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int where;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		where = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[max];
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p = num;
		for (int i = 0; i < n - where; i++)
		{
			p[n + i] = (p + i);
		}
		p = p + n - where;
		for (int i = 0; i < n;i++)
		{
		if (i == 0)
		{
			System.out.print((p + i));
		}
		else
		{
			System.out.print(" ");
			System.out.print((p + i));
		}
		}




	}



}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int d;
		int[] flag = new int[101];
		for (i = 0;i <= 100; i++)
		{
			flag[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int couted = 0;
		for (i = 0; i < n ; i++)
		{
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (flag[d] == 0)
			{
				if (couted == 0)
				{
					System.out.print(d);
					couted = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(d);
				}
				flag[d] = 1;
			}
		}


	return 0;
	}

}


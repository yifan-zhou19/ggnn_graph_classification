package <missing>;

public class GlobalMembers
{
	///********************************
	//*????????  **
	//*?????? 1300012745 **
	//*???2013.10.31  **
	//********************************
	public static int Main()
	{
		int[] a = new int[1000];
		int n = 1;
		int i;
		int x;
		int y;
		int k;
		int max;
		char ex;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = x; i < 1000; i++)
		{
			a[i] += 1;
		}
		while ((ex = System.in.read()) == ',')
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
			for (i = x;i < 1000;i++)
			{
				a[i]++;
			}
		}
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y;i <= 999;i++)
		{
			a[i]--;
		}
		for (k = 1;k <= n - 1;k++)
		{
			ex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = y;i <= 999;i++)
			{
				a[i]--;
			}
		}
		max = a[0];
		for (i = 1;i <= 999;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.in.read();
		System.in.read();
		return 0;
	}






}


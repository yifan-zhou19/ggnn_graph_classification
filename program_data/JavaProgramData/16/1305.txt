package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int n = 0;
		int i = 0;
		int j = n - 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 0)
		{
			System.out.print("0");
		}
		else if (a != 0)
		{
		while (a >= Math.pow(10,n))
		{
			n = n + 1;
		}
		int[] c = new int[10];
		for (i = 0;i <= n - 1;i++)
		{
		   c[i] = a % (int)(Math.pow(10,i + 1));
		}
		for (i = 0;i <= n - 1;i++)
		{
			c[i] = c[i] / Math.pow(10,i);
		}
		for (i = 0;i <= n - 1;i++)
		{
		   System.out.print(c[i]);
		}
		}
		return 0;
	}

}


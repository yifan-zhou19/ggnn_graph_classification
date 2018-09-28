package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int a2;
		int a3;
		int i;
		int j;
		int p;
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a1 = 1;
			a2 = 1;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p == 1 || p == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
			   for (j = 2;j < p;j++)
			   {
				   a3 = a1 + a2;
				   t = a3;
				   a1 = a2;
				   a2 = t;
			   }
			   System.out.print(a3);
			   System.out.print("\n");
			}
		}

		return 0;
	}

}


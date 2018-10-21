package <missing>;

public class GlobalMembers
{
	public static int tel(int n)
	{
		if (1 == n)
		{
		return 0;
		}
		else
		{
		  int i;
		for (i = 2;i < (int)Math.sqrt(n) + 1;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i != (int)Math.sqrt(n) + 1)
		{
		return 0;
		}
		else
		{
		return 1;
		}
		}
	}


	public static int Main()
	{
		int k = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 2;i < n + 1;i++)
		{
			if (tel(i) != 0)
			{
			 if (tel(i + 2) != 0 && i + 2 < n + 1)
			 {
					System.out.print(i);
					System.out.print(" ");
					System.out.print(i + 2);
					System.out.print("\n");
					k += 1;
			 }
			}
		}
		if (0 == k)
		{
		System.out.print("empty");
		System.out.print("\n");
		}
	   return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k != 1) //???1
		{
			if (k % 2 != 0)
			{
				System.out.print(k);
								System.out.print("*3+1=");
								System.out.print((k = 3 * k + 1));
								System.out.print("\n");
			}
			else
			{
				System.out.print(k);
								System.out.print("/2=");
								System.out.print((k /= 2));
								System.out.print("\n");
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}


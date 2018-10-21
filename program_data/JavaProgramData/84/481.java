package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] k = new int[100];
		int n = 0;
		int i = 0;
		int Max = 0;
		int Max2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			k[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] > Max)
			{
		Max = k[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] < Max && k[i]> Max2)
			{
		Max2 = k[i];
			}
		}
		System.out.print(Max);
		System.out.print("\n");
		System.out.print(Max2);
		System.out.print("\n");
		return 0;



	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int w;
		int sum;
		int yu;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 12;
		for (i = 0; i < 12; i++)
		{
			yu = 0;
			sum = sum + a[i];
			yu = sum % 7;
			if (w > 5)
			{
				if (w + yu == 12)
				{
					System.out.print(i + 1);
					System.out.print("\n");
				}
			}
			else
			{
				if (w + yu == 5)
				{
					System.out.print(i + 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}


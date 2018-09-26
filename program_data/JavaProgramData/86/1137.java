package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[60];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= k;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (k == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else if (a[k] + k * 3 <= 60)
			{
				System.out.print(60 - 3 * k);
				System.out.print("\n");
			}
			else
			{
				for (i = 1;i <= k;i++)
				{
					if ((a[i] + i * 3 <= 60) && (a[i + 1] + i * 3>60))
					{
					System.out.print(60 - i * 3);
					System.out.print("\n");
					break;
					}
					else if ((a[i] + (i - 1) * 3 <= 60) && (a[i] + i * 3>60))
					{
						System.out.print(a[i]);
						System.out.print("\n");
						break;
					}
				}
			}
			n--;

		}
		return 0;
	}
}


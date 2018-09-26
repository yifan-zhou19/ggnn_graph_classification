package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num-- != 0)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				int[] a = new int[20];
				int i;
				int sum = 60;
				int time = 60;
				for (i = 0;i < n;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 0;i < n;i++)
				{
					if (time - a[i] <= 3)
					{
						time = time - a[i];
						if (time > 0)
						{
							sum -= time;
						}
						break;
					}
					else
					{
						time -= 3;
						sum -= 3;
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int sum = 0;
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if ((i - 7) % 10 == 0)
			{
				sum = sum;
			}
			else
			{
				if (i % 7 == 0)
				{
					sum = sum;
				}
				else
				{
					if (i > 70)
					{
						if (i < 80)
						{
							sum = sum;
						}
						else
						{
							sum += i * i;
						}
					}
					else
					{
						sum += i * i;
					}
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}


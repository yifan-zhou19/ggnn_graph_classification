package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] apple = new int[n + 1];
	apple[1] = 0;
	apple[n] = k + n;
	while (true)
	{
		for (i = n;i >= 1;i--)
		{
			  if (apple[i] % (n - 1) == 0)
			  {
				  apple[i - 1] = (apple[i] * n / (n - 1)) + k;
			  }
				else
				{
					break;
				}

		}

	apple[n] = apple[n] + n;
	if (apple[1] != 0)
	{
		break;
	}
	}
	System.out.print(apple[1]);
	return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			int a = i % 10;
			int b = i - a;
			if (i % 7 == 0)
			{
				i++;
			}
			else
			{
				if (a == 7)
				{
					i++;
				}
					 else
					 {
					if (b == 70)
					{
						i++;
					}
							  else
							  {
								  sum = sum + i * i;
							  }
							 i++;
					 }
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}


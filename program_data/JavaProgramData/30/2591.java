package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int s;
		int j;
		int a;
		int f;
		int g;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
				a = 0;
				f = i;
				g = i;
		  for (j = 0;f != 0;f /= 10,j++)
		  {
			  ;
		  }
			for (k = 0;k < j;k++)
			{
					s = g % 10;
				if (s == 7)
				{
					a = 1;
				}
				else
				{
					a = a;
				}
				g = g / 10;
			}
			if (i % 7 == 0)
			{
				a = 1;
			}
			else
			{
				a = a;
			}
			if (a == 0)
			{
				sum = sum + i * i;
			}
			else
			{
				sum = sum;
			}
		}
			System.out.print(sum);
			System.out.print("\n");
	return 0;
	}
}


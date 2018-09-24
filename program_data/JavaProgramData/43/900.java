package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int bl;
		int g;
		int[] a = new int[2001];
		int[] b = new int[10001];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x < 6 || x % 2 == 1)
		{
			System.out.print("Error!");
		}
		else
		{
			g = 0;
			for (i = 3;i <= x;i++)
			{
				bl = 0;
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						bl = 1;
						break;
					}
				}
				if (bl == 0)
				{
					g++;
					a[g] = i;
					b[i] = 1;
				}
			}
		  for (i = 1;i <= g;i++)
		  {
			  if (a[i] * 2 <= x)
			  {
				  if (b[x - a[i]] == 1)
				  {
					  System.out.print(a[i]);
					  System.out.print(" ");
					  System.out.print(x - a[i]);
					  System.out.print("\n");
				  }
			  }
			  else
			  {
				  break;
			  }
		  }
		}
	}
}


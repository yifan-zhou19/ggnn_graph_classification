package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int root1;
		int root2;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i = i + 2)
		{
			for (a1 = 3;a1 <= i / 2;a1 = a1 + 2)
			{
				root1 = (int)Math.sqrt((double)a1);
				for (j = 2;j <= root1;j++)
				{
					if (a1 % j == 0)
					{
					break;
					}
				}
				if (j == root1 + 1)
				{
					  a2 = i - a1;
					  root2 = (int)Math.sqrt((double)a2);
					  for (j = 2;j <= root2;j++)
					  {
						  if (a2 % j == 0)
						  {
						  break;
						  }
					  }
					  if (j == root2 + 1)
					  {
							System.out.print(i);
							System.out.print("=");
							System.out.print(a1);
							System.out.print("+");
							System.out.print(a2);
							System.out.print("\n");
							break;
					  }
				}
			}
		}
		return 0;
	}

}


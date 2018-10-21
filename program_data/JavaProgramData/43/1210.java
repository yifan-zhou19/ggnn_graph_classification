package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int s;
		int l;
		int m;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = n / 2;
		for (i = 3;i <= s;i += 2)
		{
			  l = Math.sqrt(i);
			  for (k = 1;k <= l;k++)
			  {
				  if (i % k == 0 && k != 1)
				  {
				  break;
				  }
				  if (k == l)
				  {
						a = n - i;
						b = Math.sqrt(a);
						for (m = 1;m <= b;m++)
						{
							if (a % m == 0 && m != 1)
							{
							break;
							}
							if (m == b)
							{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(n - i);
							System.out.print("\n");
							}
						}
				  }
			  }
		}

		return 0;
	}


}


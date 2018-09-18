package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[110];
	public static int la;
	public static int[] b = new int[110];

	public static int Main()
	{
		while (true)
		{
			int f = System.in.read();
			if (f == -1)
			{
				break;
			}
			a[1] = f;
			for (int i = 2;i <= 109;i++)
			{
				a[i] = System.in.read();
				if (a[i] == 10)
				{
					la = i - 1;
					break;
				}
			}
			for (int i = 1;i <= la + 1;i++)
			{
				System.out.print(a[i]);
			}
			for (int i = 1;i <= la;i++)
			{
				if (a[i] == ')')
				{
					for (int j = i - 1;j >= 1;j--)
					{
						if (a[j] == ')')
						{
							break;
						}
						if (a[j] == '(')
						{
							a[i] = 0;
							a[j] = 0;
							break;
						}
					}
				}
			}
			for (int i = 1;i <= la;i++)
			{
				if (a[i] != '(' && a[i] != ')')
				{
					System.out.print(32);
				}
				if (a[i] == '(')
				{
					System.out.print('$');
				}
				if (a[i] == ')')
				{
					System.out.print('?');
				}
			}
			System.out.print(10);
		}
		return 0;
	}

}

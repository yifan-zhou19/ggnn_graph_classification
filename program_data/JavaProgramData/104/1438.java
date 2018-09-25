package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int p;
		int q;
		int[] m = new int[100];
		int[] n = new int[100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[0] = a,n[0] = b;
		if (a == 1 || b == 1)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
			for (i = 1;;i++)
			{
				m[i] = a / 2;
				a = a / 2; //?????????????????
				if (a == 1)
				{
					break; //??????1???
				}
			}
			for (j = 1;;j++)
			{
				n[j] = b / 2;
				b = b / 2;
				if (b == 1)
				{
					break;
				}
			}
			for (p = 0;p <= i;p++)
			{
				for (q = 0;q <= j;q++)
				{
					if (m[p] == n[q])
					{
						System.out.print(m[p]);
						System.out.print("\n");
						return 0;
					}; //?????????????
				}
			}
		}

	}
}


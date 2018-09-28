package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n ; i++)
		{
				int a;
				int p = 1;
				int q = 1;
				int o;
				int j;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 1; j <= a; j++) //??a?????
				{
					if (j == 1 || j == 2)
					{
						p = 1;
					}
					else
					{
						o = p;
						p = p + q; //?a?????
						q = o; //?a-1?????
					}
				}
				System.out.print(p);
				System.out.print("\n");
		}
		return 0;
	}
}


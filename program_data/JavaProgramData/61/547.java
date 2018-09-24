package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int p;
		int q;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}

			if ((a == 1) || (a == 2))
			{
				System.out.print("1\n");
			}

			else
			{
				p = 1;
				q = 1;
				for (i = 2;i < a;i++)
				{
					result = p + q;
					p = q;
					q = result;
				}
				System.out.printf("%d\n",result);
			}

		}
		return 0;
	}
}


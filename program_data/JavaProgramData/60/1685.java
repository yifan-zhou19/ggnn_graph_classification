package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n = 0;
		int l;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= l - 2;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					n = 1;
					break;
				}
				else
				{
					if ((i + 2) % j == 0)
					{
						n = 1;
						break;
					}
				}
			}
			if (n == 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				t = 1;
			}
			n = 0;


		}
		if (t == 0)
		{
			System.out.print("empty");
		}
	}
}


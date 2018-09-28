package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int z = 0;z < n;z++)
		{
				int m;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				if (m == 1 || m == 2)
				{
					System.out.print("1\n");
					break;
				}
				int a = 1;
				int b = 1;
				int d;
				int c;
				for (int i = 2;i < m;i++)
				{
						c = a + b;
						d = b;
						b = c;
						a = d;
				}
				System.out.printf("%d\n",b);
		}
	}
}


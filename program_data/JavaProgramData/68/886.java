package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 6;i <= n;i = i + 2)
		{
			int j = 3;
			int k = 3;
			int t = 0;
			int l = 0;
			int p = 0;
			while (true)
			{
			   p = 0;
			   t = 0;
			   l = 0;
				for (k = 3;k <= Math.sqrt(j);k++)
				{
				if (j % k == 0)
				{
					t = 1;
				}
				}
			//if(t==0)
		//	{
				for (k = 3;k <= Math.sqrt(i - j);k++)
				{
					if ((i - j) % k == 0)
					{
						l = 1;
					}
				}
		//	}
			if (t == 0 && l == 0)
			{
				System.out.print(i);
				System.out.print("=");
				System.out.print(j);
				System.out.print("+");
				System.out.print(i - j);
				System.out.print("\n");
				break;
				p = 1;
			}
			j = j + 2;
			}
		//	while(p==0);
		}
		return 0;
	}
}


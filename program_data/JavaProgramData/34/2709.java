package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			for (ans = n;ans != 1;)
			{
				if (ans % 2 != 0)
				{
					System.out.printf("%d*3+1=%d\n\n",ans,ans * 3 + 1);
					ans = ans * 3 + 1;
				}
				else
				{
					System.out.printf("%d/2=%d\n\n",ans,ans / 2);
					ans = ans / 2;
				}
			}
			System.out.print("End");
		}
	}

}


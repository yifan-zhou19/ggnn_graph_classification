package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			for (s = s;s != 1;i++)
			{
				if (n % 2 == 0)
				{
					s = s / 2;
					System.out.printf("%d/2=%d\n",n,s);
					n = s;
				}
				else
				{
					s = s * 3 + 1;
					System.out.printf("%d*3+1=%d\n",n,s);
					n = s;
				}
			}
			System.out.print("End");
		}
		return 0;
	}


}


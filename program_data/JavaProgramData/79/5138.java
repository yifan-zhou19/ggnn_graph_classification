package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int s = 0;
		int count;
		for (count = 0;;count++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			if (m == 1)
			{
				s = n - 1;
			}
			if (n == 1)
			{
				s = 0;
			}
			if (n > 1)
			{
				for (i = 2;i <= n;i++)
				{
					s = (s + m) % i;
				}
			}
			System.out.printf("%d\n",s + 1);
			s = 0;
		}
	}

}


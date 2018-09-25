package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i = 0;
		int k1 = 0;
		int k2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			i++;
			if (m > k1)
			{
				k2 = k1,k1 = m;
			}
			else if (m < k1 && m> k2)
			{
				k2 = m;
			}

		}while (i < n);

		System.out.printf("%d\n%d",k1,k2);

		return 0;
	}
}


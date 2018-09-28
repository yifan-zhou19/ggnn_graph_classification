package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{

			for (j = 3;j < i;j = j + 2)

			{
			for (k = 2;k <= Math.sqrt(j);k++)
			{
				if (j % k == 0)
				{
					break;
				}
			}
					if (k > Math.sqrt(j))
					{
						m = i - j;
					}
					for (k = 2;k <= Math.sqrt(m);k++)
					{
						if (m % k == 0)
						{
							break;
						}
					}
					if (k > Math.sqrt(m) && j <= m != 0 && m>1)

					{
						System.out.printf("%d=%d+%d\n",i,j,m);
					break;
					}
			}
		}




	}
}


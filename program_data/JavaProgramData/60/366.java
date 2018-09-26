package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a = 3;
		int jm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (j = 3;j <= n;j = j + 2)
			{
				jm = 1;
				for (i = 3;i * i <= j;i = i + 2)
				{
					if (j % i == 0)
					{
						jm = 0;
						break;
					}
				}
				if (jm == 1)
				{
					if (j - a == 2)
					{
						System.out.printf("%d %d\n",a,j);
					}
					a = j;
				}
			}
		}
	}
}


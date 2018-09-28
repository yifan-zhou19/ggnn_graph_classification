package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[400];
		int m;
		int n;
		int i;
		int out;
		int sum;

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			out = m;
			sum = n;
			for (i = 1;i <= n;i++)
			{
				a[i] = 1;
			}
			for (i = 1;sum > 1;)
			{

				if (a[i] == 0)
				{
					i++;
					if (i > n)
					{
						i = 1;
					}
					continue;
				}
				else
				{
					out--;
				}
				if (out == 0)
				{
					a[i] = 0;
					sum--;
					out = m;
				}
				i++;
				if (i > n)
				{
					i = 1;
				}
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] == 1)
				{
					break;
				}
			}
			System.out.printf("%d\n",i);
		}
	}

}


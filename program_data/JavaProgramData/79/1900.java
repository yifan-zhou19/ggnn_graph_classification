package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count;
		int out;
		int n;
		int m;

		count = 0;
		out = 0;

		while (true)
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
			int[] num = new int[n + 1];
			if (m == 0 && n == 0)
			{
			break;
			}
			for (i = 1;i <= n;i++)
			{
		  num[i] = 0;
			}
		i = 1;
		do
		{

			if (num[i] == 0)
			{
				count++;
			}
			if (count == m)
			{
				num[i] = 1;
				out++;
				count = 0;
			}
			if (i == n)
			{
				i = 0;
			}
			i++;
		} while (out < n - 1);
		for (i = 1;i <= n;i++)
		{
		if (num[i] == 0)
		{
		System.out.printf("%d\n",i);
		count = 0;
		out = 0;
		}
		}
		}
		return 0;
	}
}


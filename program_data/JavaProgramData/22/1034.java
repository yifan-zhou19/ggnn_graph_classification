package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int n;
		int max;
		int second = -1;
		char c;
		for (i = 1;i <= 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
		n = i;
		max = a[1];
		for (i = 2;i <= n;i++)
		{
			if (max < a[i])
			{
				second = max;
				max = a[i];
			}
			else if (second < a[i] && a[i] < max)
			{
				second = a[i];
			}
		}
		if (n == 1 || second == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",second);
		}
		return 0;
	}


}


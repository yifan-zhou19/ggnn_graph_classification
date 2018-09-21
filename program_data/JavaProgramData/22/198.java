package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int l = 0;
		int num = 0;
		int max = 0;
		int sma = 0;
		int flag = 0;
		int i;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (num == 0)
			{
				a[l] = c - '0';
				num = 1;
			}
			else if (c == ',' || c == '\n')
			{
				num = 0;
				l++;
			}
			else
			{
				a[l] = a[l] * 10 + c - '0';
			}
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a[i] > sma && a[i] != max)
			{
				sma = a[i];
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",sma);
		}
		return 0;
	}
}


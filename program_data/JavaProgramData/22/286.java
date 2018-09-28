package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		char c;
		char d;
		int n;
		int i;
		int j;
		int flag = -1;
		int big = 0;
		int second = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c != ',')
			{
				break;
			}
		}
		n = i;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > big)
			{
				big = a[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] == big)
			{
				a[i] = -1;
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] > flag)
			{
				flag = a[i];
			}
		}
		if (flag != -1)
		{
			System.out.printf("%d",flag);
		}
		else
		{
			System.out.print("No");
		}
	}

}


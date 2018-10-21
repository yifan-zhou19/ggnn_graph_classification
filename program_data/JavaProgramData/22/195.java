package <missing>;

public class GlobalMembers
{
	public static int[] rec = new int[1000];
	public static int n;
	public static int i;
	public static int res;
	public static int max;
	public static char ch;
	public static int Main()
	{
		n = 1;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				ch = tempVar.charAt(0);
			}
			if (ch == ',')
			{
				n++;
				continue;
			}
			if (ch == '\n')
			{
				break;
			}
			rec[n] = rec[n] * 10 + ch - '0';
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (rec[i] > max)
			{
				max = rec[i];
			}
		}
		res = 0;
		for (i = 1;i <= n;i++)
		{
			if ((rec[i] > res) && (rec[i] < max))
			{
				res = rec[i];
			}
		}
		if ((res == 0) || (res == max))
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d\n",res);
		}
	}
}


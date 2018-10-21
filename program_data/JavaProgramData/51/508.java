package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int n;
	public static int len;
	public static int[] sum = new int[600];
	public static int big;
	public static String s = new String(new char[600]);
	public static String ts = new String(new char[7]);
	public static String p1;
	public static String p2;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		big = -1;
		for (i = 0;i + n - 1 < len;i++)
		{
			if (sum[i] < 0)
			{
				continue;
			}
			sum[i] = 0;
			p1 = s.charAt(i);
			for (j = i + 1;j + n - 1 < len;j++)
			{
				p2 = s.charAt(j);
				if (strncmp(p1,p2,n) == 0)
				{
					sum[i]++;
					sum[j] = -1;
				}
			}
			if (sum[i] > big)
			{
				big = sum[i];
			}
		}
		if (big == 0)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n", big + 1);
		for (i = 0;i + n - 1 < len;i++)
		{
			if (sum[i] == big)
			{
				p1 = s.charAt(i);
				ts = p1.substring(0, n);
				System.out.printf("%s\n", ts);
			}
		}

		return 0;

	}

}


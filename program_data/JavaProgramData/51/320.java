package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String str = new String(new char[501]);
		str = new Scanner(System.in).nextLine();
		int len;
		int[] q = new int[501];
		for (len = 0;str.charAt(len) != 0;len++)
		{
			;
		}
		int i;
		int j;
		int u;
		int v;
		int V;
		int max = 0;
		for (i = 0;i <= len - n;i++)
		{
			q[i] = 1;
			for (u = i + 1;u <= len - n;u++)
			{
				V = 1;
				for (v = 0;v < n;v++)
				{
					if (str.charAt(i + v) != str.charAt(u + v))
					{
						V = 0;
						break;
					}
				}
				if (V == 1)
				{
					q[i] = q[i] + 1;
					if (q[i] > max)
					{
						max = q[i];
					}
				}
			}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < len - n;i++)
		{
			if (q[i] == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",str.charAt(i + j));
				}
				System.out.print('\n');
			}
		}
		return 0;
	}
}


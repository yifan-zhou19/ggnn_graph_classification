package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[100000];
	public static int[] y = new int[100000];
	public static int[] z = new int[100000];
	public static int[] s = new int[100000];
	public static int[] b = new int[100000];
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int t;
		int m1;
		int m2;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
			s[i] = y[i] + z[i];
			b[i] = s[i];
		}
		for (i = 1;i < 4;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (s[i] < s[j])
				{
					t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (s[1] == b[i])
			{
				m1 = i;
				System.out.printf("%d %d\n",x[i],b[i]);
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (s[2] == b[i] && i != m1)
			{
				m2 = i;
				System.out.printf("%d %d\n",x[i],b[i]);
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (s[3] == b[i] && i != m1 && i != m2)
			{
				System.out.printf("%d %d\n",x[i],b[i]);
				break;
			}
		}
	}


}


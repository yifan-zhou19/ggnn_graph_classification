package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[100];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] >= m[i - 1])
			{
			m[i] = m[i],m[i - 1] = m[i - 1];
			}
			else if (m[i] >= m[i - 2])
			{
			t = m[i],m[i] = m[i - 1],m[i - 1] = t;
			}
			else
			{
				m[i] = m[i - 1],m[i - 1] = m[i - 2];
			}
		}
		System.out.printf("%d\n%d\n",m[n],m[n - 1]);
		return 0;
	}
}


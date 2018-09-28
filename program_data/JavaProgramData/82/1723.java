package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int k;
		int j;
		int i;
		int[] m = new int[100];
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
			{
				j = j + 1;
				m[k - 1] = j;
			}
			if (a < 90 || a>140 || b < 60 || b>90)
			{
				m[k - 1] = 0;
				j = 0;
			}

		}
		for (i = 1;i <= n;i = i++)
		{
			if (m[0] < m[i - 1])
			{
				m[0] = m[i - 1];
			}
			if (m[0] >= m[i - 1])
			{
				m[0] = m[0];
			}
		}
		System.out.printf("%d",m[0]);
		return 0;
	}
}


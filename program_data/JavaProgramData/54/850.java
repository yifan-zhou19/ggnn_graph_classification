package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] m = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (j = 1;;j++)
		{
			m[n] = j;
			for (i = n;i >= 2;i--)
			{
				if ((n * m[i] + k) % (n - 1) == 0)
				{
					m[i - 1] = (n * m[i] + k) / (n - 1);
				}
				else
				{
					break;
				}
			}
			if (i == 1)
			{
				break;
			}
		}
		m[0] = n * m[1] + k;
		System.out.printf("%d",m[0]);
	}
}


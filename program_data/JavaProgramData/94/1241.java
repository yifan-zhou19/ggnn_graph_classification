package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int t;
		int k = 0;
		int[] sr = new int[501];
		int[] px = new int[501];
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
			sr[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;i <= n;i++)
		{
			if (sr[i] % 2 == 1)
			{
			k++;
			px[i] = sr[i];
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 1;i < n;i++)
			{
				if (px[i] < px[i + 1])
				{
				t = px[i];
				px[i] = px[i + 1];
				px[i + 1] = t;
				}
			}
		}
		for (i = k;i >= 1;i--)
		{
		System.out.printf("%d",px[i]);
		if (i == 1)
		{
		break;
		}
		System.out.print(",");
		}




	return 0;
	}

}


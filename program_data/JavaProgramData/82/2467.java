package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int t;
		int[] s = new int[100];
		int[] e = new int[100];
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			if (a <= 140 && a >= 90 && b >= 60 && b <= 90)
			{
				s[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] == 0)
			{
				k++;
			}
			if (s[i] == 1)
			{
			   e[k]++;
			}

		}
		for (i = 1;i <= k;i++)
		{
				if (e[i] > e[0])
				{
				  e[0] = e[i];
				}
		}
		System.out.printf("%d",e[0]);
		return 0;
	}
}


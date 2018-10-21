package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int[] s = new int[100];
		int k = 0;
		int j;
		int t;
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
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				s[k]++;
			}
			else
			{
				k++;
			}
		}
		for (i = 1;i < k + 1;i++)
		{
			for (j = 0;j < k + 1 - i;j++)
			{
				if (s[j] > s[j + 1])
				{
					t = s[j + 1];
					s[j + 1] = s[j];
					s[j] = t;
				}
			}
		}
		System.out.printf("%d\n",s[k]);
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] s = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		k = 0;
		for (i = 2;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				s[k] = i;
				k++;
			}
	//		{printf("%d",i);}
		}

		for (i = 0;i < k - 1;i++)
		{
			if ((s[i + 1] - s[i]) == 2)
			{
				System.out.printf("%d %d\n",s[i],s[i + 1]);
				j = 0;
			}
		}
		if (j != 0)
		{
			System.out.print("empty");
		}
	}
}


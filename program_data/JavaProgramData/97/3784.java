package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int SUM;
		int a;
		int i;
		int j = 0;
		int[] ht = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			SUM = Integer.parseInt(tempVar);
		}
		a = SUM;
		for (i = 100;i > 0;i--)
		{
			if (i == 100 || i == 50 || i == 20 || i == 10 || i == 5 || i == 1)
			{
			   ht[j] = a / i;
			   a = a % i;
			   j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",ht[i]);
		}
		return 0;
	}

}


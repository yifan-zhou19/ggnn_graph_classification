package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[30000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 30000;i++)
		{
			a[i] = 0;
		}
		int count1 = 0;
		for (i = 3;i <= n;i++)
		{
			int count2 = 0;
			for (int j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					count2++;
				}
			}
			if (count2 == 0)
			{
				a[i] = i;
			}
			if (a[i] - a[i - 2] == 2)
			{
			   System.out.printf("%d %d\n",i - 2,i);
			   count1++;
			}
		}
		if (count1 == 0)
		{
			System.out.print("empty");
		}
	}

}


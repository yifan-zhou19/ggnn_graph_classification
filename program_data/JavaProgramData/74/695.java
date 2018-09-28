package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int m;
		int n;
		int t = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
			   if (i % j == 0)
			   {
				  a[i] = 1;
				  break;
			   }
			}
		}

		for (i = m;i <= n;i++)
		{
			if (a[i] == 0)
			{
			int[] s = new int[10];
			int k = 0;
			int tmp = 0;
			int f = 0;
			tmp = i;
			while (tmp > 0)
			{
			   s[k] = tmp % 10;
			   k++;
			   tmp = tmp / 10;
			}

			for (j = 0;j < k / 2 + 1;j++)
			{
			   if (s[j] != s[k - 1 - j])
			   {
				 f = 1;
				 break;
			   }
			}
			if (f == 0 && t != 0)
			{
				 System.out.printf(",%d",i);
				 t = 1;
			}
			if (f == 0 && t == 0)
			{
			   System.out.printf("%d",i);
			   t = 1;
			}
			}

		}
		if (t == 0)
		{
		System.out.print("no");
		}

		return 0;
	}
}


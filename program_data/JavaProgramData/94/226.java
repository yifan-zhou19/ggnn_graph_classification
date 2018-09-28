package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[1000];
		int[] s = new int[1000];
		int n;
		int k = 0;
		int i;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 if (a[i] % 2 != 0)
			 {
				 s[k] = a[i];
				 k++;
			 }
		 }
		for (int m = 1;m <= k;m++)
		{
			for (int i = 0;i < k - m;i++)
			{
				if (s[i] > s[i + 1])
				{
					int t = s[i + 1];
					s[i + 1] = s[i];
					s[i] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",s[i]);
			}
			else
			{
				System.out.printf(",%d",s[i]);
			}
		}
	}

}


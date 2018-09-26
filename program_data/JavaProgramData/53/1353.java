package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[300];
		int[] b = new int[300];
		int i;
		int n;
		int j;
		int m;
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0,m = 0;j < i;j++)
			{
			   if (s[i] == s[j])
			   {
				  m++;
			   }
			}
			if (m == 0)
			{
			   b[k] = s[i];
			   k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}

}


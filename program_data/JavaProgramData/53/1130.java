package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int j = 1;
		int[] s = new int[300];
		int[] x = new int[300];
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
				(s[i]) = Integer.parseInt(tempVar2);
			}
		}
		x[0] = s[0];

		for (i = 1;i < n;i++)
		{
			m = 0;
		 for (int k = 0;k < i;k++)
		 {
			 if (s[i] != s[k])
			 {
				 m++;
			 }
		 }
			if (m == i)
			{
				x[j] = s[i];
				j++;
			}
		}
		System.out.printf("%d",x[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",x[i]);
		}
		return 0;
	}

}


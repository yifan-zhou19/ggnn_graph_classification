package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int t;
		int[] tt = new int[500];
		int[] pp = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0,i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tt[i] = Integer.parseInt(tempVar2);
			}
			if ((tt[i] % 2) != 0)
			{
				pp[j] = tt[i];
				j++;
			}
		}
		m = j;
		k = m;
		for (i = 0;i < m - 1;m--)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (pp[j] > pp[j + 1])
				{
					t = pp[j];
					pp[j] = pp[j + 1];
					pp[j + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
		   if (i == 0)
		   {
			   System.out.printf("%d",pp[i]);
		   }
		   else
		   {
			   System.out.printf(",%d",pp[i]);
		   }
		}
		System.out.print("\n");
	}
}


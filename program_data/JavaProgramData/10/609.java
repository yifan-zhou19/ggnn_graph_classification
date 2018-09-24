package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int k;
			 int i;
			 int j;
			 int max;
			 int[] h = new int[25];
			 int[] t = new int[25];
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 k = Integer.parseInt(tempVar);
			 }
			 for (i = 0;i < k;i++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 h[i] = Integer.parseInt(tempVar2);
				 }
			 }
		for (i = 0;i < k;i++)
		{
			t[i] = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j < k;j++)
			{
				if (h[i] >= h[j] != 0 && t[i] <= t[j])
				{
					t[i] = t[j] + 1;
				}
			}
		}
		for (max = 0,i = 0;i < k;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d",max);
	}





}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int r = 0;
		int[] l = new int[100];
		int[][] s = new int[3][100];
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
				s[0][i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[1][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((s[0][i] <= 140) && (s[0][i] >= 90) && (s[1][i] <= 90) && (s[1][i] >= 60))
			{
				s[2][i] = 1;
			}
			else
			{
				s[2][i] = 0;
			}
		}
	   for (i = 0;i < n - 1;i++)
	   {
		   if (s[2][i] == 1)
		   {
			   r++;
		   }
		   if (s[2][i] == 0)
		   {
				   l[j] = r;
				   j++;
				   r = 0;
		   }
	   }
		   if (i == n - 1)
		   {
			   if (s[2][i] == 1)
			   {
			   r++;
				l[j] = r;
			   }
		   if (s[2][i] == 0)
		   {
				   l[j] = r;
		   }

		   }
	   int max = 0;
	   for (i = 0;i <= j;i++)
	   {
		   if (max < l[i])
		   {
			   max = l[i];
		   }
	   }
	   System.out.printf("%d",max);
	   return 0;
	}
}


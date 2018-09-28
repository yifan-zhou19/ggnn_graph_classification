package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int len;
		int[] max = new int[501];
		int da;
		String s = new String(new char[501]);
		char[][] a = new char[501][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 s = new Scanner(System.in).nextLine();
		  for (i = 0;i < 501;i++)
		  {
		 max[i] = 1;
		  }
		 len = s.length();
		 j = 0;
		 k = 0;
		while (j <= len - n)
		{
			i = 0;
		   while (i < n)
		   {
			  a[j][i] = s.charAt(k);
			  k++;
			  i++;
		   }
		   j++;
		   k = j;
		}
		  for (i = 1;i <= len - n;i++)
		  {
		  if (strcmp(a[0],a[i]) == 0)
		  {
		  max[0]++;
		  }
		  }
		  for (l = 1;l <= len - n;l++)
		  {
			 for (i = l + 1;i <= len - n;i++)
			 {
		  if (strcmp(a[l],a[i]) == 0)
		  {
		  max[l]++;
		  }
			 }
		  }
			da = max[0];
			for (j = 1;j <= len - n;j++)
			{
			if (max[j] > da)
			{
			  da = max[j];
			}
			}
				if (da <= 1)
				{
					System.out.print("NO");
				}
				else
				{
					System.out.printf("%d\n",da);
			for (j = 0;j <= len - n + 1;j++)
			{
				if (max[j] == da)
				{
			 System.out.println(a[j]);
				}
			}
				}
	}
}


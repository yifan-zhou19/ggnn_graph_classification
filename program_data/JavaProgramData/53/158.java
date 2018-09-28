package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] ch1 = new int[350];
		int i;
		int j;
		int k;
		int l;
		int r;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (r = 0;r <= n - 2;r++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ch1[r] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ch1[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			   for (j = i + 1;j <= n - 1;j++) //?????????????????????
			   {
				  if (ch1[j] == ch1[i])
				  {
					  for (k = j + 1;k <= n - 1;k++)
					  {
						  ch1[k - 1] = ch1[k];
					  }
					  n = n - 1;
					  j--; //???????????
				  }
			   }
		}
		System.out.printf("%d",ch1[0]);
	  for (l = 1;l <= n - 1;l++)
	  {
		  System.out.printf(",%d",ch1[l]);
	  }
	  System.out.print("\n");
	}

}


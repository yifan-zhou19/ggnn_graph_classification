package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int i;
			  int n;
			  int[] s = new int[200];
			  int j = 0;
			  int k = 0;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  for (i = 0;i < 2 * n;i += 2)
			  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   s[i + 1] = Integer.parseInt(tempVar3);
			   }
			  }
			  for (i = 0;i < 2 * n;i += 2)
			  {
			if (s[i] >= 90 && s[i] <= 140 && s[i + 1] >= 60 && s[i + 1] <= 90)
			{
					  j++;
			}
					  else
					  {
					  j = 0;
					  }
					  if (k <= j)
					  {
					  k = j;
					  }
			  }
			 System.out.printf("%d",k);

		return 0;
	}


}


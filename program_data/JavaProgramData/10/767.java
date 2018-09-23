package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] high = new int[26]; //????i?????????????  ????
	 int n;
	 int[] maxnum = new int[26];
	 int[] temp = new int[26];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 int j;
	 int k;
	 for (i = 0;i < n;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 high[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 maxnum[n - 1] = 1;
	 for (i = n - 2;i >= 0;i--)
	 {
	  int len = 0;
	  for (j = i + 1;j < n;j++)
	  {
		if (high[i] >= high[j])
		{
			 temp[len++] = 1 + maxnum[j];
		}

	  }
	   int mark1 = 1;
	  for (k = 0;k < len;k++)
	  {
		  if (temp[k] >= mark1)
		  {
			  mark1 = temp[k];
		  }
	  }
	  maxnum[i] = mark1;
	 }
	 int mark2 = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (maxnum[i] >= mark2)
		 {
			 mark2 = maxnum[i];
		 }
	 }
	 System.out.printf("%d",mark2);
	 return 0;
	}
}


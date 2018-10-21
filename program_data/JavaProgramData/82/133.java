package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int[] shou = new int[100];
		int[] shu = new int[100];
		int[] total = new int[100];
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
			 shou[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 shu[i] = Integer.parseInt(tempVar3);
		 }
	  }
	  for (j = 0;j < n;j++)
	  {
		 if (shou[j] >= 90 && shou[j] <= 140 && shu[j] >= 60 && shu[j] <= 90)
		 {
			 total[k]++;
		 }
		 else
		 {
			 k++;
		 }
	  }
	  int max = 0;
	  for (l = 0;l < k + 1;l++)
	  {
		  if (total[l] > max)
		  {
			max = total[l];
		  }
	  }
	  System.out.printf("%d",max);
	  return 0;
	}
}


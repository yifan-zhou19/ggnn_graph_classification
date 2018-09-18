package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] jud = new int[200];
	  int[] num = new int[30000];
	  int n;
	  int i;
	  int j;
	  int sum;
	  int[] res = new int[200];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  sum = 0;
	  for (i = 1;i <= 100;i++)
	  {
	   jud[i] = 0;
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		if (jud[num[i]] == 0)
		{
		   sum++;
		   res[sum] = num[i];
		   jud[num[i]] = 1;
		}
	  }
	  for (i = 1;i < sum;i++)
	  {
	   System.out.printf("%d ",res[i]);
	  }
	  System.out.printf("%d",res[sum]);
	  return 0;
	}

}


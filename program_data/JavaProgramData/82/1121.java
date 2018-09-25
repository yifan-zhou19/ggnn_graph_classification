package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int sum;
	  int temp;
	  int m;
	  sum = 0;
	  temp = 0;
	  int[] a = new int[200];
	  int[] b = new int[200];
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
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		{
		 m = 1;
		}
		else
		{
		 m = 0;
		}
		if (m == 0)
		{
		  if (temp > sum)
		  {
		   sum = temp;
		  }
		   temp = 0;
		}
	  else
	  {
	   temp++;
	  }
	  }
		if (temp > sum)
		{
		 sum = temp;
		}
	   System.out.printf("%d",sum);
	  return 0;
	}

}


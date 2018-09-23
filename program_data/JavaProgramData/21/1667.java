package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int s;
	  int k;
	  int n;
	  int max;
	  int min;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  min = 32767;
	  max = 0;
	  s = 0;
	  for (k = 1;k <= n;k++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  i = Integer.parseInt(tempVar2);
		  }
		  if (max < i)
		  {
			  max = i;
		  }
		  if (min > i)
		  {
			  min = i;
		  }
		  s += i;
	  }
	  if ((max * n - s) > (s - min * n))
	  {
		  System.out.printf("%ld\n",max);
	  }
	  else if ((max * n - s) < (s - min * n))
	  {
		  System.out.printf("%ld\n",min);
	  }
	  else
	  {
		  System.out.printf("%ld,%ld",min,max);
	  }
	}
}


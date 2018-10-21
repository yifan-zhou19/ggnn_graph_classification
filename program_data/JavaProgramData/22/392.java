package <missing>;

public class GlobalMembers
{
	public static int[] n = new int[300];
	public static int Main()
	{
		  int ctr;
		  int i = 1;
		  int max = 0;
		  int temp;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while ((System.in.read()) == ',')
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n[i] = Integer.parseInt(tempVar2);
		  }
		  i++;
		  }
		  for (ctr = 0;ctr < i;ctr++)
		  {
		  if (n[ctr] > max)
		  {
		  max = n[ctr];
		  }
		  }
		  temp = max;
		  max = 0;
		  for (ctr = 0;ctr < i;ctr++)
		  {
		  if (n[ctr] == temp)
		  {
		  n[ctr] = 0;
		  }
		  }
		  for (ctr = 0;ctr < i;ctr++)
		  {
		  if (n[ctr] > max)
		  {
		  max = n[ctr];
		  }
		  }
		  if (max == 0)
		  {
		  System.out.print("No");
		  }
		  else
		  {
		  System.out.printf("%d",max);
		  }
		  return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  int s = 0;
		  int t = 0;
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  if (a[i] - b[i] == 1 || b[i] - a[i] == 2)
		  {
		  t++;
		  }
		  else if (a[i] == b[i])
		  {
			  s++;
			  t++;
		  }
		  else
		  {
		  s++;
		  }
		  }
		  if (s > t)
		  {
		  System.out.print("A\n");
		  }
		  else if (s == t)
		  {
		  System.out.print("Tie\n");
		  }
		  else
		  {
		  System.out.print("B\n");
		  }


	}
}


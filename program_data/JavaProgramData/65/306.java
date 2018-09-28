package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int n;
		  int s = 0;
		  int t = 0;
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
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b[i] = Integer.parseInt(tempVar3);
						  }
						  if (a[i] == 0 && b[i] == 1)
						  {
							  s++;
						  }
						  else if (a[i] == 0 && b[i] == 2)
						  {
							  t++;
						  }
						  else if (a[i] == 1 && b[i] == 0)
						  {
							  t++;
						  }
						  else if (a[i] == b[i])
						  {
							   s = s + 0;
							   t = t + 0;
						  }
						  else if (a[i] == 1 && b[i] == 2)
						  {
							  s++;
						  }
						  else if (a[i] == 2 && b[i] == 0)
						  {
							  s++;
						  }
						  else if (a[i] == 2 && b[i] == 1)
						  {
							  t++;
						  }

		  }
		  if (s > t)
		  {
			  System.out.print("A");
		  }
		  else if (s < t)
		  {
			  System.out.print("B");
		  }
		  else
		  {
			  System.out.print("Tie");
		  }
	}

}


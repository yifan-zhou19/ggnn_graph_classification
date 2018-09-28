package <missing>;

public class GlobalMembers
{
	public static int cai(int a,int b)
	{
		if (a == b)
		{
		return 2;
		}
		if (a == 0 && b == 1)
		{
		return 1;
		}
		if (a == 0 && b == 2)
		{
		return 0;
		}
		if (a == 1 && b == 0)
		{
		return 0;
		}
		if (a == 1 && b == 2)
		{
		return 1;
		}
		if (a == 2 && b == 0)
		{
		return 1;
		}
		if (a == 2 && b == 1)
		{
		return 0;
		}
	}
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[200];
		  int[] b = new int[200];
		  int i;
		  int j;
		  int k;
		  j = 0;
		  k = 0;
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
						  if (cai(a[i], b[i]) == 1)
						  {
						  j++;
						  }
						  if (cai(a[i], b[i]) == 0)
						  {
						  k++;
						  }
		  }
		  if (j == k)
		  {
		  System.out.print("Tie");
		  }
		  else if (j > k)
		  {
		  System.out.print("A");
		  }
		  else
		  {
		  System.out.print("B");
		  }
	}

}


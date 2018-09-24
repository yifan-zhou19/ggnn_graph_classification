package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
	   int[] a = new int[100];
	   int s = 0;
	   int l = 0;
	   int t = 0;
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
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  if (m == k)
	  {
		  a[i] = 2;
	  }
	  if ((m == 0 && k == 1) || (m == 1 && k == 2) || (m == 2 && k == 0))
	  {
		  a[i] = 1;
	  }
	  if ((k == 0 && m == 1) || (k == 1 && m == 2) || (k == 2 && m == 0))
	  {
		  a[i] = 0;
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (a[i] == 1)
		  {
			  s = s + 1;
		  }
		  if (a[i] == 0)
		  {
			  l = l + 1;
		  }
		  if (a[i] == 2)
		  {
			  t = t + 1;
		  }
	  }
	  if (s == l || t == n)
	  {
		  System.out.print("Tie");
	  }
	  if (s > l)
	  {
		  System.out.print("A");
	  }
	  if (s < l)
	  {
		  System.out.print("B");
	  }
	   return 0;
	}
}


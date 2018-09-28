package <missing>;

public class GlobalMembers
{
	public static int f(int n, int m)
	{
	  if (n == 1)
	  {
		return 1;
	  }
	  else
	  {
		  return (f(n - 1, m) + m - 1) % n + 1;
	  }
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[20000];
		int c = 0;
	  for (i = 1;i < 20000;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  if (n != 0 && m != 0)
		  {
			   a[i] = f(n, m);
			   c++;
		  }
		  else
		  {
			  break;
		  }
	  }
	  for (i = 1;i <= c;i++)
	  {
		  System.out.printf("%d\n",a[i]);
	  }
	  return 0;
	}

}


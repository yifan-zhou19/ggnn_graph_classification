package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[102];
		  int[] b = new int[102];
		  int n;
		  int i;
		  int t;
		  String s = new String(new char[102]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  n = s.length();
		  for (i = 0;i <= n - 1;i++)
		  {
		  a[i] = s.charAt(i) - '0';
		  }
		  t = 0;
		  for (i = 0;i <= n - 1;i++)
		  {
			  b[i] = (10 * t + a[i]) / 13;
			  t = (10 * t + a[i]) % 13;
		  }
		  if (b[0] == 0 && b[1] == 0 && b[2] == 0)
		  {
			  if (n == 1)
			  {
			  System.out.printf("0\n%d",a[0]);
			  }
			  else
			  {
			  System.out.printf("0\n%d",10 * a[0] + a[1]);
			  }
		  }
		  else
		  {
		  if (b[1] == 0)
		  {
			  for (i = 2;i <= n - 1;i++)
			  {
			  System.out.printf("%d",b[i]);
			  }
		  }
		  else
		  {
			  for (i = 1;i <= n - 1;i++)
			  {
			  System.out.printf("%d",b[i]);
			  }
		  }
		  System.out.printf("\n%d",t);
		  }
	}


}


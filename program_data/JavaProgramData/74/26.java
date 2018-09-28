package <missing>;

public class GlobalMembers
{
	//var
	public static int a;
	public static int b;
	public static int k;
	public static int l;

	//implementation
	public static int prime(int n)
	{
	  int i;
	  int j;
	  j = 0;
	  for (i = 2;i * i <= n;i++)
	  {
		  if (n % i == 0)
		  {
			  j = 1;
			  break;
		  }
	  }
	  return (1 - j);
	}
	public static int huiw(int n)
	{
	  int i;
	  int j;
	  i = n;
	  j = 0;
	  while (i != 0)
	  {
		  j = j * 10 + i % 10;
		  i = i / 10;
	  }
	  return (j == n);
	}

	public static void Main()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  l = 0;
	  for (k = a;k <= b;k++)
	  {
		  if (prime(k) != 0 && huiw(k) != 0)
		  {
		  if (l > 0)
		  {
			  System.out.print(",");
		  }
		  l++;
		  System.out.printf("%d",k);
		  }
	  }
	  if (l == 0)
	  {
		  System.out.print("no");
	  }
	}
}


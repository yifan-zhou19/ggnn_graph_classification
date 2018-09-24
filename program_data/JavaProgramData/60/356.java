package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i = 1;
	 if (n == 2)
	 {
	 return (1);
	 }
	 else if (n == 1 || (n % 2 == 0))
	 {
	 return (0);
	 }
	 else
	 {
	 for (i = 3;i < n;i = i + 2)
	 {
	 if (n % i == 0)
	 {
	 return (0);
	 break;
	 }
	 }
	if (i == n)
	{
	return (1);
	}
	 }
	}
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int i;
	int count = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 2;i <= n - 2;i++)
	{
	   a = i;
	   b = i + 2;
	   c = prime(a);
	   d = prime(b);
	   if (c == 1 && d == 1)
	   {
		   System.out.printf("%d %d\n",a,b);
		 count++;
	   }
	}
	 if (count == 0)
	 {
	 System.out.print("empty");
	 }
	   System.in.read();
	   System.in.read();
	}


}


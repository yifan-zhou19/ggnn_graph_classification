package <missing>;

public class GlobalMembers
{
	public static int S(int x)
	{
		int i = 2;
		int a = 0;
		while (i < x)
		{
			   if (x % i == 0)
			   {
						 a = 1;
						 break;
			   }
			   else
			   {
			   i++;
			   }
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int a = 5;
		int b;
		int c;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (a <= n)
		{
				   b = S(a);
				   c = S(a - 2);
				   if (b == 0 && c == 0)
				   {
				   System.out.printf("%d %d\n",a - 2,a);
				   d++;
				   }
				   a++;
		}
		if (d == 0)
		{
		System.out.print("empty");
		}
		System.in.read();
		System.in.read();
	}

}


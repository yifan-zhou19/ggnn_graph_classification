package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;

		a = 3;
		b = 5;
		c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % a == 0 && n % b == 0 && n % c == 0)
		{
		System.out.printf("%d %d %d",a,b,c);
		}
		if (n % a == 0 && n % b == 0 && n % c != 0)
		{
		System.out.printf("%d %d",a,b);
		}
		if (n % b == 0 && n % c == 0 && n % a != 0)
		{
		System.out.printf("%d %d",b,c);
		}
		if (n % a == 0 && n % c == 0 && n % b != 0)
		{
		System.out.printf("%d %d",a,c);
		}
		if (n % a == 0 && n % b != 0 && n % c != 0)
		{
		 System.out.printf("%d",a);
		}
		if (n % a != 0 && n % b == 0 && n % c != 0)
		{
		 System.out.printf("%d",b);
		}
		if (n % a != 0 && n % b != 0 && n % c == 0)
		{
		 System.out.printf("%d",c);
		}
		 if (n % a != 0 && n % b != 0 && n % c != 0)
		 {
		 System.out.print("n");
		 }

		 return 0;
	}


}


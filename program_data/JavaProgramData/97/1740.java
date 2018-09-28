package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a = m % 100;
	   b = a % 50;
	   c = b % 20;
	   d = c % 10;
	   e = d % 5;
	   System.out.print((m - a) / 100);
	   System.out.print('\n');
	   System.out.print((a - b) / 50);
	   System.out.print('\n');
	   System.out.print((b - c) / 20);
	   System.out.print('\n');
	   System.out.print((c - d) / 10);
	   System.out.print('\n');
	   System.out.print((d - e) / 5);
	   System.out.print('\n');
	   System.out.print(e);
	   System.out.print("\n");
	   return 0;
	}
}


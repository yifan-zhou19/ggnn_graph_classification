package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n; //????
	  int i;
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  i = n % 100; //??100????
	  a = (n - i) / 100;
	  n = i;
	  i = n % 50; //??50????
	  b = (n - i) / 50;
	  n = i;
	  i = n % 20; //??20????
	  c = (n - i) / 20;
	  n = i;
	  i = n % 10; //??10????
	  d = (n - i) / 10;
	  n = i;
	  i = n % 5; //??5????
	  e = (n - i) / 5;
	  f = i; //1????
	  System.out.print(a);
	  System.out.print("\n");
	  System.out.print(b);
	  System.out.print("\n");
	  System.out.print(c);
	  System.out.print("\n");
	  System.out.print(d);
	  System.out.print("\n");
	  System.out.print(e);
	  System.out.print("\n");
	  System.out.print(f);
	  System.out.print("\n");

	  return 0;
	}

}


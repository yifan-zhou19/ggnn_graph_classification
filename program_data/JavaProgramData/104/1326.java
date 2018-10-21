package <missing>;

public class GlobalMembers
{
	public static int f1(int x)
	{
		  int n = 1;
		  int i;
		  int p;
		  for (i = 0;i < 12;i++)
		  {
		  x = x / 2;
		  n++;
		  if (x == 1)
		  {
			  break;
		  }
		  }
		  return n;
	}
	public static int f2(int x,int y)
	{
		 int i;
		 for (i = 0;i < y;i++)
		 {
		 x = x / 2;
		 }
		 return x;
	}
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 e = f1(a);
		 f = f1(b);
		 for (c = 0;c < e;c++)
		 {
		 for (d = 0;d < f;d++)
		 {
		 if (f2(a, c) == f2(b, d))
		 {
		 System.out.print(f2(a, c));
		 c = e+1;
		 d = f + 1;
		 }
		 }
		 }
		 return 0;
	}
}


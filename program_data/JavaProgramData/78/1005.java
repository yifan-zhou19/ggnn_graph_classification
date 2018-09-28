package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int m;
	 int n;
	 int i;
	 for (a = 10;a <= 50;a = a + 10)
	 {
		 for (b = 10;b <= 50;b = b + 10)
		 {
			 if (a == b)
			 {
				 continue;
			 }
			 else
			 {
				 for (c = 10;c <= 50;c = c + 10)
				 {
				 if (a == c || c == b)
				 {
					 continue;
				 }
				 else
				 {
					 for (d = 10;d <= 50;d = d + 10)
					 {
					 if (a == d || b == d || c == d)
					 {
						 continue;
					 }
					 else if (a + b == c + d && a + d > b + c && a + c < b)
					 {
						 for (i = 50;i >= 10;i = i - 10)
						 {
							 if (a == i)
							 {
								 System.out.print("z ");
								 System.out.print(a);
								 System.out.print("\n");
							 }
							 if (b == i)
							 {
								 System.out.print("q ");
								 System.out.print(b);
								 System.out.print("\n");
							 }
							 if (c == i)
							 {
								 System.out.print("s ");
								 System.out.print(c);
								 System.out.print("\n");
							 }
							 if (d == i)
							 {
								 System.out.print("l ");
								 System.out.print(d);
								 System.out.print("\n");
							 }
						 }
					 }
					 }
				 }
				 }
			 }
		 }
	 }
	}

}

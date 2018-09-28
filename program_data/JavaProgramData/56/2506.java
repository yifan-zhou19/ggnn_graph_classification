package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num; //????
		int g;
		int s;
		int b;
		int q;
		int w;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num > 9999) //if?????num?5??????????????
		{
			w = (num / 10000) % 10;
			q = (num / 1000) % 10;
			b = (num / 100) % 10;
			s = (num / 10) % 10;
			g = num % 10;
			System.out.print(g);
			System.out.print(s);
			System.out.print(b);
			System.out.print(q);
			System.out.print(w);
			System.out.print("\n");
		}
			else if (num > 999) //if??
			{
					   q = (num / 1000) % 10;
				 b = (num / 100) % 10;
				 s = (num / 10) % 10;
				 g = num % 10;
				 System.out.print(g);
				 System.out.print(s);
				 System.out.print(b);
				 System.out.print(q);
				 System.out.print("\n");
			}
				 else if (num > 99) //if??
				 {
					 b = (num / 100) % 10;
					 s = (num / 10) % 10;
					 g = num % 10;
					 System.out.print(g);
					 System.out.print(s);
					 System.out.print(b);
					 System.out.print("\n");
				 }
					 else if (num > 9)
					 {
									   s = (num / 10) % 10;
						  g = num % 10;
						  System.out.print(g);
						  System.out.print(s);
						  System.out.print("\n");
					 }
		return 0;
	}
}


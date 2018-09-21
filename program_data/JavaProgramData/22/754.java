package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = -32767;
		int b = a;
		int t = 0;
		while (true)
		{

				 char c;
				 c = System.in.read();
				 if (c <= 13)
				 {

				 int d = t;

				 if (d > a)
				 {
					 b = a;
					 a = d;
				 }
				 if ((d > b) && (d < a))
				 {
					 b = d;
				 }
				 t = 0;
						   break;
				 }
				 else if (c == ',')
				 {

				 int d = t;

				 if (d > a)
				 {
					 b = a;
					 a = d;
				 }
				 if ((d > b) && (d < a))
				 {
					 b = d;
				 }

				 t = 0;
				 }
				 else
				 {
					 t = t * 10 + c - 48;
				 }
		}
		if (b == -32767)
		{
			System.out.print("No");
			System.out.print("\n");
		}
		else
		{
			System.out.print(b);
			System.out.print("\n");
		}

		return 0;
	}


}

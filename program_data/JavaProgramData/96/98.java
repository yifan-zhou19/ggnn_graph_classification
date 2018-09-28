package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int d;
		int r;
	   String a = new String(new char[100]);
	   int m;
	   int[] b = new int[100];
	   int[] c = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   m = a.length();
	   for (i = 0;i < m;i++)
	   {
						 c[i] = a.charAt(i) - '0';
	   }
		r = c[1];

	   for (i = 1;i < m;i++)
	   {
	   b[i] = (c[i] + 10 * c[i - 1]) / 13;
	  c[i] = c[i] + 10 * c[i - 1] - 13 * b[i];

	   }
		if (m == 1)
		{
				 System.out.print("0");
		}
				 else if (b[1] == 0 && m == 2 && r <= 2)
				 {
				  System.out.print("0");
				 }

	   for (i = 1;i < m;i++)
	   {
					   if (i == 1 && b[1] != 0)
					   {
					   System.out.printf("%d",b[1]);
					   }
						 if (i == 2 && b[2] != 0)
						 {
					   System.out.printf("%d",b[2]);
						 }

					   if (i != 1 && i != 2)
					   {
					   System.out.printf("%d",b[i]);
					   }

	   }

	   System.out.print("\n");
	  System.out.printf("%d",c[m - 1]);




		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();


	}
}


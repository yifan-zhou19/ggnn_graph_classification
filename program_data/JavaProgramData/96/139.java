package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int j;
		  String a = new String(new char[100]);
		  String c = new String(new char[100]);
		  String f = new String(new char[100]);
		  int[] b = new int[100];
		  a = new Scanner(System.in).nextLine();
		  n = a.length();
		  for (j = 0;j < n;j++)
		  {
		  b[j] = a.charAt(j) - '0';
		  }
		  int x;
		  x = b[0] * 10 + b[1];
		  if ((n == 2 && x >= 13) || n >= 3)
		  {
						 int d;
						 int e;
		  e = 0;
		  for (j = 0;j < n;j++)
		  {
						  d = e * 10 + b[j];
						  e = d % 13;
						  c = tangible.StringFunctions.changeCharacter(c, j, d / 13 + '0');
		  }
						  c = tangible.StringFunctions.changeCharacter(c, n, '\0');
		  int i;
		  int k;
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (c.charAt(i) != '0' || i >= 2)
						  {
									 f = tangible.StringFunctions.changeCharacter(f, k, c.charAt(i));
									 k++;
						  }
									 f = tangible.StringFunctions.changeCharacter(f, k, '\0');
		  }
						  System.out.println(f);
						  System.out.printf("%d",e);
		  }
		  if (n == 2 & x < 13)
		  {
						System.out.print("0\n");
						System.out.printf("%d",x);
		  }
		  if (n == 1)
		  {
				  System.out.print("0\n");
				  System.out.printf("%d",b[0]);
		  }

		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}


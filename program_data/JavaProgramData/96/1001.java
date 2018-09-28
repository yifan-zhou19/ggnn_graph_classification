package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String a = new String(new char[100]);
		 int[] b = new int[100];
		 int i;
		 int m;
		 int r;
		 a = new Scanner(System.in).nextLine();
		 n = a.length();
		 for (i = 0;i < n;i++)
		 {
			 b[i] = a.charAt(i) - '0';
		 }
		 m = b[0] * 10 + b[1];
		 r = m % 13;
		 if (n == 1)
		 {
			 System.out.printf("%d\n%d",0,b[0]);
		 }
		 else if (n == 2)
		 {
			 System.out.printf("%d\n%d",m / 13,r);
		 }
		 else
		 {
			 if (m / 13 != 0)
			 {
				 System.out.printf("%d",m / 13);
			 }
		 for (i = 2;i < n;i++)
		 {
			 m = r * 10 + b[i];
			 r = m % 13;
			 System.out.printf("%d",m / 13);

		 }

		  System.out.print("\n");
		  System.out.printf("%d",r);
		 }
		  return 0;
	}
}

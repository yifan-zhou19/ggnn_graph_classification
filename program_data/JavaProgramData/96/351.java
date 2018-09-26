package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
					 String a = new String(new char[101]);
					 int[] b = new int[101];
					 int i;
					 int y;
					 int n = 0;
					 a = new Scanner(System.in).nextLine();
					 for (i = 0;a.charAt(i) != '\0';i++)
					 {
										n++;
										b[i] = a.charAt(i) - '0';
					 }
					 for (i = 0;i <= n - 2;i++)
					 {
											b[i + 1] = (b[i] % 13) * 10 + b[i + 1];
											b[i] = b[i] / 13;
					 }
					 y = b[n - 1] % 13;
					 b[n - 1] = b[n - 1] / 13;
					 if (n == 1)
					 {
					 System.out.print("0");
					 }
					 else if ((b[1] == 0) && (n >= 3))
					 {
						 for (i = 2;i <= n - 1;i++)
						 {
											System.out.printf("%d",b[i]);
						 }
					 }
					 else
					 {
						 for (i = 1;i <= n - 1;i++)
						 {
											System.out.printf("%d",b[i]);
						 }
					 }
					 System.out.printf("\n%d\n",y);
	}

}

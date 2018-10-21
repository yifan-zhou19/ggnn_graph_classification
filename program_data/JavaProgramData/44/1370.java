package <missing>;

public class GlobalMembers
{
	public static char reverse(String a, int n)
	{
		 int i;
		 int j;
		 if (n == 1 && a[0].equals('0'))
		 {
			System.out.print("0");
		 }
		 if (a[0].equals('-'))
		 {
			System.out.print("-");
		 for (i = n - 1;i > 0;i--)
		 {
			if (a[i].equals('0'))
			{
			continue;
			}
			else
			{
				j = i;
				break;
			}
		 }
		 for (i = j;i > 0;i--)
		 {
			System.out.printf("%c",a[i]);
		 }
		 }
		 if (!a[0].equals('-'))
		 {
			for (i = n - 1;i >= 0;i--)
			{
			if (a[i].equals('0'))
			{
			continue;
			}
			else
			{
				j = i;
				break;
			}
			}
		 for (i = j;i >= 0;i--)
		 {
			System.out.printf("%c",a[i]);
		 }
		 }
	}
	public static int Main()
	{
		 String a = new String(new char[100]);
		 char i;
		 int n;
		 for (i = 0;i < 6;i++)
		 {
		 a = new Scanner(System.in).nextLine();
		 n = a.length();
		 reverse(a, n);
		 System.out.print("\n");
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}

}

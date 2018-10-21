package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int l;
		int o;
		 String s = new String(new char[501]);
		 s = new Scanner(System.in).nextLine();
		 l = s.length();
		 for (n = 2;n <= l;n++)
		 {
			for (i = 0;i <= l - n;i++)
			{

		 for (m = i,o = i + n - 1;s.charAt(m) == s.charAt(o);m++,o--)
		 {


		if (m >= o)

		{
			 for (j = i;j <= i + n - 1;j++)
			 {
		  System.out.printf("%c",s.charAt(j));
			 }

		 System.out.print("\n");
		 break;
		}
		 }
			}
		 }
	}
}

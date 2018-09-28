package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		int l;
		int j;
		l = c.length();
		int i;
		int t;
		t = l;
		for (i = l - 1;i >= 0;i--)
		{
				   if (c.charAt(i) == ' ')
				   {
							   for (j = i + 1;j < t;j++)
							   {
												 System.out.printf("%c",c.charAt(j));
							   }
							   System.out.print(" ");
							   t = i;
				   }
		}
		for (i = 0;i < l;i++)
		{
					 if (c.charAt(i) == ' ')
					 {
					 break;
					 }
					 else
					 {
					 System.out.printf("%c",c.charAt(i));
					 }
		}
		System.in.read();
		System.in.read();
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		final String s = "";
		 s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
		   if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
		   {
		System.out.printf("%d",s.charAt(i) - 48);
		   }
		 if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') && (s.charAt(i + 1) == '\0' || s.charAt(i + 1) < '0' || s.charAt(i + 1)>'9'))
		 {
		 System.out.print("\n");
		 }
		}
		 return 0;
	}
}

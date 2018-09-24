package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int m;
	 int n;
	 String s = new String(new char[100]);
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 s = new Scanner(System.in).nextLine();
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 n = s.length();
	 m = a.length();
	 for (i = 0;i <= n - 1;i++)
	 {
	  if (i == 0 && s.charAt(0) == a.charAt(0))
	  {
	   for (j = 1;j <= m - 1;j++)
	   {
		if (s.charAt(j) != a.charAt(j))
		{
		break;
		}
	   }
		if (j == m && s.charAt(m) == ' ')
		{
		 System.out.printf("%s",b);
		 i = i + m;
		}
	  }
	   if (s.charAt(i) == ' ' && s.charAt(i + 1) == a.charAt(0))
	   {
		 for (j = 1;j <= m - 1;j++)
		 {
		  if (s.charAt(i + j + 1) != a.charAt(j))
		  {
			  break;
		  }
		 }
		  if (j == m && (s.charAt(i + j + 1) == ' ' || s.charAt(i + j + 1) == '\0'))
		  {
			System.out.printf(" %s",b);
			i = i + m + 1;
		  }
	   }
		 if (s.charAt(i) != '\0')
		 {
			 System.out.printf("%c",s.charAt(i));
		 }
	 }
	}
}

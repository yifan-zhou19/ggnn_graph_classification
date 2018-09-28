package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String p;
	   String str = new String(new char[110]);
	   int len;
	   int i;
	   p = str;
	   str = new Scanner(System.in).nextLine();
	   len = str.length();
	   for (i = 0;i < len;i++)
	   {
		 if (i == 0)
		 {
			System.out.print((p.Substring(i)));
		 }
		 else
		 {
			 if ((*(p.Substring(i)) == ' ' && *(p.Substring(i) - 1) != ' ') || (*(p.Substring(i)) != ' '))
			 {
			 System.out.print((p.Substring(i)));
			 }
			 else
			 {
				 continue;
			 }
		 }
	   }
	   return 0;
	}
}

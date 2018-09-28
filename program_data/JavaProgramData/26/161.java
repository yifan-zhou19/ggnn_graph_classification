package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String a = new String(new char[100000]);
		 a = new Scanner(System.in).nextLine();
		 n = a.length();
		 int i;
		 int k;
		 for (i = 0;i < n;i++)
		 {
		   if (a.charAt(i) != 32)
		   {
			   System.out.printf("%c",a.charAt(i));
		   }
		   else
		   {
				if (a.charAt(i - 1) != 32 && a.charAt(i + 1) == 32)
				{
					System.out.printf("%c",a.charAt(i));
				}
				else if (a.charAt(i - 1) != 32 && a.charAt(i + 1) != 32)
				{
					System.out.printf("%c",a.charAt(i));
				}
		   }
		 }
		  System.in.read();
		  System.in.read();
	}


}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[MAX + 2]);
		String b = new String(new char[MAX + 1]);
		String c = new String(new char[MAX + 1]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int len;
		int len1;
		int len2;
		int i;
		int j;
		int flag = 1;
		len = a.length();
		len1 = b.length();
		len2 = c.length();
		for (i = 0;i < len;i++)
		{
			if (i <= len - len1 && flag == 1)
			{
			   if (a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1) && a.charAt(i + len1 - 1) == b.charAt(len1 - 1))
			   {
				 for (j = 0;j < len2;j++)
				 {
					 System.out.printf("%c",c.charAt(j));
				 }
				 i = i + len1 - 1;
				 flag = 0;
			   }
			   else
			   {
			   System.out.printf("%c",a.charAt(i));
			   }
			}
			else
			{
			System.out.printf("%c",a.charAt(i));
			}
		}
	}
}

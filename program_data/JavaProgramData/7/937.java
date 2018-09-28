package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String sub = new String(new char[100]);
		String re = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		int bar = 0;
		int min = 0;
		int len1 = str.length();
		int len2 = sub.length();
		for (int i = 0;i < len1;)
		{
				bar = 0;
				if (str.charAt(i) == sub.charAt(0))
				{
						 for (int j = 0;j < len2;j++)
						 {
								 if (str.charAt(i + j) != sub.charAt(j))
								 {
										   bar = 1;
								 }
						 }
						 if (bar == 0 && min == 0)
						 {
								 System.out.printf("%s",re);
								 i = i + len2;
								 min = 1;
						 }
						 else
						 {
								 System.out.printf("%c",str.charAt(i));
								 i = i + 1;
								 bar = 0;
						 }
				}
				else
				{
					 System.out.printf("%c",str.charAt(i));
					 i = i + 1;
				}
		}
		return 0;
	}



}

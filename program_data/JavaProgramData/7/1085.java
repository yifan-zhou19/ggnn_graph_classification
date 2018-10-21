package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int kk;
	public static String s1 = new String(new char[305]);
	public static String s2 = new String(new char[305]);
	public static String s3 = new String(new char[305]);

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		for (i = 0;i < s1.length();i++)
		{
			 for (j = 0;j < s2.length();j++)
			 {
				if (s1.charAt(i + j) != s2.charAt(j))
				{
					break;
				}
			 }
			 if (j == s2.length())
			 {
				 k = i;
				 kk = 1;
				 break;
			 }
		}
		if (kk == 1)
		{
				 for (i = 0;i < k;i++)
				 {
				  System.out.printf("%c",s1.charAt(i));
				 }
				 System.out.printf("%s",s3);
				 for (i = k + s2.length();i < s1.length();i++)
				 {
				   System.out.printf("%c",s1.charAt(i));
				 }
				 System.out.print("\n");
		}
		else
		{
			System.out.printf("%s\n",s1);
		}
		return 0;
	}


}


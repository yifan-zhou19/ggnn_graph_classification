package <missing>;

public class GlobalMembers
{
	public static int panduan(char a)
	{
		if (a >= '0' && a <= '9')
		{
		return 0;
		}
		if (a >= 'a' && a <= 'z')
		{
		return 0;
		}
		if (a >= 'A' && a <= 'Z')
		{
		return 0;
		}
		if (a == '_')
		{
		return 0;
		}
		return 1;
	}
	public static int Main()
	{
		String a = new String(new char[81]);
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < k;j++)
		{
						   a = new Scanner(System.in).nextLine();
						   int n = a.length();
						   if (!(a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
						   {
						   System.out.print("0\n");
						   continue;
						   }
						   else
						   {
						   for (int i = 0;i < n;i++)
						   {
								   if (panduan(a.charAt(i)) != 0)
								   {
									  System.out.print("0\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
									  goto end;
								   }
						   }
						   }
						   System.out.print("1\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						   end:
						   ;
		}
	}
}


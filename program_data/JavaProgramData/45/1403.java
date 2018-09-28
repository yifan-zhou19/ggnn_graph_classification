package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int length1 = 0;
		int length2 = 0;
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		length1 = str1.length();
		length2 = str2.length();
		for (i = 0;i < length2;i++)
		{
			 for (j = 0;j < length1;j++)
			 {
				  if (str1.charAt(j) != str2.charAt(i + j))
				  {
				  break;
				  }
				  System.out.printf("%d",i);
				  System.exit(0);
			 }
		}
		return 0;
	}

}


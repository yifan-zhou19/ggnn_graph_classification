package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String substring = new String(new char[50]);
		String string = new String(new char[50]);
	 int i;
	 int j;
	 int len1;
	 int len2;
	 String p1 = substring;
	 String p2 = String;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 substring = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 String = tempVar2;
	 }
	 len1 = substring.length();
	 len2 = String.length();
	 for (i = 0;i < len2;i++)
	 {
			for (j = 0;j < len1;j++)
			{
			if (*(p2.Substring(i) + j) != *(p1.Substring(j)))
			{
				break;
			}
			}
		if (j == len1)
		{
			break;
		}
	 }
	 System.out.printf("%d",i);
	}
}


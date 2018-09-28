package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[20]);
	 String b = new String(new char[20]);
	 int i;
	 int j;
	 int c;
	 int d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 c = a.length();
	 d = b.length();
	 if (c != d)
	 {
		 System.out.print("NO");
	 }
	 else
	 {
	for (i = 0;a.charAt(i) != 0;i++)
	{
		 for (j = 0;b.charAt(j) != 0;j++)
		 {
		   if (a.charAt(i) == b.charAt(j))
		   {
				 b = tangible.StringFunctions.changeCharacter(b, j, '0');
				 break;
		   }
		 }
		   if (b.charAt(j) == 0)
		   {
			   System.out.print("NO");
			   break;
			   break;
		   }
	}
	 System.out.print("YES");
	 }
	}




}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	 int i;
	 int j;
	 int k;
	 int t;
	 int p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 k = a.length();
	 t = b.length();
	 if (k != t)
	 {
	  System.out.print("NO\n");
	 }
	 else
	 {
		  for (i = 0;i < k;i++)
		  {
		for (j = 0;j < t;j++)
		{
		 if (a.charAt(i) == b.charAt(j))
		 {
			 b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			 p = 1;
			 break;
		 }
		 else
		 {
			 p = 0;
		 }
		}
		  }
		if (p == 1)
		{
			System.out.print("YES\n");
		}
		if (p == 0)
		{
			System.out.print("NO\n");
		}
	 }
	}

}


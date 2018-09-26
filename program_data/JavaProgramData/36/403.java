package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String aa = new String(new char[1000]);
		String bb = new String(new char[1000]);
		int m;
		int j;
		int i;
		int t;
		int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   aa = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   bb = tempVar2.charAt(0);
	   }
		if (aa.length() != bb.length())
		{
			System.out.print("NO");
		}
	   else
	   {
		   m = aa.length();
			for (j = 1;j <= m - 1;j++)
			{
		 for (i = 0;i <= m - j - 1;i++)
		 {
		   if (aa.charAt(i) < aa.charAt(i + 1))
		   {
			   t = aa.charAt(i);
			   aa = tangible.StringFunctions.changeCharacter(aa, i, aa.charAt(i + 1));
			   aa = tangible.StringFunctions.changeCharacter(aa, i + 1, t);
		   }
		   if (bb.charAt(i) < bb.charAt(i + 1))
		   {
			   t = bb.charAt(i);
			   bb = tangible.StringFunctions.changeCharacter(bb, i, bb.charAt(i + 1));
			   bb = tangible.StringFunctions.changeCharacter(bb, i + 1, t);
		   }
		 }
			}
		 c = strcmp(aa,bb);
	   if (c == 0)
	   {
		   System.out.print("YES");
	   }
	   else
	   {
		   System.out.print("NO");
	   }
	   }
	}



}


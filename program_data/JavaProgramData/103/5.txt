package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String a = new String(new char[1001]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			int l = a.length();
			int i;
			for (i = 0;i < l;i++)
			{
			  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			  {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			  }
			}
		   int ncount = 1;
			   for (i = 0;i < l;i++)
			   {
				 if (a.charAt(i + 1) == a.charAt(i))
				 {
				 ncount++;
				 }
				 else
				 {
					System.out.printf("(%c,%d)",a.charAt(i),ncount);
					ncount = 1;
				 }
			   }
		   System.in.read();
		   System.in.read();
		   System.in.read();


	}

}


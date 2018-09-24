package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		String a = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		j = 1;
		for (i = 0;i < 1001;i++)
		{
		  if (a.charAt(i) == '\0')
		  {
			  c = i;
		  break;
		  }
		}
		for (i = 0;i < c;i++)
		{
		   if (((a.charAt(i) - 'a') == (a.charAt(i + 1) - 'a')) || ((a.charAt(i) - 'a') == (a.charAt(i + 1) - 'A')) || ((a.charAt(i) - 'A') == (a.charAt(i + 1) - 'a')))
		   {
			 j += 1;
		   }
			else
			{
				 if ((a.charAt(i) >= 'a') || (a.charAt(i) < 'A'))
				 {
					  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
				 }
			   System.out.printf("(%c,%d)",a.charAt(i),j);
				j = 1;
			}
		}
	   // getchar();
		//getchar();
		return 0;
	}

}


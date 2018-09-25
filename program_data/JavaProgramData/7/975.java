package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[max]);
		String a = new String(new char[max]);
		String b = new String(new char[max]);
		int ls;
		int la;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			;
		}
		ls = i;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			;
		}
		la = i;

		for (i = 0;i <= ls - la + 1;i++)
		{
			 for (j = i;j <= i + la - 1;j++)
			 {
			   if (s.charAt(j) != a.charAt(j - i))
			   {
				   break;
			   }
			 }
			 if (j == i + la)
			 {
				  for (j = i;j <= i + la - 1;j++)
				  {
					s = s.substring(0, j); //0????
				  }
				  i = j - 1;
				  break; //???????
			 }
		}

		for (i = 0;i <= ls - 1;i++)
		{
		  if (s.charAt(i) == 0)
		  {
			  System.out.printf("%s",b);
			  i += la - 1;
		  }
		  else
		  {
		  System.out.printf("%c",s.charAt(i));
		  }
		}
	}

}


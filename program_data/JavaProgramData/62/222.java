package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char c;
		  int flag = 1;
		  int a;
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  while (c != '\n')
		  {
			   if ((c == ' ' && flag != 0) || (c != ' '))
			   {
				   System.out.printf("%c",c);
			   }
			   if (c == ' ')
			   {
				   flag = 0;
			   }
			   else
			   {
				   flag = 1;
			   }
			   String tempVar2 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar2 != null)
			   {
				   c = tempVar2.charAt(0);
			   }
		  }
	}

}


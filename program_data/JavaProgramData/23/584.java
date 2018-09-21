package <missing>;

public class GlobalMembers
{
	/*
	  Name: ????
	  Copyright: 
	  Author: 
	  Date: 08/11/12 20:40
	  Description:??????(????????)????????????????????????? 
	*/
	public static int Main()
	{
	   final String str = "";
		int i = 0;
		int k;
		while (true)
		{
		   str = tangible.StringFunctions.changeCharacter(str, i, ConsoleInput.readToWhiteSpace(true));
			i++; // ??????????
		   if (cin.peek() == '\n')
		   {
			   break;
		   }
		}

		for (k = i - 1;k >= 0;k--)
		{
		  if (k == 0)
		  {
			  System.out.print(str.charAt(k));
		  }
		  else
		  {
			  System.out.print(str.charAt(k));
			  System.out.print(' ');
		  }
		}

			   return 0;
	}

}


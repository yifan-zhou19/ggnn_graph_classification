package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012826_???????.cpp
	 *
	 *  Created on: 2010-1-8
	 *      Author: Administrator
	 */

	public static int Main()
	{
	int i = 0;
	int j = 0;
	char c;
	String s = new String(new char[100]);
	for (;(c = System.in.read()) != EOF && c != '\n';)
	{
			  if (c == ' ' && j == 0)
			  {
					  s = tangible.StringFunctions.changeCharacter(s, i++, ' ');
					  j = 1;
			  }
			  else if (c == ' ')
			  {
				  continue;
			  }
			  else
			  {
					  s = tangible.StringFunctions.changeCharacter(s, i++, c);
	  j = 0;
			  }
	}
	s = tangible.StringFunctions.changeCharacter(s, i, '\n');
	for (i = 0;s.charAt(i) != '\n';i++)
	{
			System.out.print(s.charAt(i));
	}
			System.out.print('\n');
	}

}


import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*                  ???????????                   *
	//*                  ?????1000010573                     *
	//*                  ?????2010?12?                     *         
	//*************************************************************


	public static int Main() //???
	{
		String in = new String(new char[111]);
		String out = new String(new char[111]);
		in = new Scanner(System.in).nextLine();
		int lenin;
		lenin = in.length();
		for (int i = 0 ; i < lenin ; i++)
		{
			out = tangible.StringFunctions.changeCharacter(out, i, in.charAt(i % lenin) + in.charAt((i + 1) % lenin));
		}
		for (int j = 0 ; j < lenin ; j++)
		{
			System.out.print(out.charAt(j));
		}

		   return 0;
	}


}


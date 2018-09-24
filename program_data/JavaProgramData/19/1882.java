import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????



	public static int Main()
	{
		String input = new String(new char[110]); //??????????????????????
		String replaced = new String(new char[110]);
		String replace = new String(new char[110]);
		String p; //????input??inputL????
		String start;
		int len; //?????????
		char temp;

		input = new Scanner(System.in).nextLine();
		replaced = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();

		len = replaced.length();
		p = tangible.StringFunctions.strStr(input, replaced); //?????????
		start = input; //???????
		while (p != null) //??????
		{
			if ((p == input || Character.isLetter(*(p - 1)) == 0) && Character.isLetter(*(p.Substring(len))) == 0)
			{
			//??????????
				p = '\0'; //??\0?

				System.out.print(start);
				System.out.print(replace);

				start = p.Substring(len); //start????????????
				p = tangible.StringFunctions.strStr(start, replaced); //p??input?????start?????
			}
			else
			{
				p = input + (p - input) + len; //p?????????
				temp = p; //???
				p = '\0';

				System.out.print(start);

				start = p; //????????
				start = temp; //????
				p = tangible.StringFunctions.strStr(start, replaced);
			}
		}


		System.out.print(start);
		System.out.print("\n");

		return 0;
	}

}


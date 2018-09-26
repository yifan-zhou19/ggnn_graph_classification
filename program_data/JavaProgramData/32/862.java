import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	2736:??????? ?? ?? ?? ????: 1000ms ????: 65536kB 
	?? 
	?2?????????? 
	?? 
	?1?????????n????????2???1?????a??2????b(a > b)????????????
	??????????100??? 
	?? 
	n???????????????????? 
	???? 
	2
	9999999999999999999999999999999999999
	9999999999999
	
	5409656775097850895687056798068970934546546575676768678435435345
	1
	
	???? 
	9999999999999999999999990000000000000
	5409656775097850895687056798068970934546546575676768678435435344
	*/

	public static void reverse(String temp)
	{
		int i = 0;
		for (i = 0; i < temp.length() / 2; i++)
		{
			char t = '\0';
			t = temp[i];
			temp[i] = temp[temp.length() - i - 1];
			temp[temp.length() - i - 1] = t;
		}
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			System.in.read();
			final String a = "";
			final String b = "";
			final String temp = "";
			char mark = '+';
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			if ((a.length() == b.length() && strcmp(a, b) < 0) || (a.length() < b.length()))
			{
				temp = a;
				a = b;
				b = temp;
				mark = '-';
			}
			reverse(a);
			reverse(b);
			int i = 0;
			for (i = 0; i < b.length(); i++)
			{
				if (a.charAt(i) < b.charAt(i))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10 - b.charAt(i) + '0');
					a.charAt(i + 1)--;
				}
				else if (a.charAt(i) >= b.charAt(i))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i) + '0');
				}
			}
			reverse(a);
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}

}


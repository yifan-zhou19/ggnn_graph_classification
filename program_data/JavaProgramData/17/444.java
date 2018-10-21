import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????
	//??????? 
	//?????12.11.29
	public static String in = new String(new char[110]); //??????????
	public static String work = new String(new char[110]);
	public static String out = new String(new char[110]);
	public static int len; //??????
	public static void pick(int L) //?????????
	{
		for (int i = L - 1;i >= 0;i--)
		{ //???????????
			if (work.charAt(i) == '(')
			{
				for (int j = 0;j < L - i;j++)
				{ //?????????????
					if (work.charAt(i + j) == ')')
					{
						work = tangible.StringFunctions.changeCharacter(work, i, ' ');
						work = tangible.StringFunctions.changeCharacter(work, i + j, ' '); //????????
						pick(len); //????
						break;
					}
				}
			}
		}
	}
	public static void mark(int L) //??????????
	{
		for (int i = 0;i < L;i++)
		{
			if (work.charAt(i) == '(')
			{
				out = tangible.StringFunctions.changeCharacter(out, i, '$');
			}
			if (work.charAt(i) == ')')
			{
				out = tangible.StringFunctions.changeCharacter(out, i, '?');
			}
		} //?????
	}
	public static int Main()
	{
		while (ConsoleInput.lastReadWasGood())
		{
			in = new Scanner(System.in).nextLine(); //??????
			len = in.length();
			for (int i = 0;i < len;i++)
			{
				out = tangible.StringFunctions.changeCharacter(out, i, ' ');
				work = tangible.StringFunctions.changeCharacter(work, i, in.charAt(i));
			} //????????????
			pick(len);
			mark(len);
			for (int i = 0;i < len;i++)
			{
				System.out.print(in.charAt(i));
			}
			System.out.print("\n");
			for (int i = 0;i < len;i++)
			{
				System.out.print(out.charAt(i));
			}
			System.out.print("\n");
		} //?????
			return 0;
	}

}


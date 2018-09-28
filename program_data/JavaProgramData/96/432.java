package <missing>;

public class GlobalMembers
{
	//******************************************
	//*?????13.cpp                       **
	//*??: ??     1100012808              **
	//*???2011.11.08                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int[] s = new int[101];
		int[] N = new int[101];
		int y;
		int i;
		int j;
		String str = new String(new char[101]); //????????
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i < str.length(); i++)
		{
		N[i] = str.charAt(i) - '0'; //????????????
		}
		if (str.length() != 1) //?????????????
		{
		for (i = 0; i < str.length() - 1; i++)
		{
				s[i] = (N[i] * 10 + N[i + 1]) / 13; //???????????
			y = (N[i] * 10 + N[i + 1]) % 13;
			N[i + 1] = y;
		}
			if (str.length() >= 3)
			{
			if (s[0] != 0) //???s[0]???0
			{
				System.out.print(s[0]);
			}
			for (i = 1; i < str.length() - 2; i++)
			{
					System.out.print(s[i]);
			}
			System.out.print(s[str.length() - 2]);
			System.out.print("\n");
			}
			else //????????????
			{
			System.out.print(s[0]);
			System.out.print("\n");
			}
			System.out.print(y);
			System.out.print("\n");
		}
		else
		{
		System.out.print("0");
		System.out.print("\n");
		System.out.print(N[0]);
		System.out.print("\n");
		}
		return 0;
	} //?????






}


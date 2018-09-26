package <missing>;

public class GlobalMembers
{
	//********************************
	//*????3.cpp                ** 
	//*?????13                 **
	//*?????? 1200012834      **
	//*???2012.11.10             **
	//********************************

	public static int Main()
	{
		String num = new String(new char[101]); // num??????
		int[] quot = new int[101]; // quot????????weishu??????
		int r;
		int i;
		int temp;
		int weishu = 0;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (num.charAt(1) == '\0' || (num.charAt(0) == '1' && (num.charAt(1) == '0' || num.charAt(1) == '1' || num.charAt(1) == '2') && num.charAt(2) == '\0'))
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num);
		}
		else
		{
			r = num.charAt(0) - '0'; // ????r?????????
			for (i = 0; num.charAt(i + 1) != '\0'; i++)
			{
				temp = r * 10 + num.charAt(i + 1) - '0'; // temp???????2???
				r = temp % 13; // r?temp??13???
				quot[i] = (temp - r) / 13; // quot[i]????temp??13??
												 // ?????????i???
				weishu++; // ????????1
				temp = 0; // temp??
			}
			if (quot[0] != 0) // ???????????0
			{
				System.out.print(quot[0]);
			}
			for (i = 1; i < weishu; i++)
			{
				System.out.print(quot[i]);
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}
}


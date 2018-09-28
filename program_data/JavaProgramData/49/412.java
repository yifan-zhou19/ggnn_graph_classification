package <missing>;

public class GlobalMembers
{
	//**********************************
	//*????.cpp                    *
	//*??????                    *
	//*???2011-10-30                *
	//**********************************


	public static void checking(String check, int i)
	{
		int m;
		int q;
		for (m = 0; m < i; m++)
		{
			if (!check[m].equals(check[i - 1 - m])) //??check???????break???
			{
				break;
			}
		}
		if (m == i)
		{
			for (q = 0; q < i; q++)
			{
				System.out.print(check[q]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int flag;
		int q;
		String str = new String(new char[501]);
		String check = new String(new char[501]); //???????????????
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = str.length(); //????????
		for (i = 2; i <= n; i++)
		{
			flag = 0;
			for (j = 0; j < n - i + 1; j++)
			{
				for (k = j; k < j + i; k++)
				{
					check = tangible.StringFunctions.changeCharacter(check, k - j, str.charAt(k)); //??????????check??
				}
				checking(check, i);
			}
		}
		return 0;
	}

}


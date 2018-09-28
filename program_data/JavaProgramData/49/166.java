package <missing>;

public class GlobalMembers
{
	//**********************************************
	//**???????******************************
	//**?????? 1000012741*********************
	//**???2010?11?26?************************
	//**********************************************
	public static void pal(String str, int m, int i) //??pal?????????????????????
	{
		int j = i; //????????????j?p
		int p = i + 1;
		while (str[j].equals(str[p]) && j >= 0 && !str[p].equals('\0')) //????????????
		{
			j--;
			p++;
			if (p != (i + 1) && ((p - j - 1) == m)) //?????????????
			{
				for (int k = j + 1; k < p; k++) //????
				{
					System.out.print(str[k]);
				}
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[503]);
		int i; //m?????????l?????????
		int j;
		int k;
		int p;
		int m;
		int l;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length(); //????
		for (m = 2; m <= l; m = m + 2) //??????????
		{
			for (i = 0; str.charAt(i + 1) != '\0'; i++)
			{
				pal(str, m, i);
			}
		}
		for (m = 3; m <= l; m = m + 2) //??????????
		{
			for (i = 0; str.charAt(i) != '\0'; i++) //??????????
			{
				j = i - 1;
				p = i + 1;
				while (str.charAt(j) == str.charAt(p) && j >= 0 && str.charAt(p) != '\0')
				{
					j--;
					p++;
				}
				if (p != (i + 1) && ((p - j - 1) == m)) //?????????????
				{
					for (k = j + 1; k < p; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
	//**********************************************
}


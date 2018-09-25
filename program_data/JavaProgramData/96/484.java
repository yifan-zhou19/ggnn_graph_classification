package <missing>;

public class GlobalMembers
{
	//************************************
	//*   ??13                         *
	//*   ??????                   *
	//*   ?????2011?12?17?       *
	//************************************


	public static int Main()
	{
		int yu;
		int i;
		int j;
		int n;
		int p;
		String num = new String(new char[200]);
		String shang = new String(new char[200]);
		cin.get(num, 200); //?????
		n = num.length(); //????????
		yu = 0; //????
		p = 200; //?????????0???
		for (i = 0; i < n; i++)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, i, (yu * 10 + num.charAt(i) - '0') / 13 + '0');
			yu = (yu * 10 + num.charAt(i) - '0') % 13;
		} //??????????
		for (i = 0; i < n; i++)
		{
			if (shang.charAt(i) != '0')
			{
				p = i;
				break;
			}
		} //???????????0???
		if (p == 200)
		{
			System.out.print("0");
		}
		else
		{
			for (j = i; j < n; j++)
			{
				System.out.print(shang.charAt(j));
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	//******************************************
	//*  ??13                                *
	//*  ??????                          *
	//*  ?????2011?11?5?               *
	//******************************************


	public static int Main()
	{
		String dashu = new String(new char[100]);
		String shang = new String(new char[100]);
		int yu;
		int i;
		int n;
		int p;
		dashu = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = dashu.length(); //????????
		yu = 0; //yu????
		p = 200; //p????????0
		for (i = 0; i < n; i++)
		{
			shang = tangible.StringFunctions.changeCharacter(shang, i, (yu * 10 + dashu.charAt(i) - '0') / 13 + '0');
			//?????????????
			yu = (yu * 10 + dashu.charAt(i) - '0') - 13 * (shang.charAt(i) - '0');
			//????????????ascii???????
		}
		for (i = 0; i < n; i++)
		{
			if (shang.charAt(i) != '0')
			{
				p = i; //??????????????0?????
				break;
			}
		}
		if (p == 200) //?p=200,?????????,???0
		{
			System.out.print("0");
		}
		else
		{
			for (i = p; i < n; i++)
			{
				System.out.print(shang.charAt(i));
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");
		return 0;
	}
}


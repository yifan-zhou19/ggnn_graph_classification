package <missing>;

public class GlobalMembers
{
	// ???????.cpp : ??????????????
	//?????????~~

	///#include "stdafx.h"

	public static int Main()
	{
	//int _tmain(int argc, _TCHAR* argv[])
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		String * pa = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int len = a.length(); //lpa??pa????kk??????????????
		int lpa = 0;
		int kk = 0;
		for (int i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ') //?????
			{
					pa = tangible.StringFunctions.changeCharacter(pa, lpa, a.charAt(i));
					lpa++;
					kk = 0;
			}
			else
			{
				if (kk == 0) //????????
				{
					pa = tangible.StringFunctions.changeCharacter(pa, lpa, a.charAt(i));
					lpa++;
					kk++;
				}
			}
		}
		for (int i = 0 ;i < lpa;i++)
		{
			System.out.print(pa.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}


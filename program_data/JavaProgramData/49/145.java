import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************
	//????1000012825           *
	//??????                 *
	//???11.28                  *
	//???????               *
	//******************************
	public static int Main()
	{
		String str = new String(new char[500]);
		String h = new String(new char[500]);
		int i;
		int len;
		int j;
		int k;
		int l = 0;
		int p;
		int q;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length(); //??????????
		for (i = 2; i <= len ; i++)
		{
			for (j = 0; j <= len - i ; j++) //????????2?len,????????
			{
				l = 0;
				for (k = j; k <= j + i - 1; k++)
				{
					h = tangible.StringFunctions.changeCharacter(h, l++, str.charAt(k)); //??????????????
				}
				for (p = 0; p <= i / 2 - 1; p++) //?????????????????
				{
					if (h.charAt(p) != h.charAt(i - 1 - p))
					{
						break;
					}
				}
				if (p == i / 2)
				{
					for (q = 0; q <= i - 2; q++)
					{
						System.out.print(h.charAt(q));
					}
					System.out.print(h.charAt(i - 1));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}


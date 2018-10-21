import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//*?????? 1300012809   **
	//*???2013.11.16          **
	//*????????          **
	//*****************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int changdu1;
		int changdu2;
		int[] jieguo = new int[1005];
		String jianshu = new String(new char[1005]);
		String beijianshu = new String(new char[1005]);
		String zhongjian = new String(new char[1005]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 0; k < n; k++)
		{
			if (k != 0)
			{
				System.in.read();
			}
			beijianshu = new Scanner(System.in).nextLine();
			jianshu = new Scanner(System.in).nextLine();
			changdu1 = beijianshu.length();
			changdu2 = jianshu.length();
			for (i = 0; i < changdu1; i++)
			{
				zhongjian = tangible.StringFunctions.changeCharacter(zhongjian, i, beijianshu.charAt(i));
			}
			for (i = 0; i < changdu1; i++)
			{
				beijianshu = tangible.StringFunctions.changeCharacter(beijianshu, i, zhongjian.charAt(changdu1 - 1 - i));
				 if (beijianshu.charAt(i) == ' ')
				 {
					 beijianshu = tangible.StringFunctions.changeCharacter(beijianshu, i, '0');
				 }
			}
			for (i = 0; i < changdu2; i++)
			{
				zhongjian = tangible.StringFunctions.changeCharacter(zhongjian, i, jianshu.charAt(i));
			}
			for (i = 0; i < changdu2; i++)
			{
				 jianshu = tangible.StringFunctions.changeCharacter(jianshu, i, zhongjian.charAt(changdu2 - 1 - i));
				if (jianshu.charAt(i) == ' ')
				{
					jianshu = tangible.StringFunctions.changeCharacter(jianshu, i, '0');
				}
			}
			//?????
			 for (i = 0; i < changdu2; i++)
			 {
			   if (beijianshu.charAt(i) < jianshu.charAt(i))
			   {
					jieguo[i] = 10 - jianshu.charAt(i) + beijianshu.charAt(i);
					if (beijianshu.charAt(i + 1) != '0')
					{
						beijianshu.charAt(i + 1) -= 1;
					}
					else
					{
						j = i;
						 while (beijianshu.charAt(j + 1) == '0')
						 {
							 beijianshu = tangible.StringFunctions.changeCharacter(beijianshu, j + 1, '9');
							j = j + 1;
						 }
						beijianshu.charAt(j + 1) -= 1;
					}
			   }
				else
				{
					jieguo[i] = beijianshu.charAt(i) - jianshu.charAt(i);

				}
			 }
			for (i = changdu2; i < changdu1; i++)
			{
				jieguo[i] = beijianshu.charAt(i) - '0';
			}
			if (beijianshu.charAt(changdu1 - 1) == '0')
			{
				changdu1 -= 1;
			}
			for (i = changdu1 - 1; i >= 0; i--)
			{
				System.out.print(jieguo[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}


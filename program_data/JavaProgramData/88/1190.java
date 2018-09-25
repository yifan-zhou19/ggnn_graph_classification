import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************************************************
	//*?????????.cpp                                       *
	//*??????                                                 *
	//*?????2010?12?27?                                     *
	//*??????????                                         *
	//***************************************************************
	public static int Main()
	{
		String letter = new String(new char[31]);
		letter = new Scanner(System.in).nextLine(); //???????????
		int i = 0;
		int j = 0;
		int k = 0;
		char[][] temp = new char[30][30];
		for (i = 0;i < 31;i++)
		{
			if (letter.charAt(i) >= '0' && letter.charAt(i) <= '9') //?????????????
			{
				temp[k][j] = letter.charAt(i);
				j++; //?????
			}
			if ((letter.charAt(i) < '0' || letter.charAt(i)>'9') && (letter.charAt(i - 1) >= '0' && letter.charAt(i - 1) <= '9')) //??????????
			{
				temp[k][j] = '\0'; //?????????
				System.out.print(temp[k]);
				System.out.print("\n");
				k++; //k?????
				j = 0; //??
			}
		}
		return 0;
	}
}

import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*           ??????????????                    *
	//*                  ?????1000010573                     *
	//*                  ?????2010?11?                     *         
	//*************************************************************


	public static int Main()
	{
		int t = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		for (int r = 0 ; r < t + 1 ;r++)
		{

			String str = new String(new char[111]); //??????
			int[] count = new int[30]; //?????????????
			int L;
			int c;
			char z;
			str = new Scanner(System.in).nextLine(); //??????
			//?????????????count?? 
			L = str.length(); //????????????
			for (int i = 0 ; i < L ; i++)
			{
				c = str.charAt(i) - 'a';
				count[c]++;
			}
			for (int j = 0 ; j < L ; j++)
			{
				if (count[str.charAt(j) - 'a'] == 1)
				{
					z = str.charAt(j);
					System.out.print(z);
					System.out.print("\n");
					break;
				}
				if (j == L - 1)
				{
					System.out.print("no");
					System.out.print("\n");
					break;
				}
			}

		}
		return 0;
	}


}


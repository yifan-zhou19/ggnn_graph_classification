import java.util.*;

package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*?????????                           *
	//*?????????                           *
	//*?????                                   *
	//*???2010.11.17                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 


	public static int Main()
	{
		int n; //    ????n??????????????i,j,k;
		int i = 0;
		int j = 0;
		int k;
		String seline1 = new String(new char[101]); //    ???????
		String seline2 = new String(new char[101]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int an1[101], an2[101];
		int[] an1 = new int[101]; //    ???????
		int[] an2 = new int[101];
		int len1; //    len1,len2?????????
		int len2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		// cin.ignore();	//	???????
		for (k = 1; k <= n; k++)
		{
			for (j = 0; j < 101; j++)
			{
				seline1 = seline1.substring(0, j);
				seline2 = seline2.substring(0, j);
			}
			cin.ignore();
			seline1 = new Scanner(System.in).nextLine();
			seline2 = new Scanner(System.in).nextLine(); //    ???????

			//cout << endl;
			len1 = seline1.length();
			len2 = seline2.length(); //    ?????????

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an2, 0, (Integer.SIZE / Byte.SIZE)); //    ?????

			j = 0;
			for (i = len1 - 1; i >= 0; i--)
			{
				an1[j++] = seline1.charAt(i) - '0'; //    ????????????????
			}
			j = 0;
			for (i = len2 - 1; i >= 0; i--)
			{
				an2[j++] = seline2.charAt(i) - '0'; //    ???
			}
			for (i = 0; i <= len1 - 1; i++)
			{
				if (an1[i] >= an2[i])
				{
					an1[i] -= an2[i]; //    ?????????????????????
				}
				else
				{
					an1[i] = an1[i] - an2[i] + 10; //    ???????????
					an2[i + 1]++;
				}
			}
			i = 100;
			while (an1[i] == 0)
			{
				i--; //    ???????0???
			}
			for (; i >= 0; i--)
			{
				System.out.print(an1[i]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}


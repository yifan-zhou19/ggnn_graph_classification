import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ()pipei
	//
	//  Created by ? ?? on 13-12-4.
	//  Copyright (c) 2013? LEE. All rights reserved.
	//

	public static String s = new String(new char[10000]); //??????????????????
	public static int countl;
	public static int countr;
	public static int[] sum = new int[1000];
	//?????????????????????
	public static int pipei(int i)
	{

		if (s.charAt(i) == '\0')
		{
			return sum[i] = 0;
		}
		if (s.charAt(i) == '(')
		{
			++countl;
			pipei(i + 1);
			sum[i] += sum[i + 1];
			if (sum[i] > 0)
			{
				//????????????>0????
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				countl--;
				countr--;
				sum[i]--;
			}
			//??????1
			else
			{
				countl--;
				s = tangible.StringFunctions.changeCharacter(s, i, '$');
			} //????
			return 0;
		}

		else if (s.charAt(i) == ')')
		{
			countr++;
			sum[i]++;
		if (countl >= countr)
		{
				s = tangible.StringFunctions.changeCharacter(s, i, ' '); //????????
			pipei(i + 1);
			sum[i] += sum[i + 1]; //????????????????
				return 0;
		}
		else
		{
			countr--;
			s = tangible.StringFunctions.changeCharacter(s, i, '?');
			pipei(i + 1);
			sum[i] += sum[i + 1];
			return 0;
		}
			//????????�?�?????1????????
		}
		else //?????????
		{
			s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		  pipei(i + 1);
		sum[i] += sum[i + 1];
			return 0;
		}
		return 0;
	}

	public static int Main()
	{
		while (ConsoleInput.lastReadWasGood()) //?????????
		{
			s = new Scanner(System.in).nextLine(); //??????
			System.out.print(s);
			System.out.print("\n");
			pipei(0);
			System.out.print(s);
			System.out.print("\n");
			countl = countr = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(sum,0,(Integer.SIZE / Byte.SIZE));
			//???????????????0

		}

		return 0;
	}
}


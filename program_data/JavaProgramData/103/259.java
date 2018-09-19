import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		String string = new String(new char[1005]);
		char temp;
		String = new Scanner(System.in).nextLine();
		//cout<<string<<endl;
		int i;
		int length = String.length();
		int count = 0;
		for (i = 0;i < length;i++)
		{
			if (String[i] >= 'a' && string.charAt(i) <= 'z')
			{
				String[i] += ('A'-'a');
			}
		}
		for (i = 0;i < length;)
		{
			/*if(string[i]>='a'&&string[i]<='z')
				string[i]+=('A'-'a');
			if(string[i+1]>='a'&&string[i+1]<='z')
						string[i+1]+=('A'-'a');*/
			count = 1;
			temp = string.charAt(i);
			i++;
			while (String[i] == string.charAt(i - 1))
			{
				if (i == length)
				{
					break;
				}
				count++;
				i++;
			}
			System.out.print('(');
			System.out.print(temp);
			System.out.print(',');
			System.out.print(count);
			System.out.print(')');
		}


		return 0;
	}

}

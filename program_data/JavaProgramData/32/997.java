import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	* @file C8Q4.cpp
	* @author ???
	* @date 2013-11-17
	* @description
	* ??????:?????
	*/



	public static int Main()
	{
		String c1 = new String(new char[MAX]); //???
		String c2 = new String(new char[MAX]); //??
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0 ; i < n; i++)
		{
			System.in.read(); //????????
			c1 = new Scanner(System.in).nextLine();
			c2 = new Scanner(System.in).nextLine();

			int len1;
			int len2;
			len1 = c1.length();
			len2 = c2.length();

			int p1; //????????
			int p2;
			p2 = len2 - 1;
			p1 = len1 - 1;

			while (p2 >= 0)
			{
				c1.charAt(p1) -= c2.charAt(p2) - '0'; //????
				if (c1.charAt(p1) < '0') //????
				{
					for (int i = p1 - 1 ; i >= 0 ; i--) //??????
					{
						c1.charAt(i + 1) += 10;
						c1.charAt(i) -= 1;
						if (c1.charAt(i) >= '0') //????????
						{
							break;
						}
					}
				}
				p2--;
				p1--; //?????????
			}

			for (p1 = 0 ; p1 < len1 ; p1++) //?????0
			{
				if (c1.charAt(p1) != '0')
				{
					break;
				}
			}

			System.out.print(c1.Substring(p1));
			System.out.print("\n");
		}
	}

}


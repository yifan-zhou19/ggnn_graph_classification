package <missing>;

public class GlobalMembers
{
	/*????
	 *  Created on: 2012-12-10
	 *      Author: ??
	 */
	public static int Main()
	{
		int n; //?????????
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[40]); //??
		String p = a;
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sum = p.length();
		System.out.print(p);
		for (int i = 1; i < n; i++)
		{ //?????
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum += p.length(); //??
			if (sum > 79)
			{ //??
				System.out.print("\n");
				System.out.print(p);
				sum = p.length();
			}
			else
			{ //???
				System.out.print(' ');
				System.out.print(p);
				sum++;
			}
		}
		return 0;
	}

}


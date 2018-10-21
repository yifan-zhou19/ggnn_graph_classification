import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*??????
	 *?????zhizhen1.cpp
	 *Created on: 2012-12-19
	 *???????
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String p = new String(new char[5000]);
		p = new Scanner(System.in).nextLine(); //?????
		p = new Scanner(System.in).nextLine(); //??????
		char[][] m = new char[500][45];
		String h = new String(new char[45]);
		h = m;
		int i;
		int j;
		int k;
		for (i = 0, j = 0, k = 0; i < p.length(); i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				*(*(h.Substring(j)) + k) = *(p.Substring(i));
				k++;
			} //???????????
			else if (i != p.length() - 1)
			{
				j++;
				k = 0;
			}
		}

		int sum;
		int i1;
		for (sum = 0, i1 = 0; i1 < n; i1++)
		{
			sum = sum + String.valueOf(m[i1]).length();

			if ((sum + String.valueOf(m[i1 + 1]).length() + 1 <= 80) && (i1 != n - 1))
			{
				System.out.print((h.Substring(i1)));
				System.out.print(" ");
				sum++;
			} //????� �???
			else
			{
				System.out.print((h.Substring(i1)));
				System.out.print("\n");
				sum = 0;
			} //?????
		}

		return 0; //????
	}

}


import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String temp = new String(new char[101]);
		temp = new Scanner(System.in).nextLine();
		if (temp.length() == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(temp.charAt(0));
		}
		else
		{
			int[] number = new int[100];
			int remainder;
			for (int i = 0; i < temp.length(); i++)
			{
				number[i] = temp.charAt(i) - 48;
			}
			for (int i = 0; i < temp.length() - 1; i++)
			{
				number[i + 1] += number[i] % 13 * 10;
				number[i] /= 13;
			}
			remainder = number[temp.length() - 1] % 13;
			number[temp.length() - 1] /= 13;
			for (int i = 0; i < temp.length() - 1; i++)
			{
				if (number[i] == 0 && number[i + 1] != 0)
				{
					for (int j = i + 1; j < temp.length(); j++)
					{
						System.out.print(number[j]);
					}
					System.out.print("\n");
					break;
				}
				else if (i == temp.length() - 2)
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
			System.out.print(remainder);
		}
		return 0;
	}
}

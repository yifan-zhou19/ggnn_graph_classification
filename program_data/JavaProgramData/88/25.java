import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String temp = new String(new char[31]);
		String str = new String(new char[31]);
		int k = 0;
		int num = 0;
		int k10;
		str = new Scanner(System.in).nextLine();
		for (int i = 0; i < (Character.SIZE / Byte.SIZE); i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, str.charAt(i));
				k++;
			}
			else
			{
				if (str.charAt(i - 1) >= '0' && str.charAt(i - 1) <= '9')
				{
					k10 = 1;
					for (int j = k - 1; j >= 0; j--)
					{
						num += (temp.charAt(j) - '0') * k10;
						k10 *= 10;
					}
					System.out.print(num);
					System.out.print("\n");
					k = 0;
					num = 0;
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}


}


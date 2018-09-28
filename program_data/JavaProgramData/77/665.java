import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void paixu(char num[10000]);
		String num = new String(new char[10000]);
		num = new Scanner(System.in).nextLine();
		paixu(num);
		return 0;
	}
	public static void paixu(String num)
	{
		char boy;
		char girl;
		int i = 0;
		int j;
		int k;
		boy = num[0];
		while (!num[i].equals('\0'))
		{
			if (!num[i].equals(boy) && !num[i].equals(' '))
			{
				girl = num[i];
				break;
			}
			i++;
		}
		while (!num[i].equals('\0'))
		{
			if (!num[i].equals(boy))
			{
				for (j = i - 1;;j--)
				{
					if (!num[j].equals(' '))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						break;
					}
				}
				num[j] = ' ';
				num[i] = ' ';
				break;
			}
			i++;
		}
		if (!num[0].equals(' '))
		{
			paixu(num);
		}
	}
}

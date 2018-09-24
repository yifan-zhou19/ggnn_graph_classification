import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	???
	1200015101
	??????
	*/
	public static int lenth;
	public static int[] b = new int[200];
	public static String a = new String(new char[200]);
	public static void match(int n) //???n????????
	{
		for (int i = n - 1;i >= 0;i--)
		{
			if (b[i] == 1)
			{
				b[i] = 0;
				b[n] = 0;
				break;
			}
		}
	}
	public static int Main()
	{
		while (a = new Scanner(System.in).nextLine())
		{
			for (int i = 0;i < a.length();i++)
			{
				switch (a.charAt(i))
				{
				case '(':
					b[i] = 1;
					break;
				case ')':
					b[i] = 2;
					break;
				default :
					b[i] = 0;
				}
			} //??
			for (int i = 0;i < a.length();i++)
			{
				if (b[i] == 2)
				{
					match(i);
				}
			} //????
			for (int i = 0;i < a.length();i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (int i = 0;i < a.length();i++)
			{
				switch (b[i])
				{
				case 0:
					System.out.print(' ');
					break;
				case 1:
					System.out.print('$');
					break;
				case 2:
					System.out.print('?');
					break;
				} //??
			}
			System.out.print("\n");
		}
		return 0;
	}
}

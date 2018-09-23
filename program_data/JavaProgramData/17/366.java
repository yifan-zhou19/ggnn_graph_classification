import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int getlength(tangible.RefObject<String> a) //???????
	{
		int i = 0;
		while (a.argValue.charAt(i) != '\0')
		{
			i++;
		}
		return i;
	}
	public static void chuli(String ch, int[] a, int n) //???????????int???
	{
		for (int i = 0;i < n;i++)
		{
			switch (ch[i])
			{
			case '(':
				a[i] = 1;
				break;
			case ')':
				a[i] = -1;
				break;
			default :
				a[i] = 0;
				break;
			}
		}
	}
	public static void pipei(int[] a, int n) //????????
	{
		for (int k = 0;k < n;k++)
		{
			if (a[k] == 1)
			{
				int s = 0;
				for (int i = 0;i < k;i++)
				{
					s += a[i];
				}
				for (int i = k;i < n;i++)
				{
					if (a[i] == -1)
					{
						int t = 0;
						for (int j = 0;j < i;j++)
						{
							t += a[j];
						}
						if (s == t - 1) //????
						{
							a[k] = 0;
							a[i] = 0;
							break;
						} //??????0
					}
				}
			}
		}
	}
	public static int Main()
	{
		while (cin.peek() != EOF)
		{
			String ch = new String(new char[110]);
			ch = new Scanner(System.in).nextLine();
			int[] a = new int[110];
		tangible.RefObject<String> tempRef_ch = new tangible.RefObject<String>(ch);
			int n = getlength(tempRef_ch);
			ch = tempRef_ch.argValue;
			chuli(ch, a, n);
			pipei(a, n);
			System.out.print(ch);
			System.out.print("\n");
			for (int i = 0;i < n;i++) //??
			{
				switch (a[i])
				{
				case 1:
					System.out.print('$');
					break;
				case -1:
					System.out.print('?');
					break;
				case 0:
					System.out.print(' ');
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}


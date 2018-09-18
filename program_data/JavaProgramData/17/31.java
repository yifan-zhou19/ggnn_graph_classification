import java.util.*;

package <missing>;

public class GlobalMembers
{
	//3704:??????
	//2010?11?13?
	//1000012753 ???
	public static int Main()
	{
		String str = new String(new char[200]);
		int i;
		int j;
		int k;
		int ei;
		int bi;
		int l;
		while (str = new Scanner(System.in).nextLine())
		{
			int[] strout = new int[101];
			l = str.length();
			for (i = 0; i < l; i++)
			{
				if (str.charAt(i) == '(')
				{
					strout[i] = -1;
				}
				else if (str.charAt(i) == ')')
				{
					strout[i] = 1;
				}
			}
			for (i = 0; i < l; i++)
			{
				if (strout[i] != -1)
				{
					continue;
				}
				for (j = i + 1; j < l; j++)
				{
					if (strout[j] != 1)
					{
						continue;
					}
					for (k = j; k >= i; k--)
					{
						if (strout[k] == -1)
						{
							strout[k] = 0;
							strout[j] = 0;
							break;
						}
					}
				}
			}
			System.out.print(str);
			System.out.print("\n");
			bi = l - 1;
			ei = 0;
			for (i = 0; i < l; i++)
			{
				if (strout[i] != 0)
				{
					bi = i;
					break;
				}
			}
			for (i = l - 1; i >= 0; i--)
			{
				if (strout[i] != 0)
				{
					ei = i;
					break;
				}
			}

			for (i = bi; i <= ei; i++)
			{
				if (strout[i] == 0)
				{
					System.out.print(' ');
				}
				else if (strout[i] == -1)
				{
					System.out.print('$');
				}
				else
				{
					System.out.print('?');
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

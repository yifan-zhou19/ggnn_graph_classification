import java.util.*;

package <missing>;

public class GlobalMembers
{
	//3704:??????
	//2010?11?13?
	//1000012753 ???
	public static int Main()
	{
		String ch = new String(new char[200]);
		int[] a = new int[200];
		int n;
		int l;
		int i;
		int j;
		int m;
		while (ch = new Scanner(System.in).nextLine())
		{
			l = ch.length();
			for (i = 0; i < l; i++)
			{
				if (ch.charAt(i) == '(')
				{
					a[i] = -1;
				}
				else if (ch.charAt(i) == ')')
				{
					for (j = i - 1; j >= 0; j--)
					{
						if (a[j] == -1)
						{
							break;
						}
					}
					if (j != -1)
					{
						a[i] = 0;
						a[j] = 0;
					}
					else
					{
						a[i] = 1;
					}
				}
				else
				{
					a[i] = 0;
				}
			}
			n = 0;
			for (i = 0; i < l; i++)
			{
				if (a[i] != 0)
				{
					n++;
				}
			}
			m = n;
			i = 0;
			System.out.print(ch);
			System.out.print("\n");
			while (n > 0)
			{
				if (a[i] == -1)
				{
					System.out.print("$");
				}
				else if (a[i] == 1)
				{
					System.out.print("?");
				}
				else if (m != n)
				{
					System.out.print(" ");
				}
				if (a[i] != 0)
				{
					n--;
				}
				i++;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int i;
		int len;
		int[] mark1 = new int[110];
		int judge;
		int k = 0;
		int j;
		int k1 = 0;
		while (a = new Scanner(System.in).nextLine())
		{
			len = a.length();
			k = 0;
			for (i = 0;i < 110;i++)
			{
				mark1[i] = 0;
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(' || a.charAt(i) == ')')
				{
					if (k == 0)
					{
						if (a.charAt(i) == '(')
						{
							mark1[k]++;
						}
						else
						{
							mark1[k]--;
						}
						k++;
					}
					else
					{
						judge = 0;
						if (a.charAt(i) == '(')
						{
							mark1[k] = 1;
						}
						else if (a.charAt(i) == ')')
						{
							mark1[k] = -1;
						for (j = k - 1;j >= 0;j--)
						{
							if (mark1[j] == 1)
							{
								mark1[j] = 0;
								mark1[k] = 0;
								break;
							}
						}


						}

							k++;

					}
				}

			}
			k1 = 0;
	System.out.print(a);
	System.out.print("\n");
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					System.out.print(' ');
				}
				else
				{
					if (mark1[k1] == 0)
					{
						System.out.print(' ');
					}
					else if (mark1[k1] > 0)
					{
						System.out.print('$');
					}
					else
					{
						System.out.print('?');
					}
					k1++;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

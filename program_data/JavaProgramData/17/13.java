import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			String str = new String(new char[101]);
			int[] final = new int[101];
			str = new Scanner(System.in).nextLine();
			if (str.charAt(0) == '\0')
			{
				break;
			}
			int i = 0;
			int p = 0;
			int q = 0;
			int k = 0;
			int flag = 0;
			while (str.charAt(i) != '\0')
			{
				if (str.charAt(i) == '(')
				{
					final[i] = 1;
				}
				if (str.charAt(i) == ')')
				{
					final[i] = 2;
					for (int j = i;j >= 0;j--)
					{
						if (final[j] == 1)
						{
							final[i] = 0;
							final[j] = 0;
							break;
						}
					}
				}
				i++;
			}
			System.out.print(str);
			System.out.print("\n");
			while (str.charAt(k) != '\0')
			{
				if (final[k] == 1 || final[k] == 2)
				{
					p = k;
					if (flag == 0)
					{
						q = k;
						flag = 1;
					}
				}
				k++;
			}
			for (int j = q;j <= p;j++)
			{
				if (final[j] == 1)
				{
					System.out.print('$');
				}
				else if (final[j] == 2)
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int h;
		String c = new String(new char[102]);
		int[] a = new int[101];
		int[] b = new int[101];
		while ((c = new Scanner(System.in).nextLine()))
		{
			len = c.length();
			System.out.print(c);
			System.out.print("\n");
			h = 0;
			for (i = 0; i <= len; i++)
			{
				a[i] = -1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0; i <= len - 1; i++)
			{
				switch (c.charAt(i))
				{
					case '(':
					{
							h++;
							a[h] = i;
							break;
					}
					case ')':
					{
							if (h == 0)
							{
								b[i] = 2;
							}
							else
							{
								a[h] = 0;
								h--;
							}
							break;
					}
				}
			}
			for (i = 1; i <= h; i++)
			{
				if (a[i] != -1)
				{
					b[a[i]] = 1;
				}
			}
			for (i = 0; i <= len - 1; i++)
			{
				if (b[i] == 1)
				{
					System.out.print('$');
				}
				if (b[i] == 2)
				{
					System.out.print('?');
				}
				if (b[i] == 0)
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

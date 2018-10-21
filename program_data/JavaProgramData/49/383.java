import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int w;
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (i = 2; i <= len; i++)
		{
			if (i % 2 == 0)
			{
				for (j = 0;j <= len - i;j++)
				{
					for (w = 0;w < i / 2;w++)
					{
						if (a.charAt(j + w) != a.charAt(i + j - 1 - w))
						{
						break;
						}
					}
					if (w == i / 2)
					{
						for (k = 0; k < i;k++)
						{
							System.out.print(a.charAt(j + k));
						}
						System.out.print("\n");
					}
				}
			}
			else
			{
				for (j = 0;j <= len - i;j++)
				{
					for (w = 0;w < i / 2 - 1;w++)
					{
						if (a.charAt(j + w) != a.charAt(i + j - 1 - w))
						{
						break;
						}
					}
					if (w == i / 2)
					{
						for (k = 0; k < i; k++)
						{
							System.out.print(a.charAt(j + k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}





}

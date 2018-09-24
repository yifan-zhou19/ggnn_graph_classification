import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int p;
		int s;
		int count = 0;
		int len;
		len = a.length();
		for (i = 0;i < len - 1;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				System.out.print(a.charAt(i));
				System.out.print(a.charAt(i + 1));
				System.out.print("\n");
			}
		}
		for (i = 3;i <= len;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (i % 2 == 1)
				{
					k = (int)i / 2;
					if (j - k >= 0 && j + k < len)
					{
						for (s = 1;s <= k;s++)
						{
							if (a.charAt(j - s) == a.charAt(j + s))
							{
								count++;
							}
							else
							{
								break;
							}
						}
						if (count == k)
						{
							for (p = j - k;p < j + k;p++)
							{
								System.out.print(a.charAt(p));
							}
							System.out.print(a.charAt(j + k));
							System.out.print("\n");
						}
						count = 0;
					}
				}
				else if (i % 2 == 0)
				{
					k = (int)i / 2 - 1;
					if (j - k >= 0 && j + k + 1 < len)
					{
						if (a.charAt(j) == a.charAt(j + 1))
						{
							for (s = 1;s <= k;s++)
							{
								if (a.charAt(j - s) == a.charAt(j + 1 + s))
								{
									count++;
								}
								else
								{
									break;
								}
							}
							if (count == k)
							{
								for (p = j - k;p < j + k + 1;p++)
								{
									System.out.print(a.charAt(p));
								}
								System.out.print(a.charAt(j + k + 1));
								System.out.print("\n");
							}
						}
						count = 0;
					}
				}
			}
		}
		return 0;
	}
}

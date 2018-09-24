package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static int Main()
	{
		int len1;
		int len2;
		int[] c = new int[200];
		int p = 0;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < len2;i++)
			{
				for (j = 0;j < len1;j++)
				{
					if (b.charAt(i) == a.charAt(j) && c[j] == 0)
					{
						c[j] = 1;
						break;
					}
				}
			}
			for (i = 0;i < len1;i++)
			{
				if (c[i] == 0)
				{
					System.out.print("NO");
					System.out.print("\n");
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}
		return 0;
	}






}


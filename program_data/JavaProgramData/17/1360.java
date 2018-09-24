package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[101]);
		String t = new String(new char[101]);
		int[] s = new int[101];
		int k;
		int j;
		int len;
		int aa;

		while (gets(num))
		{
			t = num;
			len = num.length();
			for (k = 0;k < len;k++)
			{
				s[k] = 1;
			}
			for (k = 0;k < len;k++)
			{
				if (num.charAt(k) == ')')
				{
					for (j = k - 1;j >= 0;j--)
					{
						if (num.charAt(j) == '(')
						{
							s[j] = 0;
							s[k] = 0;
							num = num.substring(0, j);
							break;
						}
					}
				}
			}
			System.out.printf("%s\n",t);
			for (aa = 0;aa < len;aa++)
			{
				if (s[aa] == 1 && t.charAt(aa) == '(')
				{
					System.out.print("$");
				}
				else if (s[aa] == 1 && t.charAt(aa) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

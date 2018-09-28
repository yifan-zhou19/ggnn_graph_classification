package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int la;
		int lb;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		int[] c = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			la = a.length();
			lb = b.length();
			for (int i = la - 1,j = 1;i >= 0;i--)
			{
				a1[j++] = a.charAt(i) - '0';
			}
			for (int i = lb - 1,j = 1;i >= 0;i--)
			{
						b1[j++] = b.charAt(i) - '0';
			}
			for (int i = lb + 1;i <= la;i++)
			{
				b1[i] = 0;
			}
			int t = 0;
			for (int i = 1;i <= la;i++)
			{
				c[i] = a1[i] - b1[i] + t;
				if (c[i] < 0)
				{
					c[i] = c[i] + 10;
					t = -1;
				}
				else
				{
					t = 0;
				}
			}
			for (int i = la;i >= 1;i--)
			{
				if (c[i] != 0)
				{
					la = i;
					break;
				}
			}
			for (int i = la;i >= 1;i--)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
			n--;
		}
			return 0;
	}
}


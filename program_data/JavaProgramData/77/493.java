package <missing>;

public class GlobalMembers
{
	public static void out(String s, int[] a, char boy, int len)
	{
		int i;
		int k;
		if (len == 2)
		{
			System.out.print(a[0]);
			System.out.print(' ');
			System.out.print(a[1]);
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < len - 1;i++)
			{
				if (s[i].equals(boy) && !s[i + 1].equals(boy))
				{
					System.out.print(a[i]);
					System.out.print(' ');
					System.out.print(a[i + 1]);
					System.out.print("\n");
					for (k = i;k < len - 2;k++)
					{
						s[k] = s[k + 2];
						a[k] = a[k + 2];
					}
					out(s, a, boy, len - 2);
					break;
				}
			}
		}
		return;
	}
	public static int Main()
	{
		String s = new String(new char[100]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] a = new int[100];
		int i;
		int len = s.length();
		for (i = 0;i < 100;i++)
		{
			a[i] = i;
		}
		char boy = s.charAt(0);
		out(s, a, boy, len);
		return 0;
	}

}


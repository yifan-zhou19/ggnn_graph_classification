package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[101];
		int t;
		int n;
		int i;
		int j;
		String a = new String(new char[101]);
		while (gets(a))
		{
			for (i = 0;i < 101;i++)
			{
				b[i] = 0;
			}
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == '(')
				{
					t = -1;
					for (j = i + 1;j < n;j++)
					{
						if (a.charAt(j) == '(')
						{
							t--;
						}
						if (a.charAt(j) == ')')
						{
							t++;
						}
						if (t == 0)
						{
							break;
						}
					}
					if (t < 0)
					{
						b[i] = 1;
					}
				}
				if (a.charAt(i) == ')')
				{
					t = -1;
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							t++;
						}
						if (a.charAt(j) == ')')
						{
							t--;
						}
						if (t == 0)
						{
							break;
						}
					}
					if (t < 0)
					{
						b[i] = 2;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i < n;i++)
			{
			if (b[i] == 0)
			{
				System.out.print(" ");
			}
			if (b[i] == 1)
			{
				System.out.print("$");
			}
			if (b[i] == 2)
			{
				System.out.print("?");
			}
			}
			System.out.print("\n");
		}
	}


}

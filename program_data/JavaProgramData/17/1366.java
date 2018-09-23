package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int len; //0???????1??2?
		int[] a = new int[101];
		int i;
		int j;
		while (gets(c) != 0)
		{
			len = c.length();
			for (i = 0;i < len;i++)
			{
				if (c.charAt(i) == '(')
				{
					a[i] = 1;
				}
				else if (c.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a[j] == 1)
						{
							a[j] = 0;
							a[i] = 0;
							break;
						}
					}
					if (j < 0)
					{
						a[i] = 2;
					}
				}
				else
				{
					a[i] = 0;
				}
			}
			System.out.println(c);
			for (i = 0;i < len;i++)
			{
				if (a[i] == 0)
				{
					System.out.print(" ");
				}
				else if (a[i] == 1)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

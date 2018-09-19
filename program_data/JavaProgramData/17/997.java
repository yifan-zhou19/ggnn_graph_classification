package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		while (gets(a))
		{
			int n = a.length();
			int i = 0;
			int j;
			int[] b = new int[105];
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == '(')
				{
					b[i] = 1;
				}
				else if (a.charAt(i) == ')')
				{
					b[i] = -1;
				}
				else
				{
					b[i] = 0;
				}
			} //first step:change char a[] to int b[].
			for (i = 0;i < n;i++)
			{
				if (b[i] == -1)
				{
					for (j = i;j >= 0;j--)
					{
						if (b[j] == 1)
						{
							b[i] = 0;
							b[j] = 0;
							break;
						}
					}

				}
			}
			System.out.println(a);
			System.out.print("\n");
			for (i = 0;i < n;i++)
			{
				if (b[i] == 0)
				{
					System.out.print(" ");
				}
				else if (b[i] == 1)
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

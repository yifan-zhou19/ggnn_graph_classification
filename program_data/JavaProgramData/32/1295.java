package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a0 = new String(new char[110]);
		String b0 = new String(new char[110]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[110]={0},b[110]={0};
		int[] a = new int[110];
		int[] b = new int[110];
		for ((n;n >= 1;--n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a0 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b0 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i <= a0.length() - 1;++i)
			{
				a[i] = a0.charAt(i) - '0';
			}
			for (i = 0;i <= b0.length() - 1;++i)
			{
				b[i - b0.length() + a0.length()] = b0.charAt(i) - '0';
			}
			for (i = a0.length() - 1;i >= a0.length() - b0.length();--i)
			{
				if (a[i] >= b[i])
				{
					a[i] = a[i] - b[i];
				}
				else
				{
					for (j = i - 1;j >= 0;--j)
					{
						if (a[j] != 0)
						{
							a[j] = a[j] - 1;
							for (j = j + 1;j <= i - 1;++j)
							{
								a[j] = 9;
							}
							a[i] = 10 + a[i] - b[i];
							break;
						}
					}
				}
			}
			for (i = 0;i <= a0.length() - 1;++i)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int len;
		int count;
		int p;
		int t;
		int flag;
		int m;
		int sum = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (t = 0;t < len;t++)
		{
			if (str.charAt(t) != '\0')
			{
				for (i = 0;i < len;i++)
				{
					count = 0;
					if (str.charAt(i) == ' ')
					{
						flag = 1;
						for (p = i;p < len;p++)
						{
							if (str.charAt(p) == ' ')
							{
								flag *= 1;
								count += 1;
							}
							else
							{
								flag *= 0;
								break;
							}
						}
						if (count > 1)
						{
							for (m = 0;m < len;m++)
							{
								str = tangible.StringFunctions.changeCharacter(str, i + 1 + m, str.charAt(i + count + m));
							}
						}
					}

					if (count > 1)
					{
						sum += count - 1;
						break;
					}
				}
			}
		}
		for (i = 0;i < len - sum;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}


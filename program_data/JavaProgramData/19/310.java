package <missing>;

public class GlobalMembers
{
	public static int bijiao(int p, tangible.RefObject<String> a, int n, tangible.RefObject<String> b)
	{
		int i;
		int flag = 0;
		for (i = 0;i < n;i++)
		{
			if (a.argValue.charAt(p + i) != b.argValue.charAt(i))
			{
				return 0;
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		String str = new String(new char[1000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int len1;
		int len2;
		int len;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = str.length();
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len;i++)
		{
			if (i == 0)
			{
			tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
				if (bijiao(i, tempRef_str, len1, tempRef_a) == 1 && str.charAt(i + len1) == ' ')
				{
					a = tempRef_a.argValue;
					str = tempRef_str.argValue;
					System.out.printf("%s",b);
					i = i + len1 - 1;
				}
				else
				{
					a = tempRef_a.argValue;
					str = tempRef_str.argValue;
					System.out.printf("%c",str.charAt(i));
				}
			}
			else
			{
			tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str);
			tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
				if (bijiao(i, tempRef_str2, len1, tempRef_a2) == 1 && str.charAt(i + len1) == ' ' && str.charAt(i - 1) == ' ')
				{
					a = tempRef_a2.argValue;
					str = tempRef_str2.argValue;
					System.out.printf("%s",b);
					i = i + len1 - 1;
				}
				else
				{
					a = tempRef_a2.argValue;
					str = tempRef_str2.argValue;
				tangible.RefObject<String> tempRef_str3 = new tangible.RefObject<String>(str);
				tangible.RefObject<String> tempRef_a3 = new tangible.RefObject<String>(a);
					if (bijiao(i, tempRef_str3, len1, tempRef_a3) == 1 && i + len1 == len && str.charAt(i - 1) == ' ')
					{
						a = tempRef_a3.argValue;
						str = tempRef_str3.argValue;
						System.out.printf("%s",b);
						i = i + len1 - 1;
					}
					else
					{
						a = tempRef_a3.argValue;
						str = tempRef_str3.argValue;
						System.out.printf("%c",str.charAt(i));
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}


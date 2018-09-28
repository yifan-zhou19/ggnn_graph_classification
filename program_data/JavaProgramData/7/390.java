package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
		int a;
		int b;
		int c = 0;
		int m = 0;
		String string = new String(new char[257]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		String = new Scanner(System.in).nextLine();
		substring = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
		a = String.length();
		b = substring.length();
		for (i = 0;i < a;i++)
		{
			k = 0;
			if (String[i] == substring.charAt(0))
			{
				for (j = i;j < i + b;j++)
				{
					if (String[j] == substring.charAt(j - i))
					{
						k++;
					}
					else
					{
						break;
					}
				}
			}
			if (k == b)
			{
				break;
			}
			m = i + 1;
		}
		for (i = 0;i < a;i++)
		{
				if (i >= m != 0 && i < b + m)
				{
					System.out.printf("%c",replacement.charAt(i - m));
				}
				else
				{
					System.out.printf("%c",string.charAt(i));
				}
		}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
		int i;
		int j = 0;
		int t;
		str = new Scanner(System.in).nextLine();
		t = str.length();
		for (i = 0;i < t;i++)
		{
			if (str.charAt(i) > 'Z')
			{
				str.charAt(i) -= 32;
			}
		}
		for (i = 0;i < t;i++)
		{
			if (str.charAt(i) != str.charAt(i - 1))
			{
				for (j = i;j < t;j++)
				{
					if (str.charAt(j) != str.charAt(i))
					{
				break;
					}
				}
				System.out.printf("(%c,%d)",str.charAt(i),j - i);
			}
		}
		return 0;
	}
}

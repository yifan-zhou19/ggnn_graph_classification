package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[16]);
		String substr = new String(new char[4]);
		int i;
		int lenth;
		int maxAsc = 0;
		char maxChar = 0;
		while (scanf("%s%s",str,substr) == 2)
		{
			maxAsc = 0;
			maxChar = 0;
			lenth = str.length();
			for (i = 0;i < lenth;i++)
			{
				if (maxChar < *(str.Substring(i)))
				{
					maxChar = (str.Substring(i));
					maxAsc = i;
				}
			}
			str = str.substring(0, lenth + 3);
			for (i = lenth - 1;i > maxAsc;i--)
			{
				*(str.Substring(i) + 3) = *(str.Substring(i));
			}
			for (i = 0;i < 3;i++)
			{
				*(str.Substring(maxAsc) + i + 1) = *(substr.Substring(i));
			}
			System.out.printf("%s\n",str);
		}
	}

}

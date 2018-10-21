package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		char max = 0;
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		String p = str;
		String q = str;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i = 0;
			max = p;
			while (*(p.Substring(i)) != '\0')
			{
				if (*(p.Substring(i)) > max)
				{
					max = (p.Substring(i));
					q = p.Substring(i);
				}
				i++;
			}
			for (i = 11 - (q - p.Substring(1));i >= 1;i--)
			{
				*(q.Substring(i) + 3) = *(q.Substring(i));
			}
			for (i = 1;i <= 3;i++)
			{
				*(q.Substring(i)) = substr.charAt(i - 1);
			}
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}
}


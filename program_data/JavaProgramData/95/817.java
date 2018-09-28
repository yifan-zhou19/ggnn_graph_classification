package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int len1;
		int len2;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		void convert(char a[80],int length);
			convert(str1, len1);
			convert(str2, len2);
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
	}

	public static void convert(String a, int length)
	{
		int i;
		for (i = 0;i < length;i++)
		{
			if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			{
		a[i] = a[i].Substring(32);
			}
		}
	}
}

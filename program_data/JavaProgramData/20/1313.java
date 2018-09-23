package <missing>;

public class GlobalMembers
{
	public static int h(String a, String b)
	{
		char c;
		int len;
		int i = 0;
		int k = 0;
		len = a.length();
		c = a[0];
		while (i < len)
		{
			if (a[i].compareTo(c) > 0)
			{
				c = a[i];
				k = i;
			}
			i++;
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%c",a[i]);
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",b[i]);
		}
		for (i = k + 1;i < len;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");

		return 0;
	}
	public static int Main()
	{
		int h = new int(char a[],char b[]);
		String a = new String(new char[10]);
		String b = new String(new char[4]);
		char c;
		int i = 0;
		while (i < 10)
		{

			if (scanf("%s%s",a,b) == EOF)
			{
				break;
			}
			else
			{
				h(a, b);
			}
				i++;
		}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		String p;
		char max;
		String q;
		int i;
		int num = 0;
		int n;
		while (scanf("%s %s",str,substr) != EOF)
		{


			n = str.length();
			p = str;
		q = substr;
		max = p;
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) > max)
			{
				max = (p.Substring(i));
				num = i;
			}
		}
		for (i = 0;i < num + 1;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",*(q.Substring(i)));
		}
		for (i = num + 1;i < n;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		System.out.print("\n");
		}
	}
}

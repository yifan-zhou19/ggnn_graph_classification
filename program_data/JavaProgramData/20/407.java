package <missing>;

public class GlobalMembers
{
	public static void charu(String s1, int h, String s2, int k, String s3)
	{
		int i;
		int max = 0;
		char temp;
		for (i = 1;i < h;i++)
		{
			if (s1[i].compareTo(s1[max]) > 0)
			{
				max = i;
			}
		}
		for (i = 0;i <= max;i++)
		{
			s3[i] = s1[i];
		}
		for (i = max + 1;i <= max + k;i++)
		{
			s3[i] = s2[i - max - 1];
		}
		for (i = max + s2.length() + 1;i < h + k;i++)
		{
			s3[i] = s1[i - k];
		}
	}
	public static void Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		while (scanf("%s%s",a,b) != EOF)
		{
			int l;
			int n;
			final String c = "";
			l = a.length();
			n = b.length();
			charu(a, l, b, n, c);
			System.out.println(c);
		}
	}
}

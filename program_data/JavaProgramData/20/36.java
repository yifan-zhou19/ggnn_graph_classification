package <missing>;

public class GlobalMembers
{
	public static void str(String a, String b) //???????
	{
		int i;
		int l;
		int c = a[0];
		int k;
		l = a.length();
		for (i = 1;i < l;i++)
		{
			 if (c < a[i])
			 {
				c = a[i];
				k = i;
			 }
		}
		 for (i = 0;i < k + 1;i++)
		 {
			 System.out.printf("%c",a[i]);
		 }
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",b[i]);
		}
		for (i = k + 1;i < l;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[3]);
		while (scanf("%s%s",a,b) != EOF)
		{
			str(a, b);
		}
	}
}

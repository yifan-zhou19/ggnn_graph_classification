package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String sub = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		int n;
		int k;
		while (scanf("%s %s",str,sub) != EOF)
		{
			n = str.length();
			q = sub;
			k = 0;
			for (i = 1;i < n;i++)
			{
				if (str.charAt(i) > str.charAt(k))
				{
					k = i;
				}
			}
			for (p = str.Substring(n) + 2;p > str.Substring(k) + 3;p--)
			{
				*p = (p - 3);
			}
			*(str.Substring(k) + 1) = q;
			*(str.Substring(k) + 2) = *(q.Substring(1));
			*(str.Substring(k) + 3) = *(q.Substring(2));
			for (p = str;p < str.Substring(n) + 3;p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print("\n");

		}
	}
}

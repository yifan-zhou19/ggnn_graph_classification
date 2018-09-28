package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		char[][] str = new char[100][100];
		(char)(*p)[100];
		String temp = new String(new char[100]);
		p = str;
		for (i = 0;(scanf("%s",*(p + i))) != EOF;i++)
		{
			;
		}
		n = i;

		for (i = 0;i < (n / 2);i++)
		{
			temp = (p + i);
			*(p + i) = *(p + n - 1 - i);
			*(p + n - 1 - i) = temp;
		}
		for (i = 0;i < (n - 1);i++)
		{
			System.out.printf("%s ",*(p + i));
		}
		System.out.printf("%s",*(p + n - 1));

	}

}

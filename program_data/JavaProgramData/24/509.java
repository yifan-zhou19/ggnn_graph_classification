package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][30];
		int i;
		int count;
		int m = 0;
		for (i = 0;;i++)
		{
			if (scanf("%s",a[i]) == EOF)
			{
				count = i;
				break;
			}
		}
		for (i = 0;i < count;i++)
		{
			m = Math.max(String.valueOf(a[i]).length(),m);
		}
		for (i = 0;i < count;i++)
		{
			if (String.valueOf(a[i]).length() == m)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		for (i = 0;i < count;i++)
		{
			m = Math.min(String.valueOf(a[i]).length(),m);
		}
		for (i = 0;i < count;i++)
		{
			if (String.valueOf(a[i]).length() == m)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		System.out.print(10);
	}

}

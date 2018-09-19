package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void insert(char a[],char b[]);
		String a = new String(new char[10]);
		String b = new String(new char[3]);
		while ((scanf("%s %s",a,b)) != EOF)
		{
			insert(a, b);
		}
	}
	public static void insert(String a, String b)
	{
		int i;
		int j;
		int len;
		int max;
		len = a.length();
		max = a[0];
		for (i = 1;i < len;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				j = i;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%c",a[i]);
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",b[i]);
		}
		for (i = j + 1;i < len;i++)
		{
			System.out.printf("%c",a[i]);
		}
			System.out.print("\n");
	}


}

package <missing>;

public class GlobalMembers
{
	public static int seekmax(String a)
	{
		int k = 0;
		int i = 1;
		while (!a[i].equals('\0'))
		{
			if (a[i].compareTo(a[k]) > 0)
			{
				k = i;
			}
			i++;
		}
		return k;
	}
	public static void insert(String a, String b, int k)
	{
		int n;
		int i;
		n = a.length();
		for (i = n;i > k;i--)
		{
			a[i + 3] = a[i];
		}
		for (i = 1;i <= 3;i++)
		{
			a[k + i] = b[i - 1];
		}
		System.out.printf("%s\n",a);
	}
	public static void Main()
	{
		int i = 0;
		int j = 0;
		String a = new String(new char[15]);
		String b = new String(new char[4]);
		while (scanf("%s%s",a,b) != EOF)
		{
			insert(a, b, seekmax(a));
		}
	}

}

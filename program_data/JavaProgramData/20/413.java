package <missing>;

public class GlobalMembers
{
	public static int find(String c)
	{
		int i;
		int k;
		k = 0;
		i = 0;
		while (!c[i].equals('\0'))
		{
			if (c[i].compareTo(c[k]) > 0)
			{
				k = i;
			}
			i++;
		}
		return (k);
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int k;
		while (scanf("%s%s",a,b) != EOF)
		{
		k = find(a);
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.printf("%s",b);
		i = k + 1;
		while (a.charAt(i) != '\0')
		{
			System.out.printf("%c",a.charAt(i));
			i++;
		}
		System.out.print("\n");
		}
	}
}

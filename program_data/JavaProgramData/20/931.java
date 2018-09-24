package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		String a = new String(new char[13]);
		String b = new String(new char[5]);
		while (scanf("%s%s",a,b) != EOF)
		{
			int l = a.length();
			int k = 0;
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) > a.charAt(k))
				{
					k = j;
				}
			}
			j = 0;
			while (j <= k)
			{
				System.out.printf("%c",a.charAt(j));
				j++;
			}
			System.out.printf("%s",b);
			while (j > k && j < l)
			{
				System.out.printf("%c",a.charAt(j));
				j++;
			}
			System.out.print("\n");
		}
	}
}

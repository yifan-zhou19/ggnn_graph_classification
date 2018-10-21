package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j = 0;
		int k = 0;
		char a;
		final String b = "";
		while ((a = System.in.read()) != '\n')
		{
			if (a != ' ')
			{
				b.charAt(j)[k++] = a;
			}
			else
			{
				b.charAt(j)[++k] = '\0';
				j++;
				k = 0;
			}
		}
		for (k = j;k >= 0;k--)
		{
			System.out.printf("%s",b.charAt(k));
			if (k != 0)
			{
				System.out.print(' ');
			}
		}
	}


}

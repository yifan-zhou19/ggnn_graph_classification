package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[4000]);
		final String b = "";
		int i;
		int j = 0;
		int k = 0;
		int len;
		int max = 0;
		int min = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		b.charAt(j)[k++] = a.charAt(0);
		for (i = 1;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j++;
				k = 0;
			}
			else
			{
				b.charAt(j)[k++] = a.charAt(i);
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (String.valueOf(b.charAt(max)).length() < String.valueOf(b.charAt(i)).length())
			{
				max = i;
			}
			if (String.valueOf(b.charAt(min)).length() > String.valueOf(b.charAt(i)).length())
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s\n",b.charAt(max),b.charAt(min));
		return 0;
	}

}

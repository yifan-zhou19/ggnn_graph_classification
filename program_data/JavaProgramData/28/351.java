package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String p;
		int n;
		int i;
		int j;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				j = i;
				break;
			}
		}
		System.out.printf("%d",i);
		if (i < n)
		{
		for (i = j + 1;i <= n;i++)
		{
			if (*(p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0')
			{
				k = k + 1;
			}
			else
			{
				if ((*(p.Substring(i)) == ' ' || *(p.Substring(i)) == '\0') && *(p.Substring(i) - 1) != ' ')
				{
					System.out.printf(",%d",k);
				}
			k = 0;
			}
		}
		}
	}
}

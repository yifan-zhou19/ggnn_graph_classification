package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[3000]);
		int i;
		int j = 0;
		int k;
		String p;
		str = new Scanner(System.in).nextLine();
		p = str;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				j++;
				k = 0;
			}
			else if (k == 0)
			{
				System.out.printf("%d,",j);
				k = 1;
				j = 0;
			}
		}
		System.out.printf("%d\n",j);
	}
}

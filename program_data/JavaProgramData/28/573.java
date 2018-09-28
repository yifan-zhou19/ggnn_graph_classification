package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[5000]);
		String p = str;
		int k;
		int i;
		str = new Scanner(System.in).nextLine();
		for (k = 0,i = 0; * (p.Substring(i));i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				continue;
			}
			else
			{
				k++;
			if (*(p.Substring(i) + 1) == ' ' || *(p.Substring(i) + 1) == '\0')
			{
			 System.out.printf("%d%s",k,*(p.Substring(i) + 1) == '\0'?"\n":",");
			 k = 0;
			}
			}
		}
	}

}

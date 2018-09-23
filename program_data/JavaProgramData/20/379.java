package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String str = new String(new char[20]);
		String substr = new String(new char[10]);
		char max;
		int i;
		int n;
		int j;
		int max_index;
		while (scanf("%s %s",str,substr) != EOF)
		{
			n = str.length();
			String p;
			p = str.charAt(0);
			max = p;
			for (i = 0;i < n;i++)
			{
				if (*(p.Substring(i)) > max)
				{
					max = (p.Substring(i));
					max_index = i;
				}
			}
			for (i = 0;i <= max_index;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = max_index + 1;i < n;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
	}


}

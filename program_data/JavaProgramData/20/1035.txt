package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		int num = 0;
		int j;
		int h;
		while (scanf("%s%s",str,substr) != EOF)
		{
			int max = (int)str.charAt(0);
			int len = str.length();
			for (i = 1;i < len;i++)
			{
				if (max < str.charAt(i))
				{
					max = (int)str.charAt(i);
					num = i;
				}
			}
			for (j = 0;j <= num;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (h = num + 1;h < len;h++)
			{
				System.out.printf("%c",str.charAt(h));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

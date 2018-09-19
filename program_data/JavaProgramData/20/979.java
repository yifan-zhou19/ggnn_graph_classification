package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[5]);
		char max;
		int a;
		int b;
		int i;
		int flag;
		while (scanf("%s%s",str,substr) != EOF)
		{
			max = 0;
			a = str.length();
			b = substr.length();
			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
				}
			}
			flag = 1;
			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) < max)
				{
					System.out.printf("%c",str.charAt(i));
				}
				else
				{
					System.out.printf("%c",max);
					if (flag == 1)
					{
						System.out.printf("%s",substr);
					}
					flag = 0;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

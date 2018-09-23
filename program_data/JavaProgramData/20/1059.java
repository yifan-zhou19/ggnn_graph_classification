package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		char max;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		while (scanf("%s%s",a,b) != EOF)
		{
			max = a.charAt(0);
			for (j = 1;j < a.length();j++)
			{
				if (a.charAt(j) > max)
				{
					max = a.charAt(j);
				}
			}
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == max)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				c[j] = a.charAt(j);
			}
			for (j = i + 1;j < i + 4;j++)
			{
				c[j] = b.charAt(j - i - 1);
			}
			for (;j < (a.length() + b.length());j++)
			{
			c[j] = a.charAt(j - 3);
			}
			c[j] = '\0';
			System.out.printf("%s\n",c);

		}
	}

}

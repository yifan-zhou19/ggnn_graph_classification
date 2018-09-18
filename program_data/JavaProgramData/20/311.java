package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		String string = new String(new char[14]);
		char max;
		int n;
		int i;
		int j;
		while (scanf("%s %s",str,substr) != EOF)
		{
			max = str.charAt(0);
			n = 0;
			for (i = 1;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) > max)
				{
					n = i;
					max = str.charAt(i);
				}
			}
			for (i = 0;i <= n;i++)
			{
				String[i] = str.charAt(i);
			}
			for (i = n + 1;i <= n + 3;i++)
			{
				String[i] = substr.charAt(i - n - 1);
			}
			for (i = n + 4;str.charAt(i - 3) != '\0';i++)
			{
				String[i] = str.charAt(i - 3);
			}
			String[i] = '\0';
			System.out.printf("%s\n",String);
		}
	}




}

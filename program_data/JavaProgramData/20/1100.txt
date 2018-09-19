package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[4]);
		String string = new String(new char[12]);
		int i;
		int j = 0;
		int max;
		while (scanf("%s %s",String,str) != EOF)
		{
			max = 0;
			j = 0;
			for (i = 0;i < String.length();i++)
			{
				if (String[i] > string.charAt(max))
				{
					max = i;
				}
			}
				for (i = String.length();i >= max + 1;i--)
				{
					String[i + 3] = string.charAt(i);
				}
				for (i = max + 1;i < max + 4;i++,j++)
				{
					String[i] = str.charAt(j);
				}
				for (i = 0;string.charAt(i) != '\0';i++)
				{
					System.out.printf("%c",string.charAt(i));
				}
				System.out.print("\n");
		}
				return 0;
	}

}

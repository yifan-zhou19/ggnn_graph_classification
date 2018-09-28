package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int len;
		int i;
		int j;
		int k;
		int judge;
		fgets(a,500,stdin);
		len = a.length() - 1;
		for (i = 0;i < len;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, len - 1 - i, a.charAt(i));
		}
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				judge = 0;
				for (k = 0;k <= i - 1;k++)
				{
					judge = judge + (a.charAt(j + k) - b.charAt(len - i - j + k)) * (a.charAt(j + k) - b.charAt(len - i - j + k));
				}
				if (judge == 0)
				{
					for (k = 0;k <= i - 1;k++)
					{
						System.out.printf("%c",a.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}




		return 0;
	}

}


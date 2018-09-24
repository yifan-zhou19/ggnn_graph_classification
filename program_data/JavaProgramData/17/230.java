package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[A]);
		int i;
		int j;
		int n;
		while (scanf("%s",a) != EOF)
		{
			System.out.printf("%s\n",a);
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							  a = a.substring(0, j);
							  a = a.substring(0, i);
							  break;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print("$");
					continue;
				}
				if (a.charAt(i) == ')')
				{
					System.out.print("?");
					continue;
				}
				System.out.print(" ");

			}
			System.out.print("\n");
		}
		return 0;
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[SIZE]);
		String b = new String(new char[SIZE]);
		int maxi;
		int i;
		char max;
		while (scanf("%s %s",a,b) != EOF)
		{
			max = a.charAt(0);
			maxi = 0;
			for (i = 1; i < a.length(); i++)
			{
				if (a.charAt(i) > max)
				{
					maxi = i;
					max = a.charAt(i);
				}
			}

			for (i = 0; i <= maxi; i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = maxi + 1; i < a.length(); i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

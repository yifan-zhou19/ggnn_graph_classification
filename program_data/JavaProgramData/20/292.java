package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		int n;
		int i;
		int j;
		for (i = 0;i < 1000;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, new Scanner(System.in).nextLine());
			n = String.valueOf(a.charAt(i)).length();
			if (n == 0)
			{
				break;
			}
		}
		int k = i;
		int max;
		int p;
		for (i = 0;i < k;i++)
		{
			max = a.charAt(i)[0];
			p = 0;
			n = String.valueOf(a.charAt(i)).length();
			for (j = 0;j < n - 4;j++)
			{
				if (a.charAt(i)[j] > max)
				{
					max = a.charAt(i)[j];
					p = j;
				}
			}
			for (j = 0;j <= p;j++)
			{
				System.out.printf("%c",a.charAt(i)[j]);
			}
			System.out.printf("%c%c%c",a.charAt(i)[n - 3],a.charAt(i)[n - 2],a.charAt(i)[n - 1]);
			for (j = p + 1;j < n - 4;j++)
			{
				System.out.printf("%c",a.charAt(i)[j]);
			}
			System.out.print("\n");
		}
	}
}


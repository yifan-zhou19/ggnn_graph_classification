package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j = 1;
		int m;
		int n;
		final String ch = "";
		for (i = 1;i < 100;i++)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, i, System.in.read());
			if (ch.charAt(i) == ' ')
			{
				a[j] = i;
				j++;
			}
			if (ch.charAt(i) == '\n')
			{
				a[j] = i;
				m = i;
				n = j;
				break;
			}
		}
		for (j = n - 1;j >= 0;j--)
		{
			for (i = a[j] + 1;i < a[j + 1];i++)
			{
				System.out.print(ch.charAt(i));
			}
			if (j != 0)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}


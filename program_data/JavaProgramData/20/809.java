package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
	char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	char[] b = {0, '\0', '\0'};
	char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int i;
			int temp = 0;
			for (i = 0;i < 10;i++)
			{
				c[i] = a[i];
			}
			len = a.length();

			for (i = 0;i < len;i++)
			{
				if (a[temp] - a[i] < 0)
				{
			temp = i;
				}
			}
		for (i = 0;i <= temp;i++)
		{
			System.out.print(c[i]);
		}
		System.in.read();
		b = new Scanner(System.in).nextLine();
		System.out.print(b[0]);
		System.out.print(b[1]);
		System.out.print(b[2]);
		for (i = temp + 1;i < len;i++)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n;
		int i;

		a = new Scanner(System.in).nextLine();

		n = 0;

		for (i = 0;a[i] != '\0';i = i + 1)
		{
			n = n + 1;
		}

		for (i = n - 1;i >= 0;i = i - 1)
		{
			System.out.printf("%c",a[i]);
		}
	}
}

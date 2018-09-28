package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		int[] a = new int[512];
		int n;
		int i;
		int j = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i + 1) != ' ')
			{
				a[j] = a[j] + 1;
			}
			else if (str.charAt(i) != ' ' && str.charAt(i + 1) == ' ' || str.charAt(i) != ' ' && str.charAt(i + 1) == '\0')
			{
				a[j] = a[j] + 1;
				j = j + 1;
			}
		}
		n = j + 1;
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d",a[j]);
	}
}

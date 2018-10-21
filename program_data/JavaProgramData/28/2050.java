package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		int i;
		int n = 0;
		int[] a = new int[300];
		int m = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ' && zfc.charAt(i + 1) != '\0')
			{
				m += 1;
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
			{
				a[n] = m;
				n += 1;
				m = 0;
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) == ' ')
			{
				continue;
			}
			else if (zfc.charAt(i + 1) == '\0')
			{
				a[n] = m + 1;
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (i < n)
			{
			System.out.printf("%d,",a[i]);
			}
			else if (i == n)
			{
				System.out.printf("%d",a[n]);
			}
		}
		return 0;
	}


}

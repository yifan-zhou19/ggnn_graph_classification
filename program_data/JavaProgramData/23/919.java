package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String p = str;
		String[] a = new String[100];
		int i;
		int j;
		int k;
		p = new Scanner(System.in).nextLine();
		for (i = 0,j = 1; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				a[j] = p + (i + 1);
				*(p.Substring(i)) = '\0';
				j++;
			}
			a[0] = p.Substring(0);
		}
		for (k = j - 1;k > 0;k--)
		{
			System.out.printf("%s ",a[k]);
		}
		System.out.printf("%s",a[0]);

	}
}

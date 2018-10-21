package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[300];
		String b = new String(new char[10000]);
		b = new Scanner(System.in).nextLine();
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) != ' ')
			{
				k++;
			}
			if (b.charAt(i) == ' ' && k != 0)
			{
				a[j] = k;
				j++;
				k = 0;
			}
		}
		for (i--;b.charAt(i) != ' ' && i >= 0;i--)
		{
			a[j]++;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d\n",a[j]);
	}

}

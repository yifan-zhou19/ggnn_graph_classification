package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		final String q = " ";
		int i;
		int e = 0;
		int j = 0;
		int[] a = new int[300];
		int k = 0;
		s = new Scanner(System.in).nextLine();
		s += q;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				j++;
				e = 0;
			}
			else
			{
				e++;
				if (e == 1)
				{
					a[k] = j;
					k++;
				}
				j = 0;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[k - 1]);
		return 0;
	}
}

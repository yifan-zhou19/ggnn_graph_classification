package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ss = new String(new char[10000]);
		int len;
		int i;
		int k = 1;
		int[] a = new int[301];
		ss = new Scanner(System.in).nextLine();
		len = ss.length();
		a[1] = 0;
		for (i = 0;i < len;i++)
		{
			if (ss.charAt(i) == ' ' && ss.charAt(i + 1) != ' ')
			{
				k++;
				a[k] = 0;
			}
			if (ss.charAt(i) != ' ')
			{
			a[k]++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != k)
			{
				System.out.print(",");
			}
		}
	}

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int len;
		int k = 0;
		int[] a = new int[1000];
		int l;
		int i;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			a[i] = (k * 10 + s.charAt(i) - '0') / 13;
			k = (k * 10 + s.charAt(i) - '0') % 13;
		}
		l = 0;
		while (a[l] == 0 && l < len - 1)
		{
			l++;
		}
		for (i = l;i < len;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.printf("\n%d\n",k);
	}
}

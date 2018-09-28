package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s1 = "";
		final String s2 = "";
		final String sum = "";
		final String temp = "";
		int i;
		int j;
		int k;
		int r = 0;
		int len1;
		int len2;
		int[] a = new int[251];

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();


		len1 = s1.length();
		len2 = s2.length();
		k = len1 > len2 != 0?len1 - 1:len2 - 1;
		for (i = k;i >= 0;i--)
		{
			if (k == len1 - 1)
			{
			if (i - (k - len2 + 1) >= 0)
			{
			  a[i] = (s1.charAt(i - (k - len1 + 1)) - 48) + (s2.charAt(i - (k - len2 + 1)) - 48);
			}
			else
			{
				a[i] = s1.charAt(i - (k - len1 + 1)) - 48;
			}
			}
		   else
		   {
			if (i - (k - len1 + 1) >= 0)
			{
			  a[i] = (s1.charAt(i - (k - len1 + 1)) - 48) + (s2.charAt(i - (k - len2 + 1)) - 48);
			}
			else
			{
				a[i] = s2.charAt(i - (k - len2 + 1)) - 48;
			}
		   }
		}
		for (i = k;i >= 1;i--)
		{
			if (a[i] >= 10)
			{
			a[i - 1] += a[i] / 10;
			a[i] = a[i] % 10;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] != 0)
			{
			r = i;
			break;
			}
		}

		for (i = r;i <= k;i++)
		{
		System.out.printf("%d",a[i]);
		}
		System.out.print("\n");

	}
}

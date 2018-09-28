package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
		int[] a = new int[200];
		int len;
		int n;
		int i;
		int r = 0;
		int j;
		int max1 = 0;
		int max2 = 0;
		int p;
		s = new Scanner(System.in).nextLine();
		len = s.length();
			for (i = 0;i < len;i++)
			{
				if (s.charAt(i) == ',')
				{
					r++;
				}
				else
				{
					a[r] = a[r] * 10 + s.charAt(i) - '0';
				}
			}
			for (j = 0;j <= r;j++)
			{
				if (a[j] > max1)
				{
					max2 = max1;
					max1 = a[j];
				}
				if (a[j] < max1 && a[j]> max2)
				{
					max2 = a[j];
				}
			}
			for (i = 1;i <= r;i++)
			{
				if (a[i] != a[0])
				{
					break;
				}
			}
			if (i == r + 1)
			{
				p = 1;
			}
			if (r == 0)
			{
				System.out.print("No");
			}
			else if (p == 1)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",max2);
			}
	}
}

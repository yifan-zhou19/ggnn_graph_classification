package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		char z;
		int i;
		int j = 0;
		int k;
		int n;
		int[] a = new int[50];
		c = new Scanner(System.in).nextLine();
		n = c.length();
		z = c.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) == z)
			{
				a[j] = i;
				j++;
			}
			else
			{
				for (k = j - 1;k >= 0;k--)
				{
					 if (a[k] >= 0)
					 {
						 System.out.printf("%d %d\n",a[k],i);
						 a[k] = -1;
						 break;
					 }
				}
			}
		}
	}
}

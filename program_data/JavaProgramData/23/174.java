package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int i;
		int j = 1;
		int n;
		int[] a = new int[20];
		int k;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				a[j] = i;
			j++;
			}
		}
			a[0] = n;
			a[j] = -1;
			k = j;
			for (i = 0;i < k;i++)
			{
				for (j = a[i + 1] + 1;j < a[i];j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				if (i != k - 1)
				{
					System.out.print(" ");
				}
			}
	}

}

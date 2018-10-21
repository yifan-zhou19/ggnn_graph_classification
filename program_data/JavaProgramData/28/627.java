package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j = 0;
		int len;
		int word = 0;
		String str = new String(new char[3000]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ')
			{
				if (word == 1)
				{
					word = 0;
					j++;
				}
			}
			else
			{
				if (word == 0)
				{
					word = 1;
				}
				a[j]++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[j]);
	}
}

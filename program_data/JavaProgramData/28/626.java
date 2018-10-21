package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int word;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		String str = new String(new char[3000]);
		str = new Scanner(System.in).nextLine();
		k = str.length();
		j = 0;
		word = 0;
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
			if (str.charAt(i) != ' ')
			{
				if (word == 0)
				{
					word = 1;
				}
				a[j]++;
			}
			else
			{
				if (word != 0)
				{
					j++;
				}
				word = 0;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
}

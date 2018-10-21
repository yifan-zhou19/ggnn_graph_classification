package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[300];
		int k = 0;
		String s = new String(new char[1000000]);
		s = new Scanner(System.in).nextLine();
		i = 0;
		j = 0;
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != ' ')
			{
				j++;
				if ((s.charAt(i + 1) == ' ') || (s.charAt(i + 1) == '\0'))
				{
					a[k] = j;
					j = 0;
					k++;
				}
				i++;
			}
			else
			{
				i++;
			}
		}
		if (k == 2)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
	}
}

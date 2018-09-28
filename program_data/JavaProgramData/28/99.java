package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j = 0;
		int n;
		final String b = "";
		b = new Scanner(System.in).nextLine();
		i = 0;
		n = 0;
		while (b.charAt(i) != null)
		{
			if (i > 0 && b.charAt(i) == ' ' && b.charAt(i - 1) != ' ')
			{
				n++;
			}
			else if (b.charAt(i) == ' ')
			{
				i++;
				continue;
			}

			else
			{
				a[n]++;
			}
			i++;
		}
		j = 0;
		for (i = 0;i <= n;i++)
		{
			if (j == 0)
			{
				j = 1;
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}


}

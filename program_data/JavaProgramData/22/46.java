package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int z;
		int i;
		int j;
		int k;
		int temp;
		int[] a = new int[300];
		final String str = "";
		str = new Scanner(System.in).nextLine();
		z = str.length();
		j = 0;
		for (i = 0;i < z;i++)
		{
			if (str.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + str.charAt(i) - '0';
			}
			else
			{
				j++;
			}
		}
		if (j == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= j;i++)
			{
				for (k = i + 1;k <= j;k++)
				{
					if (a[i] < a[k])
					{
						temp = a[i];
						a[i] = a[k];
						a[k] = temp;
					}
				}
			}
			if (a[0] == a[j])
			{
				System.out.print("No");
			}
			else
			{
				z = a[0];
				i = 0;
				do
				{
					i++;
				} while (a[i] == z);
					System.out.printf("%d",a[i]);
			}
		}






	}
}

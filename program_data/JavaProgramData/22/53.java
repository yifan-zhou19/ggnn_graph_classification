package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j = 0;
		int[] a = new int[300];
		int t;
		String c = new String(new char[1800]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + c.charAt(i) - 48;
			}
			if (c.charAt(i) == ',')
			{
				j = j + 1;
			}
		}
		for (i = 0;i <= j;i++)
		{
			for (k = i + 1;k <= j;k++)
			{
				if (a[i] <= a[k])
				{
					t = a[i];
					a[i] = a[k];
					a[k] = t;
				}
			}
		}
		t = 0;
		for (i = 0;i <= j;i++)
		{
			if (a[i] != a[0])
			{
				System.out.printf("%d",a[i]);
				break;
			}
			else
			{
				t = t + 1;
			}
		}
		if (t == j + 1)
		{
			System.out.print("No");
		}
	}









}

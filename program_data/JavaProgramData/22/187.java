package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int r = 0;
		int t;
		int p = 1;
		String s = new String(new char[10000]);

		s = new Scanner(System.in).nextLine();

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ',')
			{
			a[r] = a[r] * 10 + s.charAt(i) - 48;
			}
			else if (s.charAt(i) == ',')
			{
				r++;
			}
		}

		for (i = 0;i < r + 1;i++)
		{
			for (j = 0;j < r;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;

				}

			}
		}


		if (r == 1 || a[0] == a[r])
		{
			System.out.print("No");
		}
		else
		{

			for (p = 1;p < r;p++)
			{
				if (a[0] != a[p])
				{
					break;
				}
			}

			System.out.printf("%d",a[p]);
		}


	}
}

package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x > y)
		{
			return (x);
		}
		else
		{
			return (y);
		}
	}

	public static int min(int x,int y)
	{
		if (x < y)
		{
			return (x);
		}
		else
		{
			return (y);
		}
	}

	public static void Main()
	{
		String c = new String(new char[1000]);
		int[] a = new int[50];
		int[] b = new int[50];
		int i;
		int j;
		int n;
		int k = 0;
		int MAX;
		int MIN;
		c = new Scanner(System.in).nextLine();
		n = c.length();

		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) == ' ')
			{
				a[k] = i;
				k++;
			}
		}

		b[0] = a[0];
		a[k] = n;

		for (i = 1;i <= k;i++)
		{
			b[i] = a[i] - a[i - 1] - 1;
		}

		MAX = MIN = b[0];
		for (i = 0;i <= k;i++)
		{
			MAX = max(MAX, b[i]);
		MIN = min(MIN, b[i]);
		}

		for (i = 0;i <= k;i++)
		{
			if (b[i] == MAX)
			{

			for (j = a[i] - b[i];j < a[i];j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
			break;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (b[i] == MIN)
			{

			for (j = a[i] - b[i];j < a[i];j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
			break;
			}
		}
	}








}

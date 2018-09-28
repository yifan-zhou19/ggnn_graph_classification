package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[400]);
		int[] a = new int[50];
		int i;
		int t = 0;
		int n = 0;
		int[] b = new int[50];
		int max = 0;
		int min = 100000;
		int x1;
		int x2;
		int y1;
		int y2;
		int l;
		int x;
		int y;
		String = new Scanner(System.in).nextLine();
		for (i = 0;string.charAt(i) != '\0';i++)
		{
			if (String[i] == ' ')
			{
				a[t] = i;
				t++;
			}
		}
		for (i = 0;string.charAt(i) != '\0';i++)
		{
			if (String[i] == ' ')
			{
				n++;
			}
		}
		l = String.length();
		b[0] = a[0] + 1;
		b[n] = l - a[n - 1];
		for (i = 1;i < n;i++)
		{
			b[i] = a[i] - a[i - 1];
		}
		for (i = 0;i <= n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (b[i] == max)
			{
				x = i;
			if (x == n)
			{
				x1 = a[i - 1];
				y1 = l;
			}
			else
			{
				x1 = a[i - 1];
			y1 = a[i];
			}
			break;
			}
		}
		if (x1 == 0)
		{
		for (i = x1;i <= y1 - 1;i++)
		{
			System.out.printf("%c",string.charAt(i));
		}
		}
		else
		{
			for (i = x1 + 1;i < y1;i++)
			{
				System.out.printf("%c",string.charAt(i));
			}
		}
		System.out.print("\n");
		for (i = 0;i <= n;i++)
		{
			if (b[i] < min)
			{
				min = b[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (b[i] == min)
			{
				y = i;
			if (y == n)
			{
				x2 = a[i - 1];
				y2 = l;
			}
			else
			{
				 x2 = a[i - 1];
			y2 = a[i];
			}
			break;
			}
		}
		if (x2 == 0)
		{
		for (i = x2;i <= y2 - 1;i++)
		{
			System.out.printf("%c",string.charAt(i));
		}
		}
		else
		{
		for (i = x2 + 1;i <= y2 - 1;i++)
		{
		System.out.printf("%c",string.charAt(i));
		}
		}
	}


}

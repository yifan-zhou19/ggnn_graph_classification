package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k = 1;
		int mid;
		int[] b = new int[60];
		int[] c = new int[60];
		int[] d = new int[60];
		b[0] = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[k] = i;
				k++;
			}
		}
		b[k] = a.length();
		c[0] = b[1] - b[0];
		for (i = 1;i < k;i++)
		{
			c[i] = b[i + 1] - b[i] - 1;
		}
		for (i = 0;i < k;i++)
		{
			d[i] = c[i];
		}
		for (i = 0;i < k - 1;i++)
		{
		for (j = 0;j < k - 1 - i;j++)
		{
			if (c[j] > c[j + 1])
			{
				mid = c[j];
				c[j] = c[j + 1];
				c[j + 1] = mid;
			}
		}
		}
		if (d[0] == c[k - 1])
		{
			for (i = 0;i < b[1];i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		else
		{
			for (i = 1;i < k;i++)
			{
				if (d[i] == c[k - 1])
				{
					for (j = b[i] + 1;j < b[i + 1];j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					break;
				}
			}
		}
		System.out.print("\n");
		if (d[0] == c[0])
		{
			for (i = 0;i < b[1];i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
		}
		else
		{
			for (i = 1;i < k;i++)
			{
				if (d[i] == c[0])
				{
					for (j = b[i] + 1;j < b[i + 1];j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					break;
				}
			}
		}
	}


}

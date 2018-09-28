package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[500]);
		int i;
		int j = 1;
		int n;
		int k;
		int t;
		int[] num = new int[50];
		int[] a = new int[50];
		int[] b = new int[500];
		char c;
		str = new Scanner(System.in).nextLine();
		for (i = 0;(c = str.charAt(i)) != '\0';i++)
		{
			if (c == ' ')
			{
			num[0] = i;
			b[0] = i;
			break;
			}
		}
		for (i = b[0] + 1;(c = str.charAt(i)) != '\0';i++)
		{
			if (c == ' ')
			{
				num[j] = i - b[j - 1] - 1;
				b[j] = i;
				j++;
			}
		}
		for (i = b[j - 1] + 1;i < 500;i++)
		{
			if ((c = str.charAt(i)) == '\0')
			{
				b[j] = i;
				num[j] = b[j] - b[j - 1] - 1;
				break;
			}
		}
		n = j + 1;
		for (i = 0;i < n;i++)
		{
			a[i] = num[i];
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] == a[n - 1] && i != 0)
			{
				for (k = b[i - 1] + 1;k < b[i];k++)
				{
			System.out.printf("%c",str.charAt(k));
				}
		break;
			}
			if (num[i] == a[n - 1] && i == 0)
			{
				for (k = 0;k < b[i];k++)
				{
			System.out.printf("%c",str.charAt(k));
				}
		break;
			}

		}
			 System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			if (num[i] == a[0] && i != 0)
			{
				for (k = b[i - 1] + 1;k < b[i];k++)
				{
			System.out.printf("%c",str.charAt(k));
				}
		break;
			}
			if (num[i] == a[0] && i == 0)
			{
				for (k = 0;k < b[i];k++)
				{
			System.out.printf("%c",str.charAt(k));
				}
		break;
			}

		}
		System.out.print("\n");
	}
}

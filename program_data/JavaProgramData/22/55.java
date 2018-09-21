package <missing>;

public class GlobalMembers
{
	public static int MAX(int[] a, int k)
	{
		int i;
		int j;
		int max = 0;
		for (i = 0;i < k;i++)
		{
			if (a[i] > max)
			{
			j = i;
			max = a[i];
			}
		}
		return (max);
	}
	public static int nexttomax(int[] a, int k, int m)
	{
		int i;
		int j;
		int max = 0;
		for (i = 0;i < k;i++)
		{
			if ((a[i] > max) && (a[i] != m))
			{
			j = i;
			max = a[i];
			}
		}
		return (max);
	}
	public static int check(int x)
	{
		int i;
		int p = 1;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				p = 0;
				break;
			}
		}
		return (p);
	}
	public static int checkstr(int[] a, int k)
	{
		int i;
		int p = 0;
		for (i = 1;i < k;i++)
		{
		if (a[i] != a[0])
		{
			p = 1;
			break;
		}
		}
		return (p);
	}
	public static int tongji(String str)
	{
		int i = 0;
		int count = 0;
		while (!str[i].equals('\0'))
		{
			if (str[i].equals(','))
			{
				count++;
			}
		i++;
		}
		return (count);
	}
	public static int convertor(String str, int start, int end)
	{
		int i;
		int r = str[start] - '0';
		for (i = start + 1;i < end;i++)
		{
		r = r * 10 + (str[i] - '0');
		}
		return (r);
	}
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int n;
		int flag = 1;
		int fw;
		String str = new String(new char[N]);
		int[] num = new int[300];
		str = new Scanner(System.in).nextLine();
		n = tongji(str) + 1;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < str.length();i++)
			{
		if (str.charAt(i) == ',')
		{
				num[k++] = convertor(str, j, i);
			j = i + 1;
		}
			}
			num[k++] = convertor(str, j, i);
		if (checkstr(num, k) == 0 && n != 1)
		{
			System.out.print("No");
		}
		else
		{
			fw = MAX(num, k);
		System.out.printf("%d",nexttomax(num, k, fw));
		}
		}
	}
}

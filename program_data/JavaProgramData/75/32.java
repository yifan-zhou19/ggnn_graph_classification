package <missing>;

public class GlobalMembers
{
	public static int convert(String s, int[] result)
	{
		int value;
		int len;
		int num = 0;
		int k = 0;
		len = s.length();
		s[len] = '\0';
		while (k < len)
		{
			value = 0;
			while ((!s[k].equals(',')) && (!s[k].equals('\0')))
			{
				value = value * 10 + s[k++] - '0';
			}
			result[num++] = value;
			k = k + 1;
		}
		return (num);
	}
	public static void f(int[] x, int[] y, int[] num, int total)
	{
		int i;
		int j;
		for (i = 0;i < total;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				num[j] = num[j] + 1;
			}
		}
	}
	public static void Main()
	{
		int[] num = new int[1000];
		int[] x = new int[1000];
		int[] y = new int[1000];
		String s1 = new String(new char[10000]);
		String s2 = new String(new char[10000]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int total;
		total = convert(s1, x);
		total = convert(s2, y);
		f(x, y, num, total);
		int max = num[0];
		int i;
		for (i = 0;i < 1000;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.printf("%d %d",total,max);
	}
}

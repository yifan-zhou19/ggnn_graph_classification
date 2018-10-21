package <missing>;

public class GlobalMembers
{
	public static int series(int[] a)
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int temp = 0;
		int num = 0;
		int i;
		int p = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ',')
			{
				a[num++] = temp;
				temp = 0;
			}
			else
			{
				temp = temp * 10 + s.charAt(i) - '0';
			}
		}
		a[num++] = temp;
		return (num);
	}
	public static int find_second(int[] a, int num)
	{
		int max;
		int sec;
		int i;
		max = 0,sec = 0;
		for (i = 0;i < num;i++)
		{
			if (a[i] > max)
			{
				sec = max;
				max = a[i];
			}
			else if (a[i] > sec && a[i] < max)
			{
				sec = a[i];
			}
		}
		if (max == sec)
		{
			return 0;
		}
		else
		{
			return (sec);
		}
	}


	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int sec;
		n = series(a);
		sec = find_second(a, n);
		if (sec != 0)
		{
		System.out.printf("%d\n",sec);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

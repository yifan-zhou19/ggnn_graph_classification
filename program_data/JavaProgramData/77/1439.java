package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void row(char x[],int num[],int l,char a,char b);
		char a;
		char b;
		int l;
		int m;
		int n;
		int t;
		int i;
		int q;
		int[] num = new int[101];
		String x = new String(new char[101]);
		x = new Scanner(System.in).nextLine();
		l = x.length();
		a = x.charAt(0);
		b = x.charAt(l - 1);
		row(x, num, l, a, b);
		for (m = 0;m < l - 1;m = m + 2)
		{
			for (n = 0;n < l - 4 - m;n = n + 2)
			{
				if (num[n + 1] > num[n + 3])
				{
					t = num[n + 1];
					num[n + 1] = num[n + 3];
					num[n + 3] = t;
					q = num[n];
					num[n] = num[n + 2];
					num[n + 2] = q;
				}
			}
		}
		for (i = 0;i < l - 1;i = i + 2)
		{
			System.out.printf("%d %d\n",num[i],num[i + 1]);
		}
	}

	public static void row(String x, int[] num, int l, char a, char b)
	{
		int i;
		int j;
		int t = 0;
		int count = 0;
		int flag = 0;
		for (;count < l / 2;)
		{
		for (i = 0;i < l;i++)
		{
			if (!x[i].equals(a))
			{
				continue;
			}
			for (j = i + 1,flag = 0;j < l;j++)
			{
				if (x[j].equals(a))
				{
					flag++;
				}
				if (x[j].equals(b) && flag == 0)
				{
					num[t] = i;
					num[t + 1] = j;
					x[i] = 32;
					x[j] = 32;
					count++;
					t = t + 2;
					break;
				}
			}
		}
		}
	}
}

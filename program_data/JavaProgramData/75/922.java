package <missing>;

public class GlobalMembers
{
	public static int deal(String a, int[] ans)
	{
		int i;
		int j = 0;
		ans[0] = 0;
		for (i = 0;;i++)
		{
			if (a[i].equals('\0'))
			{
				break;
			}
			if (a[i].equals(','))
			{
				j++;
				ans[j] = 0;
			}
			else
			{
				ans[j] = ans[j] * 10 + a[i] - '0';
			}
		}
		return j + 1;
	}
	public static void Main()
	{
		String a = new String(new char[4000]);
		String b = new String(new char[4000]);
		int[] aa = new int[1000];
		int[] bb = new int[1000];
		int[] t = new int[1000];
		int i;
		int j;
		int max = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{
			t[i] = 0;
		}
		deal(a, aa);
		n = deal(b, bb);
		for (i = 0;i < n;i++)
		{
			for (j = aa[i];j < bb[i];j++)
			{
				t[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d",n,max);
	}
}

package <missing>;

public class GlobalMembers
{
	public static int[][] b = new int[100][2];
	public static int count = 0;

	public static void deal(String a, int[] num, int n)
	{
		int i;
		int j;
		if (n != 0)
		{
		char mid;
		mid = a[0];
		for (i = 0;i < n - 1;i++)
		{
			if (a[i].equals(mid) && !a[i + 1].equals(mid))
			{
				b[count][0] = num[i];
				b[count][1] = num[i + 1];
				break;
			}
		}
		for (j = i + 2;j < n;j++)
		{
			a[j - 2] = a[j];
			num[j - 2] = num[j];
		}
		count++;
		deal(a, num, n - 2);
		}
	}

	public static void Main()
	{
		char m;
		String ar = new String(new char[100]);
		int i;
		int n;
		int[] num = new int[100];

		ar = new Scanner(System.in).nextLine();
		m = ar.charAt(0);
		n = ar.length();
		for (i = 0;i < n;i++)
		{
			num[i] = i;
		}

		deal(ar, num, n);

		for (i = 0;i < n / 2;i++)
		{
			System.out.printf("%d %d\n",b[i][0],b[i][1]);
		}
	}




}

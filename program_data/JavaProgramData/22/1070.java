package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int[] a = new int[1000];
		int i = 0;
		int k = 0;
		int t = 0;
		int temp;
		int flag;
		int j;
		int p;
		s = new Scanner(System.in).nextLine();
		do
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				flag = 0;
				t = 10 * t + s.charAt(i) - '0';
			}
			else
			{
				if (flag == 0)
				{
					a[k++] = t;
					t = 0;
				}
			}
			i++;
		}while (s.charAt(i - 1) != '\0');
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = 0;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			p = i;
			for (j = i;j < k;j++)
			{
				if (a[p] < a[j])
				{
					temp = a[p];
					a[p] = a[j];
					a[j] = temp;
				}
			}
		}
		if (a[1] == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[1]);
		}
		return 0;
	}
}

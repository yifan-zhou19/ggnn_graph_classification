package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char[][] c = new char[100][100];
		int[] a = new int[100];
		int[] e = new int[100];
		int[] b = new int[100];
		int k;
		int sig = 0;
		int n;
		int i;
		int j;
		int sum = 0;
		int mid;
		int temp;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 1,e[1] = 0,k = 0;i < n;i++,k++)
		{
			for (j = 1;;j++,k++)
			{
				if (s.charAt(k) != 32 && s.charAt(k) != '\0')
				{

					c[i][j] = s.charAt(k);
				}
				else if (s.charAt(k) == 32)
				{
					a[i] = j - 1; //?i????????/
					break;
				}
				else
				{
					a[i] = j - 1;
					  sig = 1;
					break;
				}
			}
			if (i != 1)
			{
			e[i] = e[i - 1] + a[i - 1] + 1; //?i?????????s???e[i]????/
			}
			if (sig == 1)
			{
			break;
			}
		}
			sum = i; //?????????sum/

		for (i = 1;i <= sum;i++)
		{
			b[i] = i;
		}

		for (i = 1;i < sum;i++)
		{
			if (a[i] >= a[i + 1])
			{
				mid = a[i];
				a[i] = a[i + 1];
				a[i + 1] = mid;
				temp = b[i];
				b[i] = b[i + 1];
				b[i + 1] = temp;
			}
		}
		i = b[sum];
		for (k = e[i];k <= e[i] + a[sum] - 1;k++)
		{
				System.out.printf("%c",s.charAt(k));
		}
		System.out.print("\n");
		for (i = sum;i > 0;i--)
		{
			if (a[i] < a[i - 1])
			{
				mid = a[i];
				a[i] = a[i - 1];
				a[i - 1] = mid;
				temp = b[i];
				b[i] = b[i - 1];
				b[i - 1] = temp;
			}
		}
		i = b[1];
		k = e[i];
		System.out.printf("%c",s.charAt(k));
		for (k = e[i] + 1;k <= e[i] + a[1] - 1;k++)
		{
				System.out.printf("%c",s.charAt(k));
		}


	}


}

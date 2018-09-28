package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String x = new String(new char[3000]);
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
		int A;
		int B;
		int[] c = new int[300];
		x = new Scanner(System.in).nextLine();
		n = x.length();
		a[1] = 0;
		A = 1;
		B = 0;
		for (i = 0;i < n;i++)
		{
			if ((x.charAt(i) != ' ') && (x.charAt(i - 1) == ' '))
			{
				A = A + 1;
				a[A] = i;
			}
			if (((x.charAt(i) != ' ') && (x.charAt(i + 1) == ' ')) || (x.charAt(i + 1) == '\0'))
			{
				B = B + 1;
				b[B] = i;
				c[B] = b[B] - a[A] + 1;
			}
		}
		for (i = 1;i < B;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[B]);
	}
}

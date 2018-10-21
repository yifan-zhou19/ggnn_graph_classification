package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String p;
		int i;
		int j = 1;
		int k;
		int[] b = new int[51];
		int[] c = new int[50];
		a = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j] = i;
				j++;
			}
			if (a.charAt(i) == '\0')
			{
				k = i;
				b[j] = i;
				break;
			}
		}
		b[0] = -1;
		for (i = 0;i < j;i++)
		{
			c[i] = b[i + 1] - b[i] - 1;
		}
		int m = 0;
		int m1 = 0;
		int n = c[0];
		int n1 = 0;
		for (i = 0;i < j;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
				m1 = i;
			}
			if (c[i] < n)
			{
				n = c[i];
				n1 = i;
			}
		}
		for (i = b[m1] + 1;i < b[m1 + 1];i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		for (i = b[n1] + 1;i < b[n1 + 1];i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

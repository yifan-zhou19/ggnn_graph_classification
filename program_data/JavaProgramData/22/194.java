package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i;
		int j = 0;
		int total = 0;
		int m;
		int n;
		int[] b = new int[300];
		int l;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				m = a.charAt(i) - 48;
				b[j] = b[j] * 10 + m;
			if (a.charAt(i + 1) == ',' || a.charAt(i + 1) == '\0')
			{
				j++;
				total++;
			}
			}
		}


			for (i = 1;i < total;i++)
			{
			for (j = 0;j < total - i;j++)
			{
			if (b[j] < b[j + 1])
			{
				n = b[j];
				b[j] = b[j + 1];
				b[j + 1] = n;
			}
			}
			}

			for (j = 1;j < total;j++)
			{
			if (b[j] < b[0])
			{
				System.out.printf("%d\n",b[j]);
				break;
			}
			}


			if (b[0] == b[total - 1])
			{
			System.out.print("No");
			}

	}


}

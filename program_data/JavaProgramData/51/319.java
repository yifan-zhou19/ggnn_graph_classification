package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int t;
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		p = a.length();
		char[][] b = new char[500][500];
		int[] num = new int[500];
		int[] mark = new int[500];
		for (i = 0;i < 500;i++)
		{
			mark[i] = i;
			num[i] = 0;
		}
		for (i = 0;i < p - n + 1;i++)
		{
			for (j = i;j < i + n;j++)
			{
				b[i][j - i] = a.charAt(j);
			}
			b[i][j - i] = '\0';
		}

		for (i = 0;i < p - n;i++)
		{
		for (j = i + 1;j < p - n + 1;j++)
		{
			if (strcmp(b[i],b[j]) == 0)
			{
			num[i]++;
			}
		}
		}
		for (i = 0;i < p - n;i++)
		{
		for (j = i + 1;j < p - n + 1;j++)
		{
			if (num[j] > num[i])
			{
				t = num[j];
				num[j] = num[i];
				num[i] = t;
			 t = mark[i];
			 mark[i] = mark[j];
			 mark[j] = t;
			}
		}
		}
		if (num[0] == 0)
		{
			System.out.print("NO");
		}
		else
		{

		System.out.printf("%d\n",num[0] + 1);
		System.out.println(b[mark[0]]);
		for (i = 1;;i++)
		{
			if (num[i] < num[0])
			{
				break;
			}
			else
			{
				System.out.println(b[mark[i]]);
			}
		}
		}

	}
}


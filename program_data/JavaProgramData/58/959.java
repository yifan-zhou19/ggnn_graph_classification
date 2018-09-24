package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[10000][81];
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		String p = new String(new char[81]);
		p = a;
		for (i = 0;i < n;i++)
		{
			k = 0;
			m = 0;
			if ((*(*(p.Substring(i)) + 0) >= 'A' && *(*(p.Substring(i)) + 0) <= 'Z') || *(*(p.Substring(i)) + 0) == '_' || (*(*(p.Substring(i)) + 0) >= 'a' && *(*(p.Substring(i)) + 0) <= 'z'))
			{
				k = 1;
			}
			for (j = 0; * (*(p.Substring(i)) + j) != '\0';j++)
			{
				if ((*(*(p.Substring(i)) + j) >= '0' && *(*(p.Substring(i)) + j) <= '9') || (*(*(p.Substring(i)) + j) >= 'A' && *(*(p.Substring(i)) + j) <= 'Z') || *(*(p.Substring(i)) + j) == '_' || (*(*(p.Substring(i)) + j) >= 'a' && *(*(p.Substring(i)) + j) <= 'z'))
				{
					m = m + 0;
				}
				else
				{
					m = m + 1;
				}
			}
			if (k == 1 && m == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		int m = 0;
		int t = 0;

		do
		{
			i = i + 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n > m)
			{
				t = m;
				m = n;
			}
			else if (n > t && n != m)
			{
				t = n;
			}
			else if (n == m)
			{
				m = m;
			}
				t = t;
		}while (System.in.read() != '\n');
		if (i == 1 || t == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",t);
		}

	}
}


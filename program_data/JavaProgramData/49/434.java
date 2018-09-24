package <missing>;

public class GlobalMembers
{
	public static void f(String a)
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int flag = 1;
		int c;
		a = ConsoleInput.readToWhiteSpace(true);
		int b = a.length();
		for (j = 2;j <= b ;j++)
		{
		 for (i = 0;i + j <= b;i++)
		 {
				c = 1;
			for (m = i,n = i + j - 1;m < n;m++,n--)
			{
				if (!a[m].equals(a[n]))
				{
					c = 0;
					break;
				}
			}
			if (c != 0)
			{
				if (flag != 0)
				{
					flag = 0;
					for (k = i;k < i + j;k++)
					{
						System.out.print(a[k]);
					}
				}
				else
				{
					System.out.print("\n");
					for (k = i;k < i + j;k++)
					{
						System.out.print(a[k]);
					}
				}
			}
		 }
		}
	}
		public static int Main()
		{
			String a = new String(new char[500]);
			f(a);
			return 0;
		}
}


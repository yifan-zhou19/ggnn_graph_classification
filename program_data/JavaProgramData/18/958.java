package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s = 0;
		int[][] a = new int[200][200];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		for (int q = 0;q < m;q++)
		{
			s = 0;
			n = m;
			for (int i = 0;i < m;i++) ///shuru
			{
				for (int j = 0;j < m;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int w = 0;w < m - 1;w++)
			{
				for (int i = 0;i < n;i++) ///hangxiaojian
				{
					int l = (p[i]);
					for (int j = 0;j < n;j++)
					{
						if (l > *(p[i] + j))
						{
							l = (p[i] + j);
						}
					}
					for (int j = 0;j < n;j++)
					{
						*(p[i] + j) = *(p[i] + j) - l;
					}
				}
				for (int j = 0;j < n;j++) ///liexiaojian
				{
					int l = (p[0] + j);
					for (int i = 0;i < n;i++)
					{
						if (l > *(p[i] + j))
						{
							l = (p[i] + j);
						}
					}
					for (int i = 0;i < n;i++)
					{
						*(p[i] + j) = *(p[i] + j) - l;
					}
				}
				s = s + *(p[1] + 1);
				for (int i = 0;i < n;i++)
				{
					for (int j = 1;j < n - 1;j++)
					{
						*(p[i] + j) = *(p[i] + j + 1);
					}
				}
				for (int j = 0;j < n - 1;j++)
				{
					for (int i = 1;i < n - 1;i++)
					{
						*(p[i] + j) = *(p[i + 1] + j);
					}
				}
				n--;
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return (0);
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int out1 = 0;
		int out2 = 0;
		int ns;
		int t;
		int p;
		int k;
		int count = 0;
		int[] b = new int[1000];
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m != 1)
		{

			for (i = m,k = 0;i <= n;i++)
			{
				out1 = 0;
				out2 = 0;
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					out1 = 1;
				}
				ns = (int)Math.log10(i);
				for (j = 0,p = i;j <= ns;j++)
				{

					t = (int)(p / (int)Math.pow(10,ns - j));
					p = (int)(p % (int)Math.pow(10,ns - j));
					a[j] = 48 + t;
				}
				for (j = 0;j <= ns;j++)
				{
					if (a[j] != a[ns - j])
					{
						break;
					}
				}
					if (j == ns + 1)
					{
						out2 = 1;
					}

			if (out1 * out2 != 0)
			{
				b[k] = i;
				count++;
				k++;
			}
			}
			if (count == 0)
			{
				System.out.print("no");
			}
			else
			{
				for (k = 0;k < count;k++)
				{
					System.out.printf("%d",b[k]);
					if (k != count - 1)
					{
						System.out.print(",");
					}
				}
			}



		}
	}





}


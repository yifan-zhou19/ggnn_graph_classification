package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n = 0;
		int i;
		int k = 1;
		int max;
		int sub = 0;
		int t;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				n = n * 10 + c - '0';
			}
			else
			{
				a[k] = n;
				k++;
				n = 0;
			}
		}
		a[k] = n;
		if (k != 1)
		{
			max = a[1];
			for (i = 2;i <= k;i++)
			{
				if (a[i] != max)
				{
					sub = a[i];
					break;
				}
			}
			if (sub == 0)
			{
				System.out.print("No\n");
			}
			else
			{
				if (sub >= max)
				{
					t = sub;
					sub = max;
					max = t;
				}
				for (;i <= k;i++)
				{
					if (a[i] > max)
					{
						sub = max;
						max = a[i];
					}
					else
					{
						if (a[i] == max)
						{
							continue;
						}
						else
						{
							if (a[i] > sub)
							{
							  sub = a[i];
							}
						}
					}
				}
				System.out.printf("%d\n",sub);
			}
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int cmp(Object x, Object y)
	{
		return *(int)y - (int)x;
	}
	public static int pk(int[] a, int[] b)
	{
		int i = 0;
		int j = 0;
		int k = n - 1;
		int l = n - 1;
		int sum = 0;
		int w = 0;
		int lose = 0;
		while (i <= k)
		{

			if (a[k] > b[l])
			{
				sum += 200;
				w++;
				k--;
				l--;
			}
			else if (a[k] < b[l])
			{
				sum -= 200;
				lose++;
				k--;
				j++;
			}
			else
			{
				if (a[i] > b[j])
				{
					sum += 200;
					w++;
					i++;
					j++;
				}
				else
				{
					if (a[k] < b[j])
					{
						sum -= 200;
						lose++;
					}
					k--;
					j++;
				}

			}
		}
		return sum;
	}
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			int i;
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			System.out.print(pk(a, b));
			System.out.print("\n");
		}
		return 0;
	}


}


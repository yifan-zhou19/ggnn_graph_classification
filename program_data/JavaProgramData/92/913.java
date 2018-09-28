package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1005];
		int[] b = new int[1005];
		int count;
		int i;
		int j;
		int x;
		int y;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			count = 0;
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n);
			sort(b,b + n);
			x = n - 1,y = n - 1,i = 0,j = 0;
			while (n-- != 0)
			{
				if (a[x] > b[y])
				{
					x--;
					y--;
					count++;
				}
				else if (a[i] > b[j])
				{
					i++;
					j++;
					count++;
				}
				else if (a[i] < b[y])
				{
					i++;
					y--;
					count--;
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}

}


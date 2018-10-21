package <missing>;

public class GlobalMembers
{
	public static int count1;
	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int n;
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int dfs(int[] a, int[] b)
	{
		int x;
		int y;
		int i;
		int j;
		x = y = 0;
		i = j = n - 1;
		while (true)
		{
		if (x > i)
		{
		break;
		}
		if (a[x] > b[y])
		{
		count1 += 1;
		x++;
		y++;
		}
		else
		{
		if (a[i] > b[j])
		{
		count1 += 1;
		i--;
		j--;
		}
		else
		{
		if (a[i] < b[y])
		{
		count1 -= 1;
		}
		i--;
		y++;
		}
		}
		}
	}
	public static int Main()
	{
		while (true)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
		break;
		}
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
	  //  for(int i=0;i<n;i++)
	  //  cout<<a[i]<<' ';
	  //  cout<<endl;
		for (int i = 0;i < n;i++)
		{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
		count1 = 0;
	  //  i_count=0;
		dfs(a, b);
		System.out.print(200 * (count1));
		System.out.print("\n");
		}
		return 0;
	}

}


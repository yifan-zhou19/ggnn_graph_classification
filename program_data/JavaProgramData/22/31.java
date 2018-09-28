package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int m;
		int t;
		int max;
		int flag = 0;
		char c;
		for (i = 0;c != '\n';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		}
		m = i;



		if (m == 1)
		{
			System.out.print("No\n");
		}
		else
		{

			for (i = 0;i < m;i++)
			{
				max = i;
			for (j = i + 1;j < m;j++)
			{
				if (a[j] > a[max])
				{
					max = j;
				}
			}
				t = a[i];
				a[i] = a[max];
				a[max] = t;
			}
		for (i = 0;i < m - 1;i++)
		{
			if (a[i] != a[i + 1])
			{
			flag = 1;
			break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",a[i + 1]);
		}
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int second = new int(int b[],int t);
		int i = 0;
		int j;
		int z = 1;
		int[] a = new int[300];
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		} while (c != '\n');
		for (j = 0;j < i - 1;j++)
		{
			if (a[j] != a[j + 1])
			{
				z = 0;
				break;
			}
		}
		if (i == 1 || z == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",second(a, i));
		}
	}
	public static int second(int[] b, int t)
	{
		int i;
		int j;
		int s;
		for (j = t;j > 1;j--)
		{
			for (i = 1;i <= j - 1;i++)
			{
			if (b[i - 1] > b[i])
			{
				s = b[i - 1];
				b[i - 1] = b[i];
				b[i] = s;
			}
			}
		}
		for (i = t - 1;i > 1;i--)
		{
			if (b[i - 1] != b[i])
			{
				break;
			}
		}
		return (b[i - 1]);
	}
}


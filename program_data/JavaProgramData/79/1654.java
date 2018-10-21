package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int j;
		int s;
		int count = 0;
		int[] a = new int[100];
		for (k = 0;;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			for (s = 0,i = 2;i <= n;i++)
			{
				s = (s + m) % i;
			}
			a[k] = s + 1;
			count++;
		}
		for (j = 1;j <= count;j++)
		{
			System.out.printf("%d\n",a[j - 1]);
		}
	}
}


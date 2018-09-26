package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int qiumax = new int(int s[1005],int n);
		int[] a = new int[1005];
		int[] b = new int[1005];
		int i = 0;
		char c;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		} while (c != '\n');
		int num = i;
		for (i = 1;i <= num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
		}
		int[] cnt = new int[1002];
		int j;
		int maxb = qiumax(b, num);
		for (i = 1;i <= num;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				cnt[j]++;
			}
		}
		int maxpeople = qiumax(cnt, maxb - 1);
		System.out.printf("%d %d",num,maxpeople);
		return 0;
	}

	public static int qiumax(int[] s, int n)
	{
		int i;
		int max = 0;
		for (i = 0;i <= n;i++)
		{
			if (s[i] > max)
			{
				max = s[i];
			}
		}
		return max;
	}



}


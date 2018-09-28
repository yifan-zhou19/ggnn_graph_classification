package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] l = new int[100];
		int s = 0;
		int i;
		int t;
		int n;
		int p;
		int q;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < q - p + 1;j++)
		{
		a = p + j;
		n = a;
		t = 0;
		for (i = 0;i < 9;i++)
		{
			if (n != 0)
			{
				t = t * 10 + n % 10;
				n = n / 10;
			}
			else
			{
				break;
			}
		}
		n = 0;
		if (t == a)
		{
			for (i = 2;i < a;i++)
			{
				if (a % i != 0)
				{
					n++;
				}
			}
			if (n == a - 2)
			{
				l[s] = a;
				s++;
			}
		}
		}
		if (l[s - 1] != 0)
		{
		for (i = 0;i < s - 1;i++)
		{
			System.out.printf("%d,",l[i]);
		}
		System.out.printf("%d\n",l[s - 1]);
		}
		else
		{
			System.out.print("no\n");
		}
	}

}


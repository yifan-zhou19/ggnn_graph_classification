package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhishu = int n;
		int m;
		int n;
		int i;
		int w;
		int t;
		int k = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (i == 1)
			{
				continue;
			}
			if (i % 2 == 0 && i != 2)
			{
				continue; //?????????????
			}
			if (i % 3 == 0 && i != 3)
			{
				continue;
			}

				w = Math.log10(i);
				t = Math.pow(10,w);


			if (i % 10 != i / t)
			{
				continue;
			}
		if (w >= 3 && ((i - i % 10) / 10) % 10 != (i / (t / 10)) % 10)
		{
			continue; //???????????
		}
		if (w >= 5 && (i / 10 - ((i - i % 10) / 10) % 10) / 10 % 10 != (i / (t / 100)) % 10)
		{
			continue; //????2???????
		}
		if (w >= 7 && (i / 10 - ((i / 10 - ((i - i % 10) / 10) % 10) / 10 % 10)) / 10 % 10 != (i / (t / 1000)) % 10)
		{
			continue; //????
		}
		if (w >= 9 && (i / 10 - ((i / 10 - ((i / 10 - ((i - i % 10) / 10) % 10) / 10 % 10)) / 10 % 10)) / 10 % 10 != (i / (t / 10000)) % 10)
		{
			continue;
		}
		if (w >= 11 && (i / 10 - ((i / 10 - ((i / 10 - ((i / 10 - ((i - i % 10) / 10) % 10) / 10 % 10)) / 10 % 10)) / 10 % 10)) / 10 % 10 != (i / (t / 100000)) % 10)
		{
			continue;
		}


			t = zhishu(i); //??????
			if (t == 1 && k == 0)

			{
				System.out.printf("%d",i);
				k++;
				a = 1;
			}
			else if (t == 1 && k > 0)
			{

			System.out.printf(",%d",i);
			}


		}
		if (a == 0)
		{
			System.out.print("no");
		}
		return 0;

	}
	public static int zhishu(int n)
	{
		int t;
		int i;
		int k = 0;
		t = Math.sqrt(n) + 1;
		for (i = 2;i < t;i++)
		{
			if (n % i == 0)
			{
				k++;
			}
		}
			if (k > 0)
			{
				return 0;
			}
			else
			{
				return 1;
			}

	}
}


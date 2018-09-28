package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int p;
		int i;
		p = 1;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				p = 0;
				break;
			}
		}
		return (p);
	}
	public static int back(int n)
	{
		int q;
		int i;
		int len;
		int l;
		int s;
		int t;
		q = 1;
		len = Math.log10(n) + 1;
		l = len;
		for (i = 1;i <= l / 2;i++)
		{
			s = n / Math.pow(10,len - 1);
			t = n % 10;
			if (s != t)
			{
				q = 0;
				break;
			}
			n = (n - (s) * Math.pow(10,len - 1)) / 10;
			len -= 2;
		}
		return (q);
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (prime(i) * back(i) == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i == n + 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = i + 1;i <= n;i++)
		{
			if (prime(i) * back(i) == 1)
			{
				System.out.printf(",%d",i);
			}
		}
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto ed;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ed:
	n = n;
	}

}


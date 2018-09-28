package <missing>;

public class GlobalMembers
{
	public static int Reverse(int num,int renum)
	{
		if (num == 0)
		{
			return renum;
		}
		else
		{
			return Reverse(num / 10, renum * 10 + num % 10);
		}
	}
	public static int isReverse(int n)
	{
		if (Reverse(n, 0) == n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int isPrime(int n,int limit,int num)
	{
		if (num > limit)
		{
			return 1;
		}
		else if (n % num == 0)
		{
			return 0;
		}
		else
		{
			return isPrime(n, limit, num + 1);
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int limit;
		int[] a = new int[300];
		String str = new String(new char[300]);
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
			limit = Math.sqrt(i);
			if (isPrime(i, limit, 2) != 0 && isReverse(i) != 0)
			{
				  a[j++] = i;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, ',');
		}
		str = tangible.StringFunctions.changeCharacter(str, j - 1, '\n');
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d%c",a[i],str.charAt(i));
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}
}


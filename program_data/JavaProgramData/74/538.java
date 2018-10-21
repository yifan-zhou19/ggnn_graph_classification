package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ishw = int n;
		int isprime = int n;
		int m;
		int n;
		int first;
		int flag = 0;
		int i;
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
			if (isprime(i) != 0 && ishw(i) != 0)
			{
				System.out.printf("%d",i);
				first = i;
				flag = 1;
				break;
			}
		}
		for (i = first + 1;i <= n;i++)
		{
			if (isprime(i) != 0 && ishw(i) != 0)
			{
				System.out.printf(",%d",i);
			}
		}


		if (flag == 0)
		{
				System.out.print("no\n");
		}
	}
	public static int isprime(int n)
	{
		int i;
		int k;
		k = n / 2;
		for (i = 2;i <= k;i++)
		{
			if (n % i == 0)
			{
				return (0);
				break;
			}
		}
		if (i > k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int ishw(int n)
	{
		int i;
		int j;
		int k;
		int place = 0;
		String s = new String(new char[9]);
		for (i = 0;n != 0;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, n % 10);
			n /= 10;
			place = i + 1;
		}
			//ltoa(n,s,10);/*?????????????*/
			k = place;
			j = -1;
			do
			{
			j++;
			} while (s.charAt(j) == s.charAt(k - j - 1) && j + 1 <= k / 2);
			if (j + 1 > k / 2)
			{
				return (1);
			}
			else
			{
				return (0);
			}
	}

}


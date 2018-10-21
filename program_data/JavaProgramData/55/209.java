package <missing>;

public class GlobalMembers
{
	public static int f(int[] ia, int m, int la)
	{
		int i;
		int j;
		int sum = 0;
		int num;
		for (i = 0;i < la;i++)
		{
			num = 1;
			for (j = 0;j < i;j++)
			{
				num = num * m;
			}
			sum = sum + num * ia[i];
		}
		return (sum);
	}
	public static void Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int m;
		int n;
		int la;
		int i;
		int j;
		int[] ia = new int[200];
		int[] ib = new int[200];
		int t;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		la = a.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				t = a.charAt(i) - '0';
			}
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				t = a.charAt(i) - 'a' + 10;
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				t = a.charAt(i) - 'A' + 10;
			}
			ia[la - i - 1] = t;
		}
		sum = f(ia, m, la);
		if (sum == 0)
		{
			System.out.printf("%d",sum);
		}
		for (i = 0;sum != 0;i++)
		{
			ib[i] = sum % n;
			sum = sum / n;
		}

		for (j = 0;j < i;j++)
		{
			if (ib[j] < 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, i - 1 - j, ib[j] + '0');
			}
			else if (ib[j] > 9)
			{
				b = tangible.StringFunctions.changeCharacter(b, i - 1 - j, ib[j] - 10 + 'A');
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%c",b.charAt(j));
		}


	}
}


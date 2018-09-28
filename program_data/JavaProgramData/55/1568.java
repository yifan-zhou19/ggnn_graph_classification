package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j = 0;
		int k;
		int l;
		int n;
		int m;
		int a;
		int b;
		int[] put = new int[100];
		int num = 0;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		m = str.length();
		if (str.charAt(0) == '0')
		{
			System.out.print("0");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				n = str.charAt(i) - '0';
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				n = str.charAt(i) - 'a' + 10;
			}
			else
			{
				n = str.charAt(i) - 'A' + 10;
			}
			num += n * Math.pow(a,m - i - 1);
			} //num????????
		while (num > 0)
		{
			put[j] = num % b;
			j++;
			num = num / b;
		}
		for (k = j - 1;k >= 0;k--) //???????
		{
			if (put[k] >= 0 && put[k] <= 9)
			{
				System.out.printf("%d",put[k]);
			}
			else
			{
				System.out.printf("%c",((char)(put[k] - 10)) + 'A');
			}
		}
		}
	}

}


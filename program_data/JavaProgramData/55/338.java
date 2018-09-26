package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		int i;
		int n = 0;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				n = n * x + a.charAt(i) - '0';
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				n = n * x + a.charAt(i) - 'A' + 10;
			}
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				n = n * x + a.charAt(i) - 'a' + 10;
			}
		}
		int[] b = new int[100];
		int j = 0;
		int k;
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
			while (n > 0)
			{
			b[j] = n % y;
			j++;
			n = n / y;
			}
		}
		for (k = j - 1;k >= 0;k--)
		{
			if (b[k] < 10)
			{
				System.out.printf("%d",b[k]);
			}
			if (b[k] >= 10)
			{
				System.out.printf("%c",b[k] + 55);
			}
		}
	}


}


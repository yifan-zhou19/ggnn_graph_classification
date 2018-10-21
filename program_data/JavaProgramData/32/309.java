package <missing>;

public class GlobalMembers
{
	public static void exchange(int[] num, String str)
	{
		int i;
		int j = 99;
		int n = 0;
		while (str[n].compareTo(48) >= 0 && str[n].compareTo(58) <= 0)
		{
			n += 1;
		}
		n -= 1;
		for (i = n,j = 99;i >= 0;i--,j--)
		{
			num[j] = str[i] - 48;
		}
	}
	public static void calculate(int[] num1, int[] num2)
	{
		int i;
		int n = 0;
		int[] num3 = new int[100];
		for (i = 99;i >= 0;i--)
		{
			num3[i] = num1[i] - num2[i];
			if (num3[i] < 0)
			{
				num3[i] += 10;
				num1[i - 1] -= 1;
			}
		}

		while (num3[n] == 0)
		{
			n += 1;
		}
		for (i = n;i <= 99;i++)
		{
			System.out.printf("%d",num3[i]);
		}
		System.out.print("\n");
	}

	public static void Main()
	{
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int n;
		int i;
		int j;
		final String str1 = "";
		final String str2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		exchange(num1, str1);
		exchange(num2, str2);
		calculate(num1, num2);
		for (j = 0;j <= 99;j++)
		{
			num1[j] = 0;
			num2[j] = 0;
			str1 = tangible.StringFunctions.changeCharacter(str1, j, ' ');
			str2 = tangible.StringFunctions.changeCharacter(str2, j, ' ');
		}
		}
	}

}


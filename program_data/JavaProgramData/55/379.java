package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int len;
		int len2;
		int i;
		int j = 0;
		int m = 1;
		int k;
		char c;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] str2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n = 0;
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
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if ((str[i] <= 'z') && (str[i] >= 'a'))
			{
				k = str[i] - 87;
			}
			else if ((str[i] <= 'Z') && (str[i] >= 'A'))
			{
				k = str[i] - 55;
			}
			else if ((str[i] <= '9') && (str[i] >= '0'))
			{
				k = str[i] - 48;
			}
			n = a * n + k;
		}
		while (m != 0)
		{
			str2[j] = n % b;
			if ((str2[j] <= 35) && (str2[j] >= 10))
			{
				str2[j] += 55;
			}
			else if ((str2[j] <= 9) && (str2[j] >= 0))
			{
				str2[j] += 48;
			}
			n = n / b;
			m = n;
			j++;
		}
		len2 = str2.length();
		for (j = len2 - 1;j >= 0;j--)
		{
			System.out.printf("%c",str2[j]);
		}
		System.out.print("\n");
	}
}


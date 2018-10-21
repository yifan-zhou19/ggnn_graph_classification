package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[201];
		int[] b = new int[200];
		int len;
		int flag = 0;
		String str1 = new String(new char[201]);
		String str2 = new String(new char[201]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}

		if (str1.length() == 1 && str2.length() == 1 && str1.charAt(0) == '0' && str2.charAt(0) == '0')
		{
			System.out.print("0\n");
		}
		else
		{

		for (i = 0;i < str1.length();i++)
		{
			a[str1.length() - i - 1] = str1.charAt(i) - '0';
		}
		for (j = 0;j < str2.length();j++)
		{
			b[str2.length() - j - 1] = str2.charAt(j) - '0';
		}

		len = (str1.length() > str2.length())?str1.length():str2.length();

		for (i = 0;i < len;i++)
		{
			a[i] += b[i];
		if (a[i] >= 10)
		{
			a[i] -= 10;
			a[i + 1]++;
		}
		}

		for (k = len;k >= 0;k--)
		{
			if (flag != 0)
			{
				System.out.printf("%d",a[k]);
			}
			else if (a[k])
			{
				System.out.printf("%d",a[k]);
				flag = 1;
			}
		}
		System.out.print("\n");
		}
	}



}


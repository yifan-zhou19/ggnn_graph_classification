package <missing>;

public class GlobalMembers
{
	public static void bigmulti(String a, String b, String c)
	{
		int i;
		int[] tem = new int[400];
		int j;
		int k;
		int la = a.length();
		int lb = b.length();
		int[] sum = new int[800];
		int[] num1 = new int[400];
		int[] num2 = new int[400];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < la;i++)
		{
		num1[i] = a[la - 1 - i] - '0';
		}
		for (i = 0;i < lb;i++)
		{
		num2[i] = b[lb - 1 - i] - '0';
		}
		for (i = 0;i < lb;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(tem,0,(Integer.SIZE / Byte.SIZE));
			tem[0] = num1[0] * num2[i];
			for (j = 1;j <= la;j++)
			{
				tem[j] = num1[j] * num2[i] + tem[j - 1] / 10;
				tem[j - 1] %= 10;
			}
			for (j = 0;j <= 200;j++)
			{
				if (j == 0 && i == 0)
				{
				sum[0] = tem[0];
				}
				else
				{
					sum[i + j] = sum[i + j] + tem[j] + sum[i + j - 1] / 10;
					sum[i + j - 1] %= 10;
				}
			}
		}
		for (i = la + lb;i >= 0 && sum[i] == 0;i--)
		{
			;
		}
		c[i + 1] = '\0';
		for (j = 0;j <= i;j++)
		{
		c[i - j] = sum[j] + '0';
		}
	}

	public static int Main()
	{
		int n;
		int i;
		final String s = "1";
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			bigmulti(s, "2", a);
			s = a;
		}
		System.out.printf("%s",s);
		return 0;
	}
}


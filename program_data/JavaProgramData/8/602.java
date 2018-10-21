package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] str, int n)
	{
		int i;
		int p;
		int m;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = Integer.parseInt(tempVar);
			}
		}
		for (p = 1;p < n;p++)
		{
			for (i = 0;i <= n - 1 - p;i++)
			{
			  if (str[i] > str[i + 1])
			  {
				  m = str[i];
				  str[i] = str[i + 1];
				  str[i + 1] = m;
			  }
			}
		}
	}
	public static void hebing(int[] str1, int[] str2, int n1, int n2)
	{
		int i;
		for (i = n1;i < n1 + n2;i++)
		{
			str1[i] = str2[i - n1];
		}
	}
	public static void shuchu(int[] str, int n)
	{
		int i;
		System.out.printf("%d",str[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",str[i]);
		}
	}
	public static void Main()
	{
		int n1;
		int n2;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		paixu(a, n1);
		paixu(b, n2);
		hebing(a, b, n1, n2);
		shuchu(a, n1 + n2);
	}




}


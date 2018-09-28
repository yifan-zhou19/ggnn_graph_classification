package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[1010];
		int[] y = new int[1010];
		int i = 0;
		int a = 0;
		int k = 0;
		int b = 0;
		int j;
		int[] g = new int[1010];
		int max;
		String str1 = new String(new char[100000]);
		String str2 = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		while (str1.charAt(i) != '\0')
		{
			if (str1.charAt(i) != ',')
			{
			x[a] = str1.charAt(i) - '0' + x[a] * 10;
			}
			else
			{
				a++;
			}
			i++;
		}
		i = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		while (str2.charAt(i) != '\0')
		{
			if (str2.charAt(i) != ',')
			{
			y[b] = str2.charAt(i) - '0' + y[b] * 10;
			}
			else
			{
				b++;
			}
			i++;
		}
		System.out.printf("%d ",a + 1);

	for (i = 0;i < a + 1;i++)
	{
		for (j = x[i];j < y[i];j++)
		{
			g[j]++;
		}
	}

	  max = g[0];
		for (i = 0;i < 1010;i++)
		{
	   if (g[i] > max)
	   {
		   max = g[i];
	   }
		}
		System.out.printf("%d",max);
	}


}


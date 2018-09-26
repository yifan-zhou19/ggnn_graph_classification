package <missing>;

public class GlobalMembers
{
	public static String dp = new String(new char[10000]);
	public static int[] num = new int[10000];
	public static int n;
	public static int Main()
	{
		int i;
		int j;
		int len;
		int flag = 1;
		int max = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dp = tempVar2.charAt(0);
		}
		len = dp.length();
		for (i = 0;i + n - 1 < len;i++)
		{
		for (j = i;j + n - 1 < len;j++)
		{
							  flag = 1;
							  for (k = 0;k < n;k++)
							  {
											  if (dp.charAt(i + k) != dp.charAt(j + k))
											  {
											  flag = 0;
											  break;
											  }
							  }
							  if (flag == 1)
							  {
							  num[i]++;
							  }
							  if (num[i] > max)
							  {
							  max = num[i];
							  }
		}
		}
		if (max == 1)
		{
		System.out.print("NO");
		return 0;
		}
		System.out.printf("%d",max);
		for (i = 0;i < len;i++)
		{
		if (num[i] == max)
		{
			System.out.print("\n");
		for (j = 0;j < n;j++)
		{
		System.out.printf("%c",dp.charAt(i + j));
		}
		}
		}
		//getch();
		return 0;
	}




}


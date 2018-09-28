package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int[] a = new int[100];
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num1[i] = Integer.parseInt(tempVar3);
			}
		}
				 for (i = 0;i < n - m;i++)
				 {
		 num2[i + m] = num1[i];
				 }
		for (i = 0;i < m;i++)
		{
		 num2[i] = num1[n - m + i];
		}
		for (i = 0;i < n - 1;i++)
		{
		 System.out.printf("%d ",num2[i]);
		}
		System.out.printf("%d",num2[n - 1]);
	}

}


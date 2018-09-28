package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] len = new int[250];
		int[] a = new int[250];
		char[][] str = new char[250][100];
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 str[i] = tempVar2.charAt(0);
		 }
		 len[i] = String.valueOf(str[i]).length();
		// printf("%d", len[i]);
		  a[i] = len[i];
		}
		int sum = i;
		for (int k = 0;k < sum - 1;k++)
		{
		for (i = 0;i < sum - k - 1;i++)
		{
			if (len[i] > len[i + 1])
			{
				max = len[i];
				len[i] = len[i + 1];
				len[i + 1] = max;
			}
		}
		}
		 for (i = 0;i < sum;i++)
		 {
			if (a[i] == len[sum - 1])
			{
				System.out.printf("%s\n", str[i]);
				break;
			}
		 }
		   for (i = 0;i < sum;i++)
		   {
			if (a[i] == len[0])
			{
				System.out.printf("%s\n", str[i]);
				break;
			}
		   }
		return 0;
	}













}


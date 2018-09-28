package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] len = new int[8000];
		int sum = 0;
		int a;
		char[][] str = new char[8000][40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(str[i]).length();
		}
		for (j = 0;j < (n - 1);j++)
		{
			sum = sum + len[j];
			if (sum <= 80)
			{
				System.out.printf("%s",str[j]);
			}


			a = sum + len[j + 1];
			if (a < 80)
			{
				System.out.print(" ");
				sum++;
			}
			if (a >= 80)
			{
				System.out.print("\n");
				sum = 0;
			}
		}
		if (a <= 80)
		{
				System.out.printf("%s",str[n - 1]);
		}
			if (a > 80)
			{
				System.out.print("\n");
				System.out.printf("%s",str[n - 1]);
			}


		return 0;
	}






}


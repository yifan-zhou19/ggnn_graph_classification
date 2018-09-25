package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int a;
		int b;
		int n = 0;
		int i;
		int num1 = 0;
		int j;
		int m;
		int num2 = 0;
		int[] A = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] B = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				n = 0;
				num1 = 0;
			 for (i = 0;i < a - 1;i++)
			 {
				 n = n + B[i];
			 }
			 num1 = n + 1;

			}


			else
			{
				n = 0;
				num1 = 0;
				for (i = 0;i < a - 1;i++)
				{
					n = n + A[i];
				}
				num1 = n + 1;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				n = 0;
				num2 = 0;
			 for (i = 0;i < b - 1;i++)
			 {
				 n = n + B[i];
			 }
			 num2 = n + 1;

			}


			else
			{
				n = 0;
				num2 = 0;
				for (i = 0;i < b - 1;i++)
				{
					n = n + A[i];
				}
				num2 = n + 1;
			}


			if ((num1 - num2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}


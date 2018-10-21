package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] result = new int[100];
		int sum = 0;
		char[][] str = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			int b;
			int c;
			int[] R = new int[5];
			char c1;
			char c2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
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
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c = Integer.parseInt(tempVar7);
			}
			R[0] = (a > 80 && c >= 1)? 8000:0;
			R[1] = (a > 85 && b > 80)? 4000:0;
			R[2] = (a > 90)? 2000:0;
			R[3] = (a > 85 && c2 == 'Y')? 1000:0;
			R[4] = (b > 80 && c1 == 'Y')? 850:0;
			result[i] = R[0] + R[1] + R[2] + R[3] + R[4];
		}
		int t = 0;
		int big = result[0];
		for (i = 0;i < n;i++)
		{
			sum += result[i];
			if (result[i] > big)
			{
				big = result[i];
				t = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",str[t],result[t],sum);
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][20];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int[] c = new int[100];
		int[] d = new int[100];
		int[] f = new int[100];
		int[] sum = new int[100];
		int l = 0;
		int m = 0;
		int max;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] > 80 && f[i] >= 1)
			{
				sum[i] = sum[i] + 8000;
			}
			if (c[i] > 85 && d[i] > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (c[i] > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (c[i] > 85 && b.charAt(i) == 'Y')
			{
				sum[i] = sum[i] + 1000;
			}
			if (d[i] > 80 && a.charAt(i) == 'Y')
			{
				sum[i] = sum[i] + 850;
			}
		}
		max = 0;
	 for (i = 0;i < n;i++)
	 {

		 if (max < sum[i])
		 {
			 max = sum[i];
		 }
		 m = m + sum[i];
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (max == sum[i])
		 {
		 System.out.printf("%s\n%d\n%d\n",str[i],max,m);
		 break;
		 }
	 }

	}
}


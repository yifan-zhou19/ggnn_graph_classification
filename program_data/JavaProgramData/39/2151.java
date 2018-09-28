package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int[] ans = new int[100];
		int temp;
		int sum;
		int jxj;
		int m;
		int e;
		String p = new String(new char[100]);
		String q = new String(new char[100]);
		char[][] d = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				p = tangible.StringFunctions.changeCharacter(p, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				m = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				q = tangible.StringFunctions.changeCharacter(q, i, tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				c[i] = Integer.parseInt(tempVar9);
			}
			ans[i] = 0;
			if (a[i] > 80 && c[i] >= 1)
			{
				ans[i] = ans[i] + 8000;
			}
			if (a[i] > 85 && b[i] > 80)
			{
				ans[i] = ans[i] + 4000;
			}
			if (a[i] > 90)
			{
				ans[i] = ans[i] + 2000;
			}
			if (a[i] > 85 && q.charAt(i) == 'Y')
			{
				ans[i] = ans[i] + 1000;
			}
			if (b[i] > 80 && p.charAt(i) == 'Y')
			{
				ans[i] = ans[i] + 850;
			}
		}
		jxj = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (ans[i] > jxj)
			{
				jxj = ans[i];
				temp = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + ans[i];
		}
		System.out.printf("%s\n",d[temp]);
		System.out.printf("%d\n",jxj);
		System.out.printf("%d",sum);
		return 0;
	}
}


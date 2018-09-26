package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] qimo = new int[100];
		int[] banji = new int[100];
		int[] lunwen = new int[100];
		int i;
		int j;
		int[] jiangxuejing = new int[100];
		int[] sunxu = new int[100];
		char[][] xingming = new char[100][20];
		String ganbu = new String(new char[100]);
		String xibu = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 xingming[i] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 qimo[i] = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 banji[i] = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 lunwen[i] = Integer.parseInt(tempVar7);
		 }
		 sunxu[i] = i;
		}
		for (i = 0;i <= n - 1;i++)
		{
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			if (qimo[i] > 80 && lunwen[i] >= 1)
			{
				a = a + 1;
			}
			if (qimo[i] > 85 && banji[i] > 80)
			{
				b = b + 1;
			}
			if (qimo[i] > 90)
			{
				c = c + 1;
			}
			if (qimo[i] > 85 && xibu.charAt(i) == 'Y')
			{
				d = d + 1;
			}
			if (banji[i] > 80 && ganbu.charAt(i) == 'Y')
			{
				e = e+1;
			}
			jiangxuejing[i] = a * 8000 + b * 4000 + c * 2000 + d * 1000 + e * 850;
		}
		int t;
		int k;
		int p;
		char c;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - 2 - i;j++)
			{
				if (jiangxuejing[j] < jiangxuejing[j + 1])
				{
					t = jiangxuejing[j];
					jiangxuejing[j] = jiangxuejing[j + 1];
					jiangxuejing[j + 1] = t;
					p = sunxu[j];
					sunxu[j] = sunxu[j + 1];
					sunxu[j + 1] = p;
					for (k = 0;k <= 19;k++)
					{
						c = xingming[j][k];
						xingming[j][k] = xingming[j + 1][k];
						xingming[j + 1][k] = c;
					}
				}
			}
		}
			int max = 0;
			for (i = 0;i <= n - 1;i++)
			{
				if (jiangxuejing[i] > max)
				{
					max = jiangxuejing[i];
				}
			}
			int jishuqi = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (jiangxuejing[j] == max)
				{
					jishuqi = jishuqi + 1;
				}
			}
			int m = 0;
			for (i = 0;i <= n - 1;i++)
			{
				m = m + jiangxuejing[i];
			}
			if (jishuqi == 1)
			{
			System.out.printf("%s\n",xingming[0]);
			System.out.printf("%d\n",jiangxuejing[0]);
			System.out.printf("%d\n",m);
			}
			if (jishuqi > 1)
			{
				for (i = 0;i <= jishuqi - 2;i++)
				{
					for (j = 0;j <= jishuqi - 2 - i;j++)
					{
					if (sunxu[j] > sunxu[j + 1])
					{
						t = sunxu[j];
						sunxu[j] = sunxu[j + 1];
						sunxu[j + 1] = t;
						for (k = 0;k <= 99;k++)
						{
						   c = xingming[j][k];
						   xingming[j][k] = xingming[j + 1][k];
						   xingming[j + 1][k] = c;
						}
					}
					}
				}
				 System.out.printf("%s\n",xingming[0]);
				 System.out.printf("%d\n",jiangxuejing[0]);
				 System.out.printf("%d\n",m);
			}
	}
}


public class st
{
	public String nam = new String(new char[100]);
	public int scq;
	public int scb;
	public char gb;
	public char xb;
	public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int sum = 0;
		int j;
		int t;
		st[] s = tangible.Arrays.initializeWithDefaultstInstances(1000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.in.read();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].nam = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].scq = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].scb = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i].lw = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = i;
			if (s[i].scq > 80 && s[i].lw >= 1)
			{
				a[i] = a[i] + 8000;
			}
			if (s[i].scq > 85 && s[i].scb > 80)
			{
				a[i] = a[i] + 4000;
			}
			if (s[i].scq > 90)
			{
				a[i] = a[i] + 2000;
			}
			if (s[i].scq > 85 && s[i].xb == 'Y')
			{
				a[i] = a[i] + 1000;
			}
			if (s[i].scb > 80 && s[i].gb == 'Y')
			{
				a[i] = a[i] + 850;
			}
			sum = sum + a[i];
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j + 1];
					a[j + 1] = a[j];
					a[j] = t;
					t = b[j + 1];
					b[j + 1] = b[j];
					b[j] = t;
				}
			}
		}
		System.out.printf("%s\n",s[b[0]].nam);
		System.out.printf("%d\n%d\n",a[0],sum);
	}




}


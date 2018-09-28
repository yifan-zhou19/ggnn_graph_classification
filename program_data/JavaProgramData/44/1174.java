package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",reverse(a),reverse(b),reverse(c),reverse(d),reverse(e),reverse(f));
	}
	public static int reverse(int num)
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int i;
		int j;
		int t;
		int NUM;
		int flag;
		int top;
		int butt;
		if (num < 0)
		{
			num = -num;
		flag = 1;
		}
		else
		{
			flag = 0;
		}
		a[0] = num / 10000;
		a[1] = (num - 10000 * a[0]) / 1000;
		a[2] = (num - 10000 * a[0] - 1000 * a[1]) / 100;
		a[3] = (num - 10000 * a[0] - 1000 * a[1] - 100 * a[2]) / 10;
		a[4] = num - 10000 * a[0] - 1000 * a[1] - 100 * a[2] - 10 * a[3];
		b[0] = 1000;
		for (i = 0;i < 4;i++)
		{
			b[i + 1] = b[i] / 10;
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		top = i - 1;
		butt = 4;
		while (top <= butt)
		{
			t = a[top];
			a[top] = a[butt];
			a[butt] = t;
			top = top + 1;
			butt = butt - 1;
		}
		NUM = 0;
		for (j = i - 1;j < 5;j++)
		{
			NUM = a[j] * b[j] + NUM;
		}
		if (flag == 1)
		{
			NUM = -NUM;
		}
		return (NUM);
	}

}


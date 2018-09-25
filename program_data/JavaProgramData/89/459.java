package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int c;
		int d;
		int i;
		int j;
		int p;
		int n;
		int s;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 1;
		d = 1;
		i = 0;
		while (c != 0 || d != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		c = a[i];
		d = b[i];
		i = i + 1;
		}
		for (j = 0,s = 0;j < i - 2;j++)
		{
		for (k = j + 1,p = 0;k < i - 1;k++)
		{
		if (b[j] == b[k])
		{
		p = p + 1;
		}
		}
		if (p == n - 2)
		{
		System.out.printf("%d",b[j]);
		s = s + 1;
		}
		}
		if (s == 0)
		{
		System.out.print("NOT FOUND\n");
		}
		System.in.read();
		System.in.read();
	}

}


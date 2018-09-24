package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int n;
		int m;
		int t = 0;
		int r = 0;
		int s = 0;
		int[] c = new int[1000];
		int[] d = new int[1000];
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
		for (i = 0;;i++)
		{
			r++;
			c[i] = a;
			a = a / 2;
			if (c[i] == 1)
			{
				break;
			}

		}
		for (j = 0;;j++)
		{
			s++;
			d[j] = b;
			b = b / 2;
			if (d[j] == 1)
			{
				break;
			}

		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < s;j++)
			{
			if (c[i] == d[j])
			{
				t = c[i];
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto print;
			break;
			}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	print:
	System.out.printf("%d\n",t);
	}
}


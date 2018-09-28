package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[501]; //??a???????b????,??????
		int[] b = new int[501];
		int count = 1;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
				b[count++] = a[i];
			}
		} //?????????????count-1
		int j; //maopaopaixu
		int k;
		int p;
		for (j = 1;j <= count - 1 - 1;j++)
		{
			for (k = 1;k <= count - 1 - j;k++)
			{
				if (b[k] >= b[k + 1])
				{
					p = b[k];
					b[k] = b[k + 1];
					b[k + 1] = p;
				}
			}
		} //??????????
		int l;
		for (l = 1;l <= count - 2;l++)
		{
			System.out.print(b[l]);
			System.out.print(",");
		}
		System.out.print(b[count - 1]);
		return 0;
	}
}


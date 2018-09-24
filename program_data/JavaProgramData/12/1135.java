package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int b = 0;
		int i;
		int j;
		int l;
		int m = 0;
		int q;
		for (i = 0;i <= 16;i++)
		{
			 a[i] = 0;
		}

		for (q = 0;;q++)
		{
			for (i = 0;i < 16;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b = b + 1;
			if (a[i] == 0)
			{
				break;
			}
			}
			if (a[0] == -1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto lab;
			}
		for (j = 0;j < b;j++)
		{
			for (l = j + 1;l < b;l++)
			{
						if (a[j] == 2 * a[l] || a[l] == 2 * a[j])
						{
							m = m + 1;
						}
			}
		}
				System.out.printf("%d\n",m);
			m = 0;
			b = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lab:
	;
	}


}


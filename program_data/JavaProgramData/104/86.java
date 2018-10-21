package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int x;
		int y;
		int m;
		int n;
		int c;
		int[] a = new int[12];
		int[] b = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 1,a[0] = x,b[0] = y;i <= 11;i++)
		{

			a[i] = a[i - 1] / 2;

			b[i] = b[i - 1] / 2;


		}
		for (m = 0;m <= 11;m++)
		{
			for (n = 0;n <= 11;n++)
			{
				if (a[m] == b[n])
				{
					System.out.printf("%d",a[m]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}


		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	c = 0;
	}

}


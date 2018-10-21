package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i;
		int j;
		int m;
		int n;
		int x;
		int y;
		int flag;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag = 0;
		for (i = 0;i <= x;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i <= y;i++)
		{
			b[i] = 0;
		}
		 i = 0;
		 j = 0;
		while (x > 0)
		{
			a[i] = x;
			x = x / 2;
			i++;
		}
		while (y > 0)
		{
			b[j] = y;
			y = y / 2;
			j++;
		}
		for (m = 0;m <= i;m++)
		{

		 for (n = 0;n <= j;n++)
		 {
		 if (a[m] == b[n])
		 {
		 System.out.print(a[m]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 goto lable;
		 }
		 }

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		lable:
		return 0;
	}

}


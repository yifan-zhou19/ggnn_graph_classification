package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] f = new int[3];
		for (a[0] = 0;a[0] <= 2;a[0]++)
		{
		for (a[1] = 0;a[1] <= 2;a[1]++)
		{
		for (a[2] = 0;a[2] <= 2;a[2]++)
		{
			f[0] = (a[1] > a[0]) + (a[2] == a[0]);
			f[1] = (a[0] > a[1]) + (a[0] > a[2]);
			f[2] = (a[2] > a[1]) + (a[1] > a[0]);
			for (int i = 0;i <= 2;i++)
			{
				if (a[i] > a[(i + 1) % 3] && f[i] >= f[(i + 1) % 3])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto aa;
				}
				if (a[i] < a[(i + 1) % 3] && f[i] <= f[(i + 1) % 3])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto aa;
				}
				if (a[i] == a[(i + 1) % 3] && f[i] != f[(i + 1) % 3])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto aa;
				}
			}
			for (int j = 0;j <= 2;j++)
			{
			for (int i = 0;i <= 2;i++)
			{
			if (a[i] < a[(i + 1) % 3] && a[i] < a[(i + 2) % 3])
			{
				System.out.print((char)('A' + i));
				a[i] = 3;
			}
			}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto bb;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			aa:
			;
		}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		bb:
		;
		return 0;
	}

}

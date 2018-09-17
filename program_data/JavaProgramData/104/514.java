package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 0;
		int j = 0;
		int n = 0;
		int m = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
			while (a[i] != 1)
			{
				if (a[i] % 2 == 0)
				{
					a[i + 1] = (a + i) / 2;
				i = i + 1;
				}
				else
				{
					 a[i + 1] = (a[i] - 1) / 2;
					 i = i + 1;
				}

			}
				while (b[j] != 1)
				{
				if (b[j] % 2 == 0)
				{
					b[j + 1] = (b + j) / 2;
				j = j + 1;
				}
				else
				{
					 b[j + 1] = (b[j] - 1) / 2;
					 j = j + 1;
				}

				}
				for (n = 0;n <= i;n++)
				{
				while (m != j + 1)
				{
						if (b[m] != a[n])
						{
							m = m + 1;
						}
						else
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
						}
				}


					m = 0;
				}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	System.out.printf("%d",b[m]);
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[100];
		int m;
		int z;
		for (m = 0;;m++)
		{
			int i;
			int j;
			int k;
			int n;
			int[] a = new int[17];
			int[] b = new int[17];
			n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			b[0] = 2 * a[0];
			if (a[0] == -1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
			else
			{
				for (i = 1;a[i - 1] != 0;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					if (a[i] == -1)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto end;
					}
					b[i] = 2 * a[i];
				}
				for (j = 0;j < i - 1;j++)
				{
					for (k = 0;k < i - 1;k++)
					{
						if (b[k] == a[j])
						{
							n++;
						}
					}
					c[m] = n;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		for (z = 0;z < m;z++)
		{
				 System.out.printf("%d\n",c[z]);
		}
	}
}


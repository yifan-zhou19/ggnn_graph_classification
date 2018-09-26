package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count1 = 0;
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int j;
		int k;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			b[i] = a.charAt(i) - '0';
			count1++;
		}
		if (count1 == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d",b[0]);
		}
		else
		{
			int d;
			int count = 0;
			if ((b[0] * 10 + b[1]) >= 13)
			{
				d = b[0];
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					c[j - 1] = (d * 10 + b[j]) / 13;
					d = d * 10 + b[j] - c[j - 1] * 13;
					count++;
				}
				c[j] = '\0';
				for (k = 0;k <= count - 1;k++)
				{
					System.out.printf("%d",c[k]);
				}
				System.out.print("\n");
				System.out.printf("%d",d);
			}
			else
			{
				d = b[0] * 10 + b[1];
				for (j = 2;a.charAt(j) != '\0';j++)
				{
					c[j - 2] = (d * 10 + b[j]) / 13;
					d = d * 10 + b[j] - c[j - 2] * 13;
					count++;
				}
				c[j] = '\0';
				if (count == 0)
				{
					System.out.print("0\n");
				}
				else
				{
					for (k = 0;k <= count - 1;k++)
					{
						System.out.printf("%d",c[k]);
					}
					System.out.print("\n");
				}
				System.out.printf("%d",d);
			}
		}
	}

}


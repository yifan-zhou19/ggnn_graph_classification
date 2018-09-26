package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			a[0] = n;
			i = 0;
			do
			{
				if (a[i] % 2 == 0)
				{
					 a[i + 1] = a[i] / 2;
					 System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
				}
				else
				{
					a[i + 1] = a[i] * 3 + 1;
					System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
				}
				i++;
			} while (a[i] != 1);
			System.out.print("End");
		}
	}



}


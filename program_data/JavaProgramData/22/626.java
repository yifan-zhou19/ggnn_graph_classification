package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int n = 0;
		int y;
		int z;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
		} while (System.in.read() == ',');
		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			y = a[0];
			for (i = 0;i < n;i++)
			{
			   if (a[i] > y)
			   {
				   y = a[i];
			   }
			}
			 i = 0;
			while (z = a[i] == y && i < n)
			{
				i++;
			}
			if (i == n)
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				if (a[i] != y && a[i] > z)
				{
					z = a[i];
				}
				}
			 System.out.printf("%d\n",z);
			}
		}
	}
}


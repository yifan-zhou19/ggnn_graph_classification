package <missing>;

public class GlobalMembers
{
	/*?????*/
	public static void Main()
	{
		int[] a = new int[301];
		int n = 0;
		int i;
		int j;
		int b = 0;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			n++;
		} while ((c = System.in.read()) != '\n');
		for (j = 1;j < n;j++)
		{
			if (a[j] != a[j - 1])
			{
				b++;
				break;
			}
			else
			{
				b = 0;
			}
		}
		if (n == 1 || b == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			int m1 = 0;
			int m2 = 1;
			for (i = b - 1;i < n;i++)
			{
			   if (a[i] > m1 && a[i] < m2)
			   {
				   m1 = a[i];
			   }
			   else if (a[i] > m2)
			   {
				   m1 = m2;
				   m2 = a[i];
			   }
			   else
			   {
				   continue;
			   }
			}
			System.out.printf("%d\n",m1);
		}

	}

}


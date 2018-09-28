package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int k;
		int a = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		do
		{
			m = n * a + k;
			for (i = 1;i < n;i++)
			{
			   if (m % (n - 1) == 0)
			   {
			   m = k + n * m / (n - 1);
			   }
			   else
			   {
				   break;
			   }
			}
			a++;
		} while (i < n);
		System.out.printf("%d",m);
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int[] a = new int[101];
		int[] b = new int[101];
		String A = new String(new char[101]);
		String B = new String(new char[101]);

		int n;
		int l1;
		int l2;
		int j;
		int t;
		int h;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (h = 0;h < 101;h++)
			{
			a[h] = b[h] = 0;
			}
			int k = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B = tempVar3.charAt(0);
			}
			l1 = A.length();
			l2 = B.length();

			for (j = 0;j < l1;j++)
			{
				a[100 - l1 + j] = A.charAt(j) - '0';
			}
			for (j = 0;j < l2;j++)
			{
				b[100 - l2 + j] = B.charAt(j) - '0';
			}
			  for (j = 99;j > 0;j--)
			  {
				if (a[j] >= b[j])
				{
					a[j] = a[j] - b[j];
				}
				else
				{
					a[j] -= b[j] - 10;
					a[j - 1] -= 1;
				}
			  }
			  for (j = 0;j < 100;j++)
			  {
				  if (a[j] != 0)
				  {
					  k = j;
					 break;
				  }
			  }
			  for (j = k;j < 100;j++)
			  {
				  System.out.printf("%d",a[j]);
			  }

			System.out.print("\n");
		}



	}
}


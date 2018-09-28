package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int t;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (System.in.read() == '\n')
			{
				i++;
			break;
			}
		}
		//printf("%d\n",i);
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < (i - 1);j++)
			{
			for (k = 0;k < (i - 1 - j);k++)
			{

				if (a[k] > a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
			}
	//for (j=0;j<i;j++)
	//printf("%d\t",a[j]);
		 for (k = (i - 1);k > 0;k--)
		 {
			 if (a[k - 1] < a[k])
			 {
				 System.out.printf("%d",a[k - 1]);
				 break;
			 }
		 }
		 if (k == 0)
		 {
			 System.out.print("No");
		 }
		}
	}

}


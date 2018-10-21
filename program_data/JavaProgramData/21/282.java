package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int sum = 0;
		int j;
		int[] b = new int[1000];
		int temp;
		int t;
		float ave;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		ave = (float)sum / n;
		if (ave - (int)ave >= 0.5)
		{
			t = (int)ave+1;
		}
		else
		{
			t = (int)ave;
		}


		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(t - a[i]);
		}
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < n - i;j++)
			 {
				if (b[j] < b[j + 1])
				{
				  temp = b[j];
				  b[j] = b[j + 1];
				  b[j + 1] = temp;
				  temp = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = temp;


				}
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (b[i + 1] != b[i])
			{
				System.out.printf("%d",a[i]);
				break;
			}
			else
			{
				System.out.printf("%d,",a[i]);
			}


		}
		return 0;
	}






}


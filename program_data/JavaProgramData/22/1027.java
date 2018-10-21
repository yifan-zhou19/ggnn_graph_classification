package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int max;
		int min = -1;
		int i;
		int j;
		int temp;
		char c;
		i = 0;
		while (c != '\n')
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 c = tempVar2.charAt(0);
			 }
		 i++;
		}
		 max = a[0];
		 for (j = 1;j < i;j++)
		 {
				if (a[j] < max && a[j]> min)
				{
					min = a[j];
				}
			if (a[j] > max)
			{
				min = max,max = a[j];
			}
		 }
		if (min == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",min);
		}

	}
}


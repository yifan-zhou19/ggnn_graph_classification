package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[17];
		 int i;
		 int n;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[1] = Integer.parseInt(tempVar);
		 }
		 while (a[1] > 0)
		 {

			 n = 0;
			 i = 1;
			do
			{
				  i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				for (j = 1;j <= i;j++)
				{
				if (a[i] == a[j] * 2 || a[j] == a[i] * 2)
				{
				 n++;
				}
				}

			} while (a[i] != 0);
		 System.out.printf("%d\n",n - 1);
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[1] = Integer.parseInt(tempVar3);
		 }
		 }
	}

}


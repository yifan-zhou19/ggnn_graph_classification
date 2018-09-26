package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	 int[] a = new int[N];
	 int i;
	 int j;
	 int istart;
	 int iend;
	 int temp;
	 int n;

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
	 }



	 for (i = 0;i < n;i++)
	 {

		 if (a[i] == 0)
		 {
			 continue;
		 }

		   for (j = i + 1;j < n;j++)
		   {
				if (a[j] == 0)
				{
					continue;
				}

				if (a[j] == a[i])
				{
					a[j] = 0;
				}


		   }





	 }


		 for (i = 0;i < n;i++)
		 {
			  if (a[i] != 0)
			  {
				System.out.printf("%d",a[i]);
				break;
			  }

		 }
		i++;
		while (i < n)
		{
			 if (a[i] != 0)
			 {
				System.out.printf(",%d",a[i]);
			 }
			 i++;

		}











	}
}


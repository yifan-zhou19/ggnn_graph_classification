package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int n;
	  int[] a = new int[300];
	  int[] b = new int[300];

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

	  for (i = 0;i < n - 1;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
			if (a[i] == a[j])
			{
				a[j] = 0;
			}
		}

	  }



	  for (i = 0,j = 0;i < n;i++)
	  {
		if (a[i] != 0)
		{
			b[j] = a[i];
			j++;
		}

	  }

	  for (i = 0;i < n;i++)
	  {
		 if (b[i] != 0)
		 {
			 System.out.printf("%d",b[i]);
			 if (b[i + 1] != 0)
			 {
				 System.out.print(",");
			 }
		 }

	  }


	}
}


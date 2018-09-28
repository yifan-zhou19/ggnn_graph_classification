package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int x;
	public static int y;

	public static void oh()

	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}


		for (i = 0;i < x - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[x - 1] = Integer.parseInt(tempVar4);
		}

		for (i = 0;i < y - 1;i++)
		{
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[i] = Integer.parseInt(tempVar5);
		}
		}

		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			b[y - 1] = Integer.parseInt(tempVar6);
		}

	}

	public static void ba()
	{

		 int i;
		 int j;
		 int k;
		 for (i = 0;i < x;i++)
		 {
		  for (j = i;j < x;j++)
		  {
			if (a[i] > a[j])
			{
			 k = a[i];
			 a[i] = a[j];
			 a[j] = k;
			}
		  }
		 }

	  for (i = 0;i < y;i++)
	  {
		  for (j = i;j < y;j++)
		  {
			if (b[i] > b[j])
			{
			 k = b[i];
			 b[i] = b[j];
			 b[j] = k;
			}
		  }
	  }



	}


	 public static void zha()
	 {

		 int i;
		 for (i = 0;i < x;i++)
		 {
		 c[i] = a[i];
		 }

		 for (i = x;i < x + y;i++)
		 {
		 c[i] = b[i - x];
		 }

	 }

	 public static void hei()
	 {

	  int i;
	  for (i = 0;i < x + y - 1;i++)
	  {

	   System.out.printf("%d ",c[i]);
	  }

	   System.out.printf("%d",c[x + y - 1]);


	 }

	public static int Main()
	{
		oh();
		ba();
		zha();
		hei();

	}





}


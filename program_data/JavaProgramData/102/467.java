package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String xb = new String(new char[10]);
		int i;
		int n;
		int a = 0;
		int b = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float m;
		float[] shuzunan = new float[40];
		float[] shuzunv = new float[40];
		for (i = 0;i < n;i++)
		{

		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   xb = tempVar2.charAt(0);
		   }
		   if (*xb == 'm')
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  shuzunan[a] = Float.parseFloat(tempVar3);
			  }
			  a++;
		   }
		   if (*xb == 'f')
		   {
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  shuzunv[b] = Float.parseFloat(tempVar4);
			  }
			  b++;
		   }
		}
		for (k = 1;k < a;k++)
		{
		   for (i = 0;i < a - k;i++)
		   {
			  if (shuzunan[i] > shuzunan[i + 1])
			  {
				  m = shuzunan[i + 1];
				  shuzunan[i + 1] = shuzunan[i];
				  shuzunan[i] = m;
			  }
		   }
		}
		for (k = 1;k < b;k++)
		{
			   for (i = 0;i < b - k;i++)
			   {
				   if (shuzunv[i] < shuzunv[i + 1])
				   {
					 m = shuzunv[i + 1];
					 shuzunv[i + 1] = shuzunv[i];
					 shuzunv[i] = m;
				   }
			   }
		}
		System.out.printf("%.2f",shuzunan[0]);
		for (k = 1;k < a;k++)
		{
			System.out.printf(" %.2f",shuzunan[k]);
		}
		for (k = 0;k < b;k++)
		{
			System.out.printf(" %.2f",shuzunv[k]);
		}


	   return 0;
	}

}


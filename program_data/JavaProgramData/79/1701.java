package <missing>;

public class GlobalMembers
{
	public static int ysf(int m,int n)
	{
		int[] p;
		int i;
		int j;
		int k;
		p = new int[n];
		for (i = 0;i < n;i++)
		{
			 p[i] = 0;
		}
		k = n;
		j = 1;
		for (i = 0;i < n;i = (i + 1) % n)
		{
			 if (p[i] != 0)
			 {
				  continue;
			 }
			 if (j++==m)

			 {
					   p[i] = 1;
					   k--;
					   j = 1;
			 }
			 if (k == 1)
			 {
				  break;
			 }
		}
	   i = 0;
	   for (;i < n;i++)
	   {
					if (p[i] == 0)
					{
					break;
					}
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(p);
	   return i + 1;

	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (m != 0 || n != 0)
		{


			 System.out.printf("%d\n",ysf(m, n));
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 n = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 m = Integer.parseInt(tempVar4);
			 }
		}

	}











}


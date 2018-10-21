package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int e;
		int f;
		int n;
		int i;
		char[][] a = new char[100][10];
		int[] b = new int[100];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (c = 0;c < n;c++)
		{
		  e = -1;
		  for (i = 0;i < n;i++)
		  {
			 if (b[i] >= 60)
			 {
			   if (b[i] > e)
			   {
				 e = b[i];
				 f = i;
			   }
			 }
		  }
			 if (e != -1)
			 {
			   System.out.printf("%s\n",a[f]);
			   b[f] = 0;
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] != 0)
			{
			   System.out.printf("%s\n",a[i]);
			}
		}
		System.in.read();
		System.in.read();
	}





}


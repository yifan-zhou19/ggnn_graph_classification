package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = -1;
		int t = -1;
		int k;
		int[] age = new int[100];
		int[] e = new int[100];
		int[] h = new int[100];
		char[][] a = new char[100][10];
		char[][] b = new char[100][10];
		char[][] c = new char[100][10];
		String f = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   age[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i <= (n - 1);i++)
		{
		  if (age[i] >= 60)
		  {

			s = s + 1;
			e[s] = age[i];
			 b[s] = a[i];
		  }
		  else
		  {

			  t = t + 1;
			  h[t] = age[i];
			   c[t] = a[i];

		  }
		}
		for (j = 0;j < s;j++)
		{
			 for (i = 0;i < s - j;i++)
			 {
			   if (e[i] < e[i + 1])
			   {
				  k = e[i];
				  e[i] = e[i + 1];
				  e[i + 1] = k;
				   f = b[i];
					b[i] = b[i + 1];
					 b[i + 1] = f;
			   }
			 }
		}
		  for (i = 0;i <= s;i++)
		  {
			System.out.printf("%s\n",b[i]);
		  }
		  for (i = 0;i <= t;i++)
		  {
			System.out.printf("%s\n",c[i]);
		  }
							   System.in.read();
							   System.in.read();
							   return 0;
	}

}


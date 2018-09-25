package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i = 1;
		int j = 1;
		int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[0] = Integer.parseInt(tempVar);
		 }
		 while (scanf(",%d", a[i]))
		 {
			 i++;
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b[0] = Integer.parseInt(tempVar2);
		 }
		 while (scanf(",%d", b[j]))
		 {
		 j++;
		 }
		  n = j;
		  for (i = 0;i < 1000;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
				  if (a[j] <= i != 0 && b[j]> i)
				  {
				  c[i]++;
				  }
			  }
		  }
		  j = 0;
		  for (i = 0;i < 1000;i++)
		  {
			  if (c[i] > c[j])
			  {
			   j = i;
			  }
		  }
		//if(c[j]==27)
	//{c[j]=c[j]+1;}
		  System.out.printf("%d %d",n,c[j]);
	  return 0;
	}
}


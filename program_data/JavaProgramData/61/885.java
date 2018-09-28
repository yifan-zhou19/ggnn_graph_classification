package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[1000];
		  a[0] = 1;
		  a[1] = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] s = new int[n];
		  for (int i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s[i] = Integer.parseInt(tempVar2);
			  }
		  if (s[i] == 1 || s[i] == 2)
		  {
			  System.out.printf("%d",a[1]);
		  }
		   else
		   {
			  for (int j = 2;j < s[i];j++)
			  {
			  a[j] = a[j - 1] + a[j - 2];
		  if (j == s[i] - 1)
		  {
			  System.out.printf("%d\n",a[j]);
		  }
			  }
		   }
		  }
	}


}


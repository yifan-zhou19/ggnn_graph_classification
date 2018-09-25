package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int l;
		 int i;
		 int j;
		 int x;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 l = 0;
		 int[] a = new int[20000];
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 }
		 for (j = 0;j < n;j++)
		 {
						  for (i = (j + 1);i < n;i++)
						  {
							 if (a[j] == a[i])
							 {
							 a[i] = '*';
							 }
						  }
		 }
		  if (a[n - 1] != '*')
		  {
						  for (i = 0;i < n - 1;i++)
						  {
						  if (a[i] != '*')
						  {
						   System.out.printf("%d ",a[i]);
						  }
						  }
			 System.out.printf("%d",a[n - 1]);
		  }
		else
		{
			  for (i = n - 1;i > 0;i--)
			  {
							if (a[i] == '*')
							{
								l = l + 1;
							}
							else
							{
								break;
							}
			  }
			  for (j = 0;j < n - l - 1;j++)
			  {
						  if (a[j] != '*')
						  {
						   System.out.printf("%d ",a[j]);
						  }
			  }
			 System.out.printf("%d",a[n - l - 1]);
		}






	}

}


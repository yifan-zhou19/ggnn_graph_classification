package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[100]);
	  char x;
	  char y;
	  int i;
	  int j;
	  int k;
	  int n;
	  int p;
	  int[] a = new int[100];
	  str = new Scanner(System.in).nextLine();
	  x = str.charAt(0);
	  i = 1;
	  for (i = 1;i <= 100;i++)
	  {
		if (a[i] == x)
		{
			continue;
		}
		else
		{
			break;
		}
	  }
	  y = str.charAt(i);
	  n = str.length();
	  for (i = 0;i <= n - 1;i++)
	  {
		if (str.charAt(i) == x)
		{
		  a[i] = 0;
		}
		else
		{
		  a[i] = 1;
		}
	  }
	  k = n;
	  while (k > 0)
	  {
		 p = 0;
		 for (i = 0;i <= n - 2;i++)
		 {
			if (a[i] == 0)
			{
			 for (j = i + 1;j <= n - 1;j++)
			 {
			   if (a[j] == 0)
			   {
				   break;
			   }
			   else
			   {
				 if (a[j] == 1)
				 {
					 a[i] = -1;
					 a[j] = -1;
					 k = k - 2;
					 System.out.printf("%d %d\n",i,j);
					 p = 1;
					 break;
				 }
			   }
			 }
			}
		   if (p == 1)
		   {
			   break;
		   }
		 }
	  }
	}
}

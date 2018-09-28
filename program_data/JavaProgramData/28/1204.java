package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i = 0;
	  int j;
	  int k = 0;
	  int[] a = new int[301];
	  int[] b = new int[301];
	  String c = new String(new char[3000]);
	  c = new Scanner(System.in).nextLine();
	  n = c.length();
	  while (i <= n)
	  {
		  if (c.charAt(i) != ' ')
		  {
			  i++;
		  }
	   if (c.charAt(i) == ' ')
	   {
		   break;
	   }
	   if (c.charAt(i) == '\0')
	   {
		   a[1] = -1;
	   }
	  }
	  a[1] = a[1] + i;
	  k = 1;
	  i = i + 1;
	  for (;i <= n;i++)
	  {
		  if (c.charAt(i) == ' ')
		  {
				   k = k + 1;
				   for (j = 1;j <= k - 1;j++)
				   {
					   b[k] = b[k] + a[j];
				   }
				   a[k] = i - b[k] - k + 1;
		  }
		  if (c.charAt(i) == '\0')
		  {
						  k = k + 1;
						  b[k] = b[k - 1] + a[k - 1];
						  a[k] = i - b[k] - k + 1;
						  break;
		  }
	  }
	  System.out.printf("%d",a[1]);
	  for (k = 2;k <= 300;k++)
	  {
		  if (a[k] != 0)
		  {
			  System.out.printf(",%d",a[k]);
		  }
	  }
	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int n;
			  int[] a = new int[500];
			  int i;
			  int j;
			  int k;
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 0;i < n;i++)
			  {
				  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  for (i = 0;i < n - 1;i++) //??????
			  {
				  for (j = 0;j < n - i - 1;j++)
				  {
					  if (a[j] > a[j + 1])
					  {
						  k = a[j];
						  a[j] = a[j + 1];
						  a[j + 1] = k;
					  }
				  }
			  }
			  for (i = 0;i < n;i++)
			  {
				  if (a[i] % 2 != 0)
				  {
				  System.out.print(a[i]);
				  break;
				  } //????
			  }
			  for (j = i + 1;j < n;j++)
			  {
				  if (a[j] % 2 != 0)
				  {
					  System.out.print(",");
					  System.out.print(a[j]);
				  }
			  }
			  return 0;
	}
}


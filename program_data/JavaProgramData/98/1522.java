package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;
		  char[][] a = new char[2000][50];
		  int[] length = new int[2000];
		  for (i = 0;i < n - 1;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = tempVar2.charAt(0);
			  }
			  length[i] = String.valueOf(a[i]).length();
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[n - 1] = tempVar3.charAt(0);
		  }
		  length[n - 1] = String.valueOf(a[n - 1]).length();
		  //int ed=0;
		  int total = 80;
		  for (i = 0;i < n;i++)
		  {
			  if (length[i] < total)
			  {
				if (i == n - 1)
				{
					System.out.printf("%s\n",a[i]);
				}
				else
				{
				  if (length[i] + length[i + 1] + 1 <= total)
				  {
					   System.out.printf("%s ",a[i]);
					   total = total - length[i] - 1;
				  }
				  else if (length[i] + length[i + 1] + 1 > total)
				  {
					   System.out.printf("%s\n",a[i]);
					   total = 80;
				  }
				}
			  }
			  else if (length[i] == total)
			  {
				  System.out.printf("%s\n",a[i]);
				  total = 80;
			  }
			  else if (length[i] > total)
			  {
				  System.out.print("\n");
				  i = i - 1;
				  total = 80;
			  }
		  }
		  //printf ("\n");
	}
}


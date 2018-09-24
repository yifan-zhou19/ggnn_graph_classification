package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] l = new int[2];
		int k;
	  char[][] a = new char[100][100];
	  char[][] b = new char[100][100];
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
			  b[i] = tempVar3.charAt(0);
		  }
		  if (i - n + 1 != 0)
		  {
			  System.out.print("\n");
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  l[0] = String.valueOf(a[i]).length();
		  l[1] = String.valueOf(b[i]).length();
		  for (k = 1;k < l[1] + 1;k++)
		  {
			  a[i][l[0] - k] = 48 + (int)a[i][l[0] - k] - (int)b[i][l[1] - k];
			  if (a[i][l[0] - k] < 48)
			  {
				  a[i][l[0] - k] += 10;
				  a[i][l[0] - k - 1] = (int)a[i][l[0] - k - 1] - 1;
			  }
		  }
		  for (k = 0;k < String.valueOf(a[i]).length();k++)
		  {
			  if (a[i][0] != 48)
			  {
				  System.out.printf("%c",a[i][k]);
			  }
			  else
			  {
				  System.out.printf("%c",a[i][k + 1]);
				  if (k == String.valueOf(a[i]).length() - 2)
				  {
					  break;
				  }
			  }
		  }
		  System.out.print("\n");
	  }
	}

}


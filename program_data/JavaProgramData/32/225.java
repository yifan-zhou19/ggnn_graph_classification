package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] str1 = new char[10][100];
	char[][] str2 = new char[10][100];
	int[] a = new int[10];
	int[] b = new int[10];
	int i;
	int j;
	int k;
	int n;
	int[] t = new int[100];
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
			 str1[i] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 str2[i] = tempVar3.charAt(0);
		 }
	  a[i] = String.valueOf(str1[i]).length();
	  b[i] = String.valueOf(str2[i]).length();
	}

	for (i = 0;i < n;i++)
	{
			for (j = 0;j < a[i];j++)
			{
	   if (j < a[i] - b[i])
	   {
		   t[j] = str1[i][j] - 48;
	   }
				else
				{
					t[j] = str1[i][j] - str2[i][j - a[i] + b[i]];
				}
			}
	  for (k = a[i] - 1;k >= 0;k--)
	  {
	   if (t[k] < 0)
	   {
		t[k - 1] = t[k - 1] - 1;
		t[k] = t[k] + 10;
	   }
	  }
	  for (k = 0;k < a[i];k++)
	  {
	   System.out.printf("%d",t[k]);
	  }
	  System.out.print("\n");
	}
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int m;
	 int i;
	 int j;
	 int flag = 0;
	 int[] n = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 char[][] a = new char[20][30];
	 for (i = 0;i < m;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = tempVar2.charAt(0);
		 }
	 }
	 for (i = 0;i < m;i++)
	 {
	 flag = 0;
	  if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_'))
	  {
		   n[i] = String.valueOf(a[i]).length();
		  for (j = 1;j < n[i];j++)
		  {
		   if ((a[i][j] < '0' || a[i][j]>'9') && (a[i][j] < 'a' || a[i][j]>'z') && (a[i][j] < 'A' || a[i][j]>'Z') && (a[i][j] != '_'))
		   {
			   System.out.print("no\n");
		   flag = 1;
		   break;
		   }
		  }
		  if (flag == 0)
		  {
			  System.out.print("yes\n");
		  }
	  }
		else
		{
		System.out.print("no\n");
		}
	 }

	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int n;
	  int m;
	  int i;
	  int l = 0;
	  int t;
	  int j;
	  int[] a = new int[1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < m;i++)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	  }
	  for (i = 0;i < m;i++)
	  {
		 t = n - a[i];
		for (j = i + 1;j < m;j++)
		{
			if (a[j] == t)
			{
			System.out.print("yes");
			l++;
			break;
			}
		}
	   if (l > 0)
	   {
		   break;
	   }
	  }
	   if (l == 0)
	   {
			System.out.print("no");
	   }

	return 0;
	}
}


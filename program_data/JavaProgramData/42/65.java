package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
	  int[] t = new int[100000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t[i] = Integer.parseInt(tempVar2);
		 }
	  }
	  System.out.print("\n");
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
		 if (t[i] == k)
		 {
			 t[i] = 'a';
		 }
	  }
	  if (n == 1)
	  {
		  if (t[0] != 'a')
		  {
			  System.out.printf("%d",t[0]);
		  }
	  }
	  else
	  {
		  for (i = 0;i <= (n - 1);i++)
		  {
			 if (t[i] != 'a')
			 {
			   System.out.printf("%d",t[i]);
			for (j = (i + 1);j <= (n - 1);j++)
			{
			if (t[j] != 'a')
			{
				System.out.printf(" %d",t[j]);
			}
			}
			break;
			 }
		  }
	  }
	}
}


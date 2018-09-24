package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
	  char[][] ar = new char[300][20];
	  for (i = 0;i < 300;i++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   ar[i] = tempVar.charAt(0);
	   }
	  }
	  for (i = 0;i <= 299;i++)
	  {
		   n = String.valueOf(ar[i]).length();
		if (n != 0)
		{
			k = i;
		}
		else
		{
			break;
		}
	  }
	  for (i = 0;i <= k - 1;i++)
	  {
	   System.out.printf("%d,",String.valueOf(ar[i]).length());
	  }
	  System.out.printf("%d",String.valueOf(ar[k]).length());
	}



}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[400];
	  int i;
	  int n;
	  int j;
	  int t;
	  char c;
	   for (i = 0;;i++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  num[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		if (c != ',')
		{
			break;
		}
	   }
	  n = i + 1;
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < n - i - 1;j++)
	   {
		  if (num[j] < num[j + 1])
		  {
			 t = num[j];
			num[j] = num[j + 1];
			num[j + 1] = t;
		  }
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
		if (num[i] < num[0])
		{
		System.out.printf("%d",num[i]);

	 break;
		}
	  }
		if (i == n)
		{
			System.out.print("No");
		}
	return 0;
	}

}


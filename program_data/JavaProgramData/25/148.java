package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int k = 1;
	  int n;
	  int[] b = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  b[99] = 1;
	  for (i = 0;i < n;i++)
	  {
		  for (j = 99;j >= 0;j--)
		  {
		  b[j] = b[j] * 2;
		  }

		  for (j = 99;j >= 0;j--)
		  {
				if (b[j] > 9)
				{
					b[j] = b[j] - 10;
				b[j - 1]++;
				}
		  }
	  }
	  for (i = 0;i < 100;i++)
	  {
		  if (b[i] > 0)
		  {
		  break;
		  }
	  }
	  for (j = i;j < 100;j++)
	  {
	  System.out.printf("%d",b[j]);
	  }
	}

}


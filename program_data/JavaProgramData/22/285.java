package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] num = new int[300];
		  int n;
		  int N;
		  int i;
		  int max;
		  char ch;
		  n = 0;
		  do
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  num[n] = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar2 != null)
			  {
				  ch = tempVar2.charAt(0);
			  }
			   n = n + 1;
		  } while (ch == ',');
		  N = n;
		  max = 0;
		  for (i = 0;i < N;i++)
		  {
			if (num[i] > max)
			{
			 max = num[i];
			}
		  }
		  for (i = 0;i < N;i++)
		  {
			if (max == num[i])
			{
			 num[i] = 0;
			}
		  }
		  max = 0;
		  for (i = 0;i < N;i++)
		  {
			if (num[i] > max)
			{
			  max = num[i];
			}
		  }
		  if (max != 0)
		  {
		   System.out.printf("%d",max);
		  }
		  else
		  {
		   System.out.print("No");
		  }
	}
}


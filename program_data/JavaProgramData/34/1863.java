package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int[] n = new int[100000];
	  int i;
	  int p = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  n[0] = a;
	  if (a == 1)
	  {
		System.out.print("End");
	  }
	  else
	  {
		for (i = 0;n[i] != 1;i++)
		{
		  if (n[i] % 2 != 0)
		  {
			n[i + 1] = n[i] * 3 + 1;
			if (p == 0)
			{
			  System.out.printf("%d*3+1=%d",n[i],n[i + 1]);
			  p++;
			}
			else
			{
			  System.out.printf("\n%d*3+1=%d",n[i],n[i + 1]);
			}
		  }
		  else
		  {
			n[i + 1] = n[i] / 2;
			if (p == 0)
			{
			  System.out.printf("%d/2=%d",n[i],n[i + 1]);
			  p++;
			}
			else
			{
			  System.out.printf("\n%d/2=%d",n[i],n[i + 1]);
			}
		  }
		}
		System.out.print("\nEnd");
	  }
	  return 0;
	}
}


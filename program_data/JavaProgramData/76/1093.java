package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  // for every point i, point[2i] stands for [i,i], point[2i+1] stands for (i,i+1)
	  // if point[i] == 1, it stands that this interval is included
	  int n;
	  int[] point = new int[2001];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  int left = 2001;
	  int right = 0;
	  for (i = 1 * 2; i <= 1000 * 2; i++)
	  {
		point[i] = 0;
	  }
	  for (i = 1; i <= n; i++)
	  {
		  int a;
		  int b;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if (a < left)
		  {
		left = a; // find the leftest point
		  }
		  if (b > right)
		  {
		right = b; // find the rightest point
		  }
		  int j;
		  for (j = a * 2; j <= b * 2; j++)
		  {
		point[j] = 1;
		  }
	  }
	  int in = 0; // if in an interval, then value is 1, or the value is 0
	  int num = 0; // number of interval(s)
	  for (i = 1 * 2; i <= 1000 * 2; i++)
	  {
		if (point[i] == 1)
		{
		if (in == 0)
		{
			in = 1;
			num++;
		}
		}
		else
		{
		  if (in == 1)
		  {
		in = 0;
		  }
		}
	  }
	  if (num == 1)
	  {
		System.out.printf("%d %d\n", left, right);
	  }
	  else
	  {
		System.out.print("no\n");
	  }

	  return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int judge(int a)
	{
		if (((a % 100 != 0) && (a % 4 == 0)) || (a % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int a;
		  int b;
		  int c;
		  int i;
		  int j;
		  int x;
		  int n;
		  int day;
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
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  c = Integer.parseInt(tempVar4);
			  }
			  if (b > c)
			  {
				  x = b;
				  b = c;
				  c = x;
			  }
			  x = judge(a);
			  day = 0;
			  for (j = b;j <= c - 1;j++)
			  {
				  day = day + d[j - 1];
				  if ((j == 2) && (x == 1))
				  {
					  day++;
				  }
			  }
			  if (day % 7 == 0)
			  {
				  System.out.print("YES\n");
			  }
			  else
			  {
				  System.out.print("NO\n");
			  }
			  /*printf("%d\n",day);*/
		  }

	}

}


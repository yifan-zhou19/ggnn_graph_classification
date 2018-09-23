package <missing>;

public class GlobalMembers
{
	public static int m(int n)
	{
		if (n % 100 != 0)
		{
					 if (n % 4 == 0)
					 {
					 return (1);
					 }
					 else
					 {
					 return (0);
					 }
		}
		else
		{
			if (n % 400 == 0)
			{
			return (1);
			}
			else
			{
			return (0);
			}
		}

	}
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int x = 0;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  if (m(a) == 1)
		  {
					 int[] d = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
					 for (i = 1;i < b;i++)
					 {
					 x = x + d[i - 1];
					 }
					 x = x + c;
		  }
		  else
		  {
					 int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
									  for (i = 1;i < b;i++)
									  {
					 x = x + d[i - 1];
									  }
					 x = x + c;
		  }
		  System.out.printf("%d",x);
		  System.in.read();
		  System.in.read();
	}

}


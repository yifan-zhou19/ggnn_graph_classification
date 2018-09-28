package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hui = int i;
		int su = int i;
	int m;
	int n;
	int i;
	int j;
	int k;
	int l;
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
	for (i = n;i >= m;i--)
	{
		if (hui(i) == 1 && su(i) == 1)
		{
			break;
		}
	}
	for (j = m;j < i;j++)
	{
		if (hui(j) == 1 && su(j) == 1)
		{
			System.out.printf("%d,",j);
		}
	}
	if (i == m - 1)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d",i);
	}
	}
	 public static int hui(int i)
	 {
		 int m = 0;
		 int j;
		 int temp;
		 temp = i;
		 while (temp != 0)
		 {
			 j = temp % 10;
			 m = m * 10 + j;
			 temp = temp / 10;
		 }
		 if (m == i)
		 {
			 return (1);
		 }
		 else
		 {
			 return (0);
		 }
	 }
	  public static int su(int i)
	  {
		  int a;
		  int s;
		  int d;
		  a = Math.sqrt(i);
		  for (s = 2;s <= a;s++)
		  {
			  if (i % s == 0)
			  {
				  break;
			  }
		  }
		   if (i % s == 0)
		   {
			   return (0);
		   }
		   else
		   {
			   return (1);
		   }
	  }
}


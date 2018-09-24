package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int i;
	 int j;
	 int k;
	 int n;
	 int[] x = new int[20];
	 int[] y = new int[20];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 x[0] = a,y[0] = b;
	 for (i = 1;i < 15;i++)
	 {
	  if (a == 1)
	  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loop;
	  }
	  if (a % 2 != 0)
	  {
	   a = (a - 1) / 2;
	   x[i] = a;
	  }
	  else if (a % 2 == 0)
	  {
	   a = a / 2;
	   x[i] = a;
	  }
	 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 loop:
	 for (n = 1;n < 15;n++)
	 {
	  if (b == 1)
	  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loap;
	  }
	  if (b % 2 != 0)
	  {
	   b = (b - 1) / 2;
	   y[n] = b;
	  }
	  else if (b % 2 == 0)
	  {
	   b = b / 2;
	   y[n] = b;
	  }
	 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  loap:
	  for (j = 0;j < i;j++)
	  {
	   for (k = 0;k < n;k++)
	   {
		if (x[j] == y[k])
		{
		System.out.printf("%d",x[j]);
		break;
		}
	   }
	if (x[j] == y[k])
	{
		break;
	}
	  }
	}
}


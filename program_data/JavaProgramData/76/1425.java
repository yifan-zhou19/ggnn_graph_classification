package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] zuo = new int[10000];
	  int[] you = new int[10000];
	  int n;
	  int i;
	  int j;
	  int a;
	  int b = 0;
	  double s;
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
			   zuo[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   you[i] = Integer.parseInt(tempVar3);
		   }
		   if (b < you[i])
		   {
			   b = you[i];
		   }
	  }
	   a = zuo[0];
	   for (i = 1;i < n;i++)
	   {
	if (a > zuo[i])
	{
		a = zuo[i];
	}
	   }
	   for (s = a + 0.5;s < b;s++)
	   {
		  for (j = 0;j < n;j++)
		  {
			 if (zuo[j] < s && you[j]> s)
			 {
				 break;
			 }
			 else
			 {
				 continue;
			 }
		  }
	if (j == n)
	{
		break;
	}
	   }

	   if (s > b)
	   {
		   System.out.printf("%d %d",a,b);
	   }
		else
		{
			System.out.print("no");
		}
	   return 0;
	}




}


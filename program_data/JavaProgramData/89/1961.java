package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k;
		  int l;
		  int[][] m = new int[99999][2]; //??????????? ????????9999999????��
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   m[i][0] = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   m[i][1] = Integer.parseInt(tempVar3);
					   }
					   if (m[i][0] + m[i][1] == 0)
					   {
					   break;
					   }
		  }
		  for (k = 0;k < n;k++)
		  {
			   int p = 0;
			   int q = 0;
			   for (l = 0;l <= i - 1;l++)
			   {
							 if (k == m[l][1])
							 {
							 p++;
							 }
			   }
			   for (l = 0;l <= i - 1;l++)
			   {
							 if (k == m[l][0])
							 {
							 break;
							 }
							 else
							 {
							 q++;
							 }
			   }
			   if (p == n - 1 && q == i)
			   {
								System.out.printf("%d",k);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto end;
			   }
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  end:
		  if (k == n)
		  {
		  System.out.print("NOT FOUND");
		  }
	}

}


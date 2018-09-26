package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct piece
	//   {
	//	   int a,b;
	//   }
	//   max,require,s[500],ex;
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
			   (s[i].a) = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (s[i].b) = tempVar3;
		   }
		}
		require = s[0];
	   for (i = 0;i < n;i++)
	   {
		  if (s[i].a < require.a)
		  {
			   require.a = s[i].a;
		  }
		  if (s[i].b > require.b)
		  {
			   require.b = s[i].b;
		  }
	   }
			 for (i = 0;i <= n - 2;i++)
			 {
		 for (j = 0;j <= n - i - 2;j++)
		 {
			  if ((s[j].a) > (s[j + 1].a))
			  {
				ex = s[j + 1];
				s[j + 1] = s[j];
				s[j] = ex;
			  }
		 }
			 }
	   max = s[0];
			 for (i = 0;i < n;i++)
			 {
		 if ((s[i].b > max.b) && (s[i].a <= max.b))
		 {
			max.b = s[i].b;
		 }
			 }
		if ((max.a == require.a) && (max.b == require.b))
		{
			  System.out.printf("%d %d",max.a,max.b);
		}
	   else
	   {
		 System.out.print("no");
	   }
		 return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	   int a;
	//	   int b;
	//	}
	//	a[100],x;
		int j;
		int n;
		int i;
		int flag = 1;
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
			  a[i].a = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i].b = tempVar3;
		  }
		}
		x = a[0];
		a[0].a = 0;
		a[0].b = 0;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
			   if (x.a >= a[i].a && x.a <= a[i].b && x.b >= a[i].b)
			   {
				 x.a = a[i].a;
				 a[i].a = 0;
				 a[i].b = 0;
				 break;
			   }
			   else if (x.a >= a[i].a && x.b <= a[i].b)
			   {
					x.a = a[i].a;
					x.b = a[i].b;
				 a[i].a = 0;
				 a[i].b = 0;
				 break;
			   }
			   else if (x.a <= a[i].a && x.b >= a[i].a && x.b <= a[i].b)
			   {

					x.b = a[i].b;
				 a[i].a = 0;
				 a[i].b = 0;
				 break;
			   }
			   else if (x.a <= a[i].a && x.b >= a[i].b)
			   {

				 a[i].a = 0;
				 a[i].b = 0;
				 break;
			   }


			}

		}
		for (i = 0;i < n;i++)
		{
		  if (a[i].a != 0 || a[i].b != 0)
		  {
			flag = 0;
		  }
		}
		if (flag != 0)
		{
		   System.out.printf("%d %d",x.a,x.b);
		}
		  else
		  {
			System.out.print("no");
		  }
		return 0;

	}
}


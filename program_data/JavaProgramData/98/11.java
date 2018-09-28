package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct z
	//	  {
	//		  char a[40];
	//		  int l;
	//	  }
	//	  z[1000];
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
				  z[i].a = tempVar2;
			  }
			  z[i].l = String.valueOf(z[i].a).length();
		  }
		  for (i = 0;i < n - 1;i++)
		  {


					  s = s + z[i].l;
					  System.out.printf("%s",z[i].a);


				  if (s + z[i + 1].l >= 80)
				  {
					  System.out.print("\n");
					  s = 0;
				  }
				  else
				  {
					  System.out.print(" ");
				  s++;
				  }


		  }
		  System.out.printf("%s",z[n - 1].a);





		return 0;
	}




}


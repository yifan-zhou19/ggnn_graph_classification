public class student
 {
	 public int id;
   public int a;
   public int b;
   public int zong;
 }

package <missing>;

public class GlobalMembers
{
	 public static student[] ren = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	 public static int Main()
	 {
		 int n;
		 int i;
		 int fen;
		 int flag = 0;
		 int j;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   ren[i].id = Integer.parseInt(tempVar2);
		   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ren[i].a = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ren[i].b = Integer.parseInt(tempVar4);
		}
		ren[i].zong = ren[i].a + ren[i].b;
	   }

	   for (fen = 200;fen >= 100;fen--)
	   {
		   for (i = 0;i <= n - 1;i++)
		   {
		  if (fen == ren[i].zong)
		  {
			  System.out.printf("%d %d\n",ren[i].id,ren[i].zong);
		   flag = flag + 1;
		   if (flag == 3)
		   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto end;
		   }

		  }
		   }
	   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  end:
	  System.in.read();

	 }
}


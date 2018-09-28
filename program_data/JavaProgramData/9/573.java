package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] age = new int[100];
		char[][] num = new char[100][10];
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  age[i] = Integer.parseInt(tempVar3);
		  }
		  if (age[i] < 60)
		  {
		  age[i] = 0;
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		for (i = 0;i < n;i++)
		{
		  x = 0;
		  if (age[i] >= 60)
		  {
			   for (int j = 0;j < n;j++)
			   {
				   if (age[j] > age[i])
				   {
						x = x + 1;
				   }
			   }
			   if (x == 0)
			   {
				   System.out.printf("%s\n",num[i]);
				 age[i] = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				 goto loop;
			   }
		  }
		}
		 for (i = 0;i < n;i++)
		 {
		  if (age[i] == 0)
		  {
		  System.out.printf("%s\n",num[i]);
		  }
		 }
		 System.in.read();
		 System.in.read();
	}
}


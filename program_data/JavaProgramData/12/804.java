package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int[] a = new int[17];
		 int h;
		 int i;
		 int j;
		 int x = 1;
		 int s;
		 while (x != 0)
		 {
		   for (i = 1;i < 17;i++)
		   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		   if (a[i] == -1)
		   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto end;
		   }
		   if (a[i] == 0)
		   {
			   h = i;
			   break;
		   }
		   continue;
		   }

		  if (x != 0)
		  {
			  s = 0;
		   for (i = 1;i < h - 1;i++)
		   {
				for (j = i + 1;j < h;j++)
				{
			 if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
			 {
			 s++;
			 }
				}
		   }
		  }
		   System.out.printf("%d\n",s);
		 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   end:
		   return 0;
	}

}


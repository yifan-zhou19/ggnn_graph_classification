package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int start = 0;
		int end;
		int p1 = 0;
		int p2 = 0;
		int x1;
		int x2;
		float a;
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		end = n - 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	 {
	//		 char sex[6];
	//	  float height;
	//	 }
	//	 s[40],t;
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s[i].sex = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 s[i].height = tempVar3;
		 }
		}
		while (start <= end)
		{
			 a = b = 3F;
		  for (i = start;i <= end;i++)
		  {
			   if (s[i].sex[0] == 'm')
			   {
				 p1 = 1;
			  if (s[i].height < a)
			  {
				   x1 = i;
				   a = s[i].height;
			  }
			   }
			else
			{
				 p2 = 1;
			  if (s[i].height < b)
			  {
				   x2 = i;
				   b = s[i].height;
			  }
			}
		  }
		  if (p1 != 0)
		  {
			   t = s[x1];
			   s[x1] = s[start];
			   s[start] = t;
			if (x2 == start)
			{
			 x2 = x1;
			}
			start++;
			p1 = 0;
		  }
		  if (p2 != 0)
		  {
			   t = s[x2];
			   s[x2] = s[end];
			   s[end] = t;
			   end--;
			   p2 = 0;
		  }
		}
		for (i = 0;i < n;i++)
		{
			 if (i > 0)
			 {
		   System.out.print(" ");
			 }
		  System.out.printf("%.2f",s[i].height);
		}
	}
}


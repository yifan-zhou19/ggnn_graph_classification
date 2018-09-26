package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int y;
	  int m1;
	  int m2;
	  char year;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		int[] a = {1, 3, 5, 7, 8, 10, 12};
		int s = 0;
		int t = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			year = 't';
		}
		else
		{
			year = 'f';
		}
		if (year == 'f')
		{
		   if (m1 > m2)
		   {
			 for (int k = m2;k < m1;k++)
			 {
				for (int j = 0;j < 7;j++)
				{
				  if (a[j] == k)
				  {
					  t = 1;
				  }
				}
				if (t == 1)
				{
					s = s + 31;
				}
				  else if (k == 2)
				  {
					  s = s + 28;
				  }
					   else
					   {
						   s = s + 30;
					   }
				t = 0;
			 }
		   }
		   else
		   {
			 for (int k = m1;k < m2;k++)
			 {
				for (int j = 0;j < 7;j++)
				{
				  if (k == a[j])
				  {
					  t = 1;
				  }
				}
				if (t == 1)
				{
					s = s + 31;
				}
				  else if (k == 2)
				  {
					  s = s + 28;
				  }
					   else
					   {
						   s = s + 30;
					   }
				  t = 0;
			 }
		   }
		}
		else
		{
		   if (m1 > m2)
		   {
			 for (int k = m2;k < m1;k++)
			 {
				for (int j = 0;j < 7;j++)
				{
				  if (a[j] == k)
				  {
					  t = 1;
				  }
				}
				if (t == 1)
				{
					s = s + 31;
				}
				  else if (k == 2)
				  {
					  s = s + 29;
				  }
					   else
					   {
						   s = s + 30;
					   }
					   t = 0;
			 }
		   }
		   else
		   {
			 for (int k = m1;k < m2;k++)
			 {
			   for (int j = 0;j < 7;j++)
			   {
				  if (a[j] == k)
				  {
					  t = 1;
				  }
			   }
				if (t == 1)
				{
					s = s + 31;
				}
				  else if (k == 2)
				  {
					  s = s + 29;
				  }
					   else
					   {
						   s = s + 30;
					   }
					   t = 0;
			 }
		   }
		}
	   if (s % 7 == 0)
	   {
		   System.out.print("YES\n");
	   }
	   else
	   {
		   System.out.print("NO\n");
	   }
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}


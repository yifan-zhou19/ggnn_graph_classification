package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   c = Integer.parseInt(tempVar3);
	   }
	   if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
	   {
		  if (b == 1)
		  {
			s = c;
		  }
		else if (b == 2)
		{
			s = 31 + c;
		}
		else if (b == 3)
		{
			s = 59 + c;
		}
		else if (b == 4)
		{
			s = 90 + c;
		}
		else if (b == 5)
		{
			s = 120 + c;
		}
		else if (b == 6)
		{
			s = 151 + c;
		}
		else if (b == 7)
		{
			s = 181 + c;
		}
		else if (b == 8)
		{
			s = 212 + c;
		}
		else if (b == 9)
		{
			s = 243 + c;
		}
		else if (b == 10)
		{
			s = 273 + c;
		}
		else if (b == 11)
		{
			s = 304 + c;
		}
		else if (b == 12)
		{
			s = 334 + c;
		}
	   }
		else if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			 if (b == 1)
			 {
			 s = c;
			 }
		  else if (b == 2)
		  {
			 s = 31 + c;
		  }
		  else if (b == 3)
		  {
			 s = 60 + c;
		  }
		  else if (b == 4)
		  {
			 s = 91 + c;
		  }
		  else if (b == 5)
		  {
			 s = 121 + c;
		  }
		  else if (b == 6)
		  {
			 s = 152 + c;
		  }
		  else if (b == 7)
		  {
			 s = 182 + c;
		  }
		  else if (b == 8)
		  {
			 s = 213 + c;
		  }
		  else if (b == 9)
		  {
			 s = 244 + c;
		  }
		  else if (b == 10)
		  {
			 s = 274 + c;
		  }
		  else if (b == 11)
		  {
			 s = 305 + c;
		  }
		  else if (b == 12)
		  {
			 s = 335 + c;
		  }
		}
		System.out.printf("%d",s);
		return 0;
	}



}


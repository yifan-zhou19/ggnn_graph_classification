package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
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
		if (((a % 4 == 0) && (a % 100) != 0) || (a % 400 == 0))
		{
		  if (b == 1)
		  {
			  d = c;
		  }
		  else if (b == 2)
		  {
			  d = 31 + c;
		  }
		  else if (b == 3)
		  {
			  d = 60 + c;
		  }
		  else if (b == 4)
		  {
			  d = 91 + c;
		  }
		  else if (b == 5)
		  {
			  d = 121 + c;
		  }
		  else if (b == 6)
		  {
			  d = 152 + c;
		  }
		  else if (b == 7)
		  {
			  d = 182 + c;
		  }
		  else if (b == 8)
		  {
			  d = 213 + c;
		  }
		  else if (b == 9)
		  {
			  d = 244 + c;
		  }
		  else if (b == 10)
		  {
			  d = 274 + c;
		  }
		  else if (b == 11)
		  {
			  d = 305 + c;
		  }
		  else if (b == 12)
		  {
			  d = 335 + c;
		  }


		}
		else
		{
		  if (b == 1)
		  {
			  d = c;
		  }
		  else if (b == 2)
		  {
			  d = 31 + c;
		  }
		  else if (b == 3)
		  {
			  d = 59 + c;
		  }
		  else if (b == 4)
		  {
			  d = 90 + c;
		  }
		  else if (b == 5)
		  {
			  d = 120 + c;
		  }
		  else if (b == 6)
		  {
			  d = 151 + c;
		  }
		  else if (b == 7)
		  {
			  d = 181 + c;
		  }
		  else if (b == 8)
		  {
			  d = 212 + c;
		  }
		  else if (b == 9)
		  {
			  d = 243 + c;
		  }
		  else if (b == 10)
		  {
			  d = 273 + c;
		  }
		  else if (b == 11)
		  {
			  d = 304 + c;
		  }
		  else if (b == 12)
		  {
			  d = 334 + c;
		  }

		}

		System.out.printf("%d\n",d);
	}




}


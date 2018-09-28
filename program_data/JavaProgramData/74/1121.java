package <missing>;

public class GlobalMembers
{
	   public static int fanc1(int a)
	   {
		  int j = 1;
		  int n = 0;
		 while (Math.pow(10,j) <= a)
		 {
			n = ++j;
		 }
	   return (n);
	   }


	public static int fanc2(int a)
	{
		int m;
		m = Math.pow(10,(fanc1(a) - 1));
		if (a / 10 == 0 || a / 10 == a % 10)
		{
			return (2);
		}
		else if (a / m != a % 10)
		{
			return (1);
		}
		else
		{
			if (((a * 10) / m) % 10 == 0 && (a / 10) % 10 != 0)
			{
				return (1);
			}
		  else if (((a * 10) / m) % 10 == 0 && (a / 10) % 10 == 0)
		  {
			  a = (a % (m / 10)) / (m / 10);
			  return (fanc2(a));
		  }
		  else
		  {
			  a = (a % m) / 10;
			  return (fanc2(a));
		  }
		}
	}


	public static int fanc3(int x)
	{
		int i;
		int j = 0;
	 for (i = 2;i < x;i++)
	 {
		 if (x % i == 0)
		 {
			 j++;
		 }
	 }
	 if (j == 0)
	 {
		 return (0);
	 }
	 else
	 {
		 return (1);
	 }
	}



	public static int Main()
	{
	  int m;
	  int n;
	  int o;
	  int i;
	  int j;
		 o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
	for (i = m;i <= n;i++)
	{
		 if (fanc2(i) != 1 && fanc3(i) == 0)
		 {
			 o = o + 1;
		 }
	}
		  if (o == 0)
		  {
			  System.out.print("no");
		  }
		  else
		  {
		 for (i = m;i <= n;i++)
		 {
		   if (fanc2(i) != 1 && fanc3(i) == 0)
		   {
		   System.out.printf("%d",i);
		   j = i;
		   break;
		   }
		 }
			for (i = j + 1;i <= n;i++)
			{
				if (fanc2(i) != 1 && fanc3(i) == 0)
				{
					System.out.printf(",%d",i);
				}
			}
		  }

	return 0;
	}













}


package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y)
	{
	   int i;
	   int num = 0;
	   if (y == 1)
	   {
		 return 0;
	   }
	  else
	  {
	   if (x % y != 0)
	   {
		return 0;
	   }
	   else if (x == y)
	   {
		return 1;
	   }
	   else
	   {
		 for (i = y;i >= 1;i--)
		 {
		   num += f(x / y, i); //??
		 }

		 return num;
	   }

	  }
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??
		{
		  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  sum = 0; //???
		for (j = 1;j <= a;j++)
		{
		 sum += f(a, j); //??
		}

		System.out.print(sum);
		System.out.print("\n");

		}
		return 0;
	}
		/* 
		  ???????????? 
		  ?100?? 
		  sum=???? 
		  f(100,100)=1   ??100=100 
		  f(100,99) =0
		  f(100,98)=0
		  ....
		  ....
		  f(100,50)=f(2,50)+f(2,49)+........+f(2,2)+f(2,1) =1   ?????50????f(2,2)?1,?????? 
		  ....
		  ....
		 f(100,2) =  f(50,2)+f(50,1)=f(25,2)+0=0
		 f(100,1) =0
		 ????? ?????????????? 
	  */  
}


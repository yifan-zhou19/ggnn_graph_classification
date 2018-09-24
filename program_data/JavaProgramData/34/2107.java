package <missing>;

public class GlobalMembers
{
	/**
	* @file 4.cpp
	* @auther ???
	* @date   2011/10/26
	* @description
	*      ????????????????? 
	*/ 


	public static int suan1(int p)
	{
	System.out.print(p);
	System.out.print("*");
	System.out.print(3);
	System.out.print("+");
	System.out.print(1);
	System.out.print("=");
	System.out.print(p * 3 + 1);
	System.out.print("\n");
	return (p * 3 + 1);

	}

	public static int suan2(int p)
	{
	System.out.print(p);
	System.out.print("/");
	System.out.print(2);
	System.out.print("=");
	System.out.print(p / 2);
	System.out.print("\n");
	return (p / 2);

	}

	public static int Main()
	{
	 int t;
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	 while (t > 1)
	 {
	   if (t % 2 == 0)
	   {
		  t = suan2(t);
	   }
	   else
	   {
		   t = suan1(t);
	   }


	 }
	 System.out.print("End");
		return (0);


	}

}


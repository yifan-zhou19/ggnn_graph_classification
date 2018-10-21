package <missing>;

public class GlobalMembers
{
	//***************************************
	//* ???5.cpp  **
	//* ??????  1200012971  **
	//* ????????????????? **
	//* ???2012.10.10 **
	//****************************************
	public static int Main()
	{
		int i; //??n????a????b???????t,T?????
		int n;
		int a;
		int b;
		int t = 0;
		int T = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a <= 140 && a >= 90 && b >= 60 && b <= 90) //????????
			{
				t = t + 1; //????????
			}
			else

			{
				if (t >= T) //??????t????T???t????0
				{
					T = t;
				}
				t = 0;
			}
		}
	   if (t >= T)
	   {
		   System.out.print(t);
		   System.out.print("\n");
	   }
	   else
	   {
		   System.out.print(T);
		   System.out.print("\n");
	   }
		return 0;
	}






}


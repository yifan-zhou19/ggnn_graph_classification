package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
	   for (int i = 2;i <= Math.sqrt(k);i++)
	   {
		  if (k % i == 0)
		  {
			 return 1;
			 break;
		  }
	   }
		return 0;
	}
	public static int Main()
	{
	   int m = 0; //m??????
	   int i = 0; //i,j???????
	   int j = 0;
	   int numb = 0; //numb?i,m-i????????
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 3;i <= m / 2;i += 2)
	   {
			 j = m - i;
			 numb = sushu(i) + sushu(j);
			 if (numb == 0)
			 {
			 System.out.print(i);
			 System.out.print(' ');
			 System.out.print(j);
			 System.out.print("\n");
			 }
	   }
		return 0;
	}
}


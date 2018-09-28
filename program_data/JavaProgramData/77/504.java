package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cur = 0;
		int[] stack = new int[100];
		int sum = 0;
	 char x;
	 char sign;
	 sign = cin.peek();
	 do
	 {
	  x = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  if (x == sign)
	  {
	   stack[cur++] = sum++;
	  }
	  else
	  {
	   System.out.print(stack[--cur]);
	   System.out.print(' ');
	   System.out.print(sum++);
	   System.out.print("\n");
	  }
	 }while (cur > 0);
	 return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int f(int s,int num) //s?????num?????
	{
		 if (s == num)
		 {
			 return 1;
		 }
		 if (s < num)
		 {
		  for (int i = s;i <= num;i++)
		  {
			if (num % i == 0)
			{
			  if (i < num)
			  {
				  return f(i, num / i) + f(i + 1, num);
			  }
			  if (i == num)
			  {
				  return 1;
			  }
			}
		  }
		 }
		 if (s > num)
		 {
			 return 0;
		 }
	}
	public static int Main()
	{
		int n;
		int i;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(2, num));
			System.out.print("\n");
		}
		return 0;
	}
}

